package practicum7;

import java.time.LocalDate;

public class Fiets extends Voertuig {
	private int framenummer;
	
	public Fiets(String tp, double pr, int jr, int fnr) {
		super(tp, pr, jr);
		framenummer = fnr;
	}
	public double huidigeWaarde() { 
		double waarde = nieuwprijs;
		for(int i = 0; i < LocalDate.now().getYear() - bouwjaar; i++) {
			waarde = Math.round((waarde * 0.9) * 100.00) / 100.00; 
		}
		return waarde;
	}
	@Override
	public boolean equals(Object obj) {
	    if(obj == this) return true; 
	    if((obj == null) || (obj.getClass() != this.getClass())) return false; 
	    Fiets f = (Fiets) obj;
	    if( (this.framenummer == f.framenummer) ) return true; 
	    return false;
	}
}
