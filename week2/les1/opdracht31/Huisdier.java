package week2.les1.opdracht31;

public class Huisdier {
	private String naam;
	private String ras;
	private double gewicht;
	private Eigenaar baasje;
	
	public Huisdier(String nm, String r) {
		naam = nm;
		ras = r;
	}
	
	public void setBaasje(Eigenaar e) {
		baasje = e;
	}
	
	public Eigenaar getBaasje() {
		return baasje;
	}
	
	public String toString() {
		return naam + ", de " + ras + ", weegt " + gewicht + " kg. \nEn de eigenaar is: " + baasje;
	}
}
