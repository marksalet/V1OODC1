package practicum7;

public abstract class Voertuig implements Goed {
	private String type;
	protected double nieuwprijs;
	protected int bouwjaar;
	
	public Voertuig(String tp, double pr, int jr) {
		type = tp;
		nieuwprijs = pr;
		bouwjaar = jr;
	}
	@Override
	public boolean equals(Object obj) {
	    if(obj == this) return true; 
	    if((obj == null) || (obj.getClass() != this.getClass())) return false; 
	    return false;
	}
	public String toString() {
		return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" + huidigeWaarde();
	}
}
