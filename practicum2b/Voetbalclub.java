package practicum2b;

public class Voetbalclub {
	private int aantalGewonnen = 0;
	private int aantalGelijk = 0;
	private int aantalVerloren = 0;
	private int aantalWedstrijden = 0;
	private int aantalPunten = 0;
	private String voetbalclub = "";
	
	public Voetbalclub(String club) {
		voetbalclub = club;
	}
	
	public void verwerkResultaat(char ch) {
	    if (ch == 'w') {
	    	aantalGewonnen = aantalGewonnen + 1;
	    }
	    if (ch == 'g') {
	    	aantalGelijk = aantalGelijk + 1;
	    }
	    if (ch == 'v') {
	    	aantalVerloren = aantalVerloren + 1;
	    }
	}
	
	public int aantalGespeeld() {
		aantalWedstrijden = aantalGewonnen + aantalGelijk + aantalVerloren;
		return aantalWedstrijden;
	}
	
	public int aantalPunten() {
		aantalPunten = (aantalGewonnen * 3) + aantalGelijk;
		return aantalPunten;
	}
	
	public String toonResultaat() {
		aantalGespeeld();
		aantalPunten();
		return voetbalclub + "  " + aantalWedstrijden + "  " + aantalGewonnen + "  " + aantalGelijk + "  " + aantalVerloren + "  " + aantalPunten;
	}
	
	public String toString() {
		return toonResultaat();
	}
}
