package practicum8b;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HotelGUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage scherm) {
        scherm.setTitle("Tweepersoonsboekingen");
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15, 15, 15, 15));

        Text title = new Text("Voer uw gegevens in!");
        grid.add(title, 0, 0, 2, 1);

        // Field 1
        Label userName = new Label("naam:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        userTextField.setPrefWidth(200);
        grid.add(userTextField, 2, 1);

        // Field 2
        Label address = new Label("adres:");
        grid.add(address, 0, 2);
        TextField addressBox = new TextField();
        addressBox.setPrefWidth(200);
        grid.add(addressBox, 2, 2);

        // Field 3
        Label arriveDate = new Label("aankomstdatum:");
        grid.add(arriveDate, 0, 3);
        DatePicker arriveDateBox = new DatePicker();
        arriveDateBox.setValue(LocalDate.now());
        arriveDateBox.setPrefWidth(200);
        grid.add(arriveDateBox, 2, 3);

        // Field 4
        Label departureDate = new Label("vertrekdatum:");
        grid.add(departureDate, 0, 4);
        DatePicker departureDateBox = new DatePicker();
        departureDateBox.setValue(LocalDate.now().plusDays(1));
        departureDateBox.setPrefWidth(200);
        grid.add(departureDateBox, 2, 4);

        // Field 5
        Label roomType = new Label("kamertype:");
        grid.add(roomType, 0, 5);
        final ComboBox roomTypeBox = new ComboBox();
        roomTypeBox.getItems().addAll(
                "Standaard, bedden: 2, € 60.0 p.n.",
                "DeLuxe, bedden: 2, € 85.0 p.n."
        );
        roomTypeBox.setPrefWidth(200);
        grid.add(roomTypeBox, 2, 5);

        // Buttons
        Button resetButton = new Button("reset");
        Button boekButton = new Button("boek");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(resetButton);
        hbBtn.getChildren().add(boekButton);
        grid.add(hbBtn, 2, 6);


        // Reset fields using reset button
        resetButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                userTextField.clear();
                addressBox.clear();
                arriveDateBox.setValue(LocalDate.now());
                departureDateBox.setValue(LocalDate.now().plusDays(1));
                roomTypeBox.setValue(null);
            }
        });

        // Scherm
        Scene schermAfmetingen = new Scene(grid, 350, 250);
        scherm.setScene(schermAfmetingen);
        scherm.setResizable(false);
        scherm.show();

        // Boeking toevoegen
        Hotel h = new Hotel("Avondrood");

        boekButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                LocalDate van = arriveDateBox.getValue();
                LocalDate tot = departureDateBox.getValue();


                // Checks fields
                if(userTextField.getText().trim().isEmpty()) {
                    title.setText("Naam mag niet leeg zijn!");
                }
                else if(addressBox.getText().trim().isEmpty()) {
                    title.setText("Adres mag niet leeg zijn!");
                }
                else if(van.isBefore(LocalDate.now())) {
                    title.setText("Aankomstdatum mag niet in het verleden liggen!");
                }
                else if(tot.isBefore(LocalDate.now())) {
                    title.setText("Vertrekdatum mag niet in het verleden liggen!");
                }
                else if(!tot.isAfter(van)) {
                    title.setText("Vertrekdatum moet na de aankomstdatum liggen!");
                }
                else if(roomTypeBox.getValue() == null) {
                    title.setText("Kamertype mag niet leeg zijn!");
                }
                else {
                    // Add booking
                    KamerType kt = h.getKamerTypen().get(0); // eerste type in lijst
                    int nr = h.voegBoekingToe(van, tot, userTextField.getText(), addressBox.getText(), kt);

                    if (nr != -1) {
                        System.out.println("Boeking krijgt kamernummer: " + nr);
                    } else {
                        System.out.println("Er is helaas geen kamer beschikbaar");
                    }
                    System.out.println(h.toString());
                    title.setText("Boeking succesvol!");


                    // Reset fields
                    userTextField.clear();
                    addressBox.clear();
                    arriveDateBox.setValue(LocalDate.now());
                    departureDateBox.setValue(LocalDate.now().plusDays(1));
                    roomTypeBox.setValue(null);
                }
            }
        });
    }
}