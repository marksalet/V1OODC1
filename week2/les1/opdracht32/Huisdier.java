package week2.les1.opdracht32;

public class Huisdier {
	private String naam;
	private String ras;
	private double gewicht;
	
	public Huisdier(String nm, String r) {
		naam = nm;
		ras = r;
	}
	public String getNaam() {
		return naam;
	}
	public String getRas() {
		return ras;
	}
	public String toString() {
		return naam + ", de " + ras + ", weegt " + gewicht + " kg.";
	}
}
