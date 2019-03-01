package practicum6;
import java.time.LocalDate;

public class Game {
	private String naam;
	private int releaseJaar;
	private double nieuwprijs;
	
	public Game(String nm, int rJ, double nwpr) {
		naam = nm;
		releaseJaar = rJ;
		nieuwprijs = nwpr;
	}
	public String getNaam() {
		return naam;
	}
	public double huidigeWaarde() {
		int hj = LocalDate.now().getYear();
		double waarde = nieuwprijs;
		for(int rj = releaseJaar; rj < hj; rj++) {
			waarde = waarde * 0.7;
		}
		return waarde;
	}
	public boolean equals(Object andereObject) {
		return true;
	}
	public String toString() {
		return "";
	}
}
