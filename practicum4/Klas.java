package practicum4;
import java.util.ArrayList;

public class Klas {
	private String klasCode;
	private ArrayList<Leerling> deLeerlingen;
	
	public Klas(String kC) {
		klasCode = kC;
		deLeerlingen = new ArrayList<Leerling>();
	}
	public void voegLeerlingToe(Leerling l) {
		deLeerlingen.add(l);
	}
	public void wijzigCijfer(String nm, double newCijfer) {
		for(Leerling l : deLeerlingen) {
			if(l.getNaam().equals(nm)) {
				l.setCijfer(newCijfer);
			}
		}
	}
	public ArrayList<Leerling> getLeerlingen(){
		return deLeerlingen;
	}
	public int aantalLeerlingen() {
		return deLeerlingen.size();
	}
	public String toString() {
		String array = "";
		for (int i = 0; i < deLeerlingen.size(); i++) {
			array += deLeerlingen.get(i) + "\n";
		};
		return "In de klas " + klasCode + " zitten de volgende leerlingen: \n" + array;
	}
}
