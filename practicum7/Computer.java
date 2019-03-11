package practicum7;

import java.time.LocalDate;

public class Computer implements Goed {
	private String type;
	private String macadres;
	private double aanschafprijs;
	private int productiejaar;
	
	public Computer(String tp, String adr, double pr, int jr) {
		type = tp;
		macadres = adr;
		aanschafprijs = pr;
		productiejaar = jr;
	}
	public double huidigeWaarde() { 
		double waarde = aanschafprijs;
		for(int i = 0; i < LocalDate.now().getYear() - productiejaar; i++) {
			waarde = Math.round((waarde * 0.6) * 100.00) / 100.00; 
		}
		return waarde;
	}
	@Override
	public boolean equals(Object obj) {
	    if(obj == this) return true; 
	    if((obj == null) || (obj.getClass() != this.getClass())) return false; 
	    Computer c = (Computer) obj;
	    if( (this.macadres == c.macadres) ) return true; 
	    return false;
	}
	public String toString() {
		return "Computer: " + type + " heeft een waarde van: €" + huidigeWaarde();
	}
}
