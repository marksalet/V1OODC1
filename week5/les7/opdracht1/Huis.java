package week5.les7.opdracht1;

public class Huis extends Gebouw{
	public boolean isGeisoleerd;
	public int laatsteRenovatie;
	
	public Huis() {
		this(0,0,0,false);
	}
	public Huis(boolean isG) {
		this(0,0,0,isG);
	}
	public Huis(int l, int b, int aV) {
		super(l, b, aV);
	}
	public Huis(int l, int b, int aV, boolean isG) {
		super(l, b, aV);
		isGeisoleerd = isG;
	}
	public void isoleer() {
		isGeisoleerd = true;
	}
	public void renoveer(int binnen) {
		laatsteRenovatie = binnen;
	}
	public void renoveer(int binnen, int buiten) {
		this.renoveer(binnen);
		super.renoveer(buiten);
	}
	public int berekenHuur() {
		return super.oppervlakte() * 100;
	}
	public String toString() {
		
	}
}
