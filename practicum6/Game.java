
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
			waarde = Math.round((waarde * 0.7) * 100.0) / 100.0;
		}
		return waarde;
	}
	@Override
	public boolean equals(Object obj) {
	    if(obj == this) return true; 
	    if((obj == null) || (obj.getClass() != this.getClass())) return false; 
	    Game g = (Game) obj;
	    if( (this.getNaam().equals(g.getNaam())) ) return true; 
	    return false;
	}
	public String toString() {
		return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + nieuwprijs + " nu voor: €" + huidigeWaarde();
	}
}
