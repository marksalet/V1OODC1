package practicum8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Boekingen extends Application implements EventHandler<ActionEvent> {

	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Voer uw gegevens in!");
		Label labelNaam = new Label("Naam:");
		Label labelAdres = new Label("Adres:");
		Label labelAankomst = new Label("Aankomstdatum:");
		Label labelVertrek = new Label("Vertrekdatum:");
		Label labelKamer = new Label("Kamertype:");
		
		TextField textNaam = new TextField();
		TextField textAdres = new TextField();
		DatePicker dateAankomst = new DatePicker();
		DatePicker dateVertrek = new DatePicker();
		ComboBox comboKamer = new ComboBox();
		
		FlowPane layout = new FlowPane();
		layout.getChildren().add(label);
		layout.getChildren().add(labelNaam);
		layout.getChildren().add(textNaam);
		layout.getChildren().add(labelAdres);
		layout.getChildren().add(textAdres);
		layout.getChildren().add(labelAankomst);
		layout.getChildren().add(dateAankomst);
		layout.getChildren().add(labelVertrek);
		layout.getChildren().add(dateVertrek);
		layout.getChildren().add(labelKamer);
		layout.getChildren().add(comboKamer);
		Scene scene = new Scene(layout, 350, 250);
		layout.setHgap(10);
		layout.setVgap(10);
		primaryStage.setTitle("Tweepersoonsboekingen");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void handle(ActionEvent event) {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
