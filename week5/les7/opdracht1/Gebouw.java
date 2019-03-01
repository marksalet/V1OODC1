package week5.les7.opdracht1;

public class Gebouw {
	private int lengte;
	private int breedte;
	private int aantalVerdiepingen;
	public int laatsteRenovatie;
	
	public Gebouw() {
		this(0,0,0);
	}
	public Gebouw(int l, int b, int aV) {
		lengte = l;
		breedte = b;
		aantalVerdiepingen = aV;
	}
	public int oppervlakte() {
		return lengte * breedte;
	}
	public void renoveer(int jaarBuiten) {
		laatsteRenovatie = jaarBuiten;
	}
	public int brekenenHuur() {
		return oppervlakte() * 75;
	}
}
