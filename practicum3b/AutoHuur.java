package practicum3b;

public class AutoHuur {
	
	private int aantalDagen;
	private double prijsPerDag;
	private double korting;
	private double kortingSom;
	private Klant huurder; 
	private Auto gehuurdeAuto;

	
	public AutoHuur() {
		
	}
	public void setAantalDagen(int aD) {
		aantalDagen = aD;
	}
	public void setGehuurdeAuto(Auto gA) {
		gehuurdeAuto = gA;
		prijsPerDag = gehuurdeAuto.getPrijsPerDag();
	}
	public Auto getGehuurdeAuto() {
		return gehuurdeAuto;
	}
	public void setHuurder(Klant k) {
		huurder = k;
		korting = huurder.getKorting();
	}
	public Klant getHuurder() {
		return huurder;
	}
	public void setKorting() {
		kortingSom = korting / 100;
		kortingSom = 1 - kortingSom;	
	}
	public double totaalPrijs() {
		setKorting();
		return (aantalDagen * prijsPerDag) * kortingSom;
	}
	public String toString() {
		String s = "";
		
		if (huurder == null) {
			s += "er is geen auto bekend \ner is geen huurder bekend\naantal dagen: " + aantalDagen +  " en dat kost " + totaalPrijs();
		}
		else{
			s += "Autotype: " + gehuurdeAuto + "\nop naam van: " + huurder + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		}
		return s;
	}
}