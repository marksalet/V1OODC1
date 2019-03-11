package practicum7;

import java.time.LocalDate;

public class Auto extends Voertuig {
	private String kenteken;
	
	public Auto(String tp, double pr, int jr, String kt) {
		super(tp, pr, jr);
		kenteken = kt;
	}
	public double huidigeWaarde() { 
		double waarde = nieuwprijs;
		for(int i = 0; i < LocalDate.now().getYear() - bouwjaar; i++) {
			waarde = Math.round((waarde * 0.7) * 100.00) / 100.00; 
		}
		return waarde;
	}
	@Override
	public boolean equals(Object obj) {
	    if(obj == this) return true; 
	    if((obj == null) || (obj.getClass() != this.getClass())) return false; 
	    Auto a = (Auto) obj;
	    if( (this.kenteken == a.kenteken) ) return true; 
	    return false;
	}
}
