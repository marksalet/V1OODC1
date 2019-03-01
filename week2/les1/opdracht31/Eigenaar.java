package week2.les1.opdracht31;

public class Eigenaar {
	private String naam;
	private int giroNr;
	
	public Eigenaar(String nm) {
		naam = nm;
	}
	public void setGiro(int nr) {
		giroNr = nr;
	}
	public int getGiro() {
		return giroNr;
	}
	public String getNaam() {
		return naam;
	}
	public String toString() {
		return naam + " heeft giro " + giroNr;
	}
}
