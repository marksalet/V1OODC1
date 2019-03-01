package practicum6;
import java.util.ArrayList;

public class Persoon {
	private String naam;
	private double budget;
	private ArrayList<Game> mijnGames;
	
	public Persoon(String nm, double bud) {
		naam = nm;
		budget = bud;
	}
	public boolean koop(Game g) {
		if(!(mijnGames.contains(g))) {
			if() {
				mijnGames.add(g);
				return true;
			}
		} else {
			return false;
		}
	}
	public boolean verkoop(Game g, Persoon koper) {
		
	}
	public String toString() {
		return "";
	}
}
