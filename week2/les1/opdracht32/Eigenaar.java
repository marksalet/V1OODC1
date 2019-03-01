package week2.les1.opdracht32;

public class Eigenaar {
	private String naam;
	private int giroNr;
	private Huisdier beestje;
	
	public Eigenaar(String nm) {
		naam = nm;
	}
	public void setBeestje(Huisdier hd) {
		beestje = hd;
	}
	public Huisdier getBeestje() {
		return beestje;
	}
	public String toString() {
		return naam + "heeft giro " + giroNr + ". En is het baasje van " + beestje;
	}
}
