package practicum3b;

public class Auto {
	
	private String type;
	private double prijsPerDag;

	public Auto(String tp, double prPd) {
		type = tp;
		prijsPerDag = prPd;
	}
	
	public void setPrijsPerDag(double prPd) {
		prijsPerDag = prPd;
	}

	public double getPrijsPerDag() {
		return prijsPerDag;
	}
	
	public String toString() {
		return type + " met de prijs per dag: " + prijsPerDag;
	}
}