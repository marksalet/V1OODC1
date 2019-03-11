package practicum7;

import java.util.ArrayList;

public class BedrijfsInventaris {
	private String bedrijfsnaam;
	private double budget;
	private ArrayList<Goed> alleGoederen;
	
	public BedrijfsInventaris(String nm, double bud) {
		budget = bud;
		bedrijfsnaam = nm;
		alleGoederen = new ArrayList<Goed>();
	}
	public void schafAan(Goed g) {
		if (budget >= g.huidigeWaarde() && !alleGoederen.contains(g)) {
            budget -= g.huidigeWaarde();
            alleGoederen.add(g);
        }
	}
	public String toString() {
		String s = bedrijfsnaam + " met inventaris:\n";

        for(Goed goed : alleGoederen) {
            s += goed + "\n";
        }
        return s;
	}
}
