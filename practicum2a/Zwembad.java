package practicum2a;

public class Zwembad {
	private double breedte = 0;
	private double lengte = 0;
	private double diepte = 0;
	private double inhoud = 0;
	
	public Zwembad() {
		
	}
	public Zwembad(double br, double lng, double dpt) {
		breedte = br;
		lengte = lng;
		diepte = dpt;
	}
	public void setBreedte(double br) {
		breedte = br;
	}
	public double getBreedte() {
		return breedte;
	}
	public void setLengte(double lng) {
		lengte = lng;
	}
	public double getLengte() {
		return lengte;
	}
	public void setDiepte(double dpt) {
		diepte = dpt;
	}
	public double getDiepte() {
		return diepte;
	}
	public double inhoud() {
		inhoud = breedte * lengte * diepte;
		return inhoud;
	}
	public String toString() {
		return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
	}
}
