package practicum6;
import java.util.ArrayList;

public class Persoon {
	private String naam;
	private double budget;
	private ArrayList<Game> mijnGames;
	
	public Persoon(String nm, double bud) {
		naam = nm;
		budget = bud;
		mijnGames = new ArrayList<Game>();
	}
	public boolean koop(Game g) {
		if(mijnGames.contains(g) == false && g.huidigeWaarde() <= budget) {
			mijnGames.add(g);
			budget = budget - g.huidigeWaarde();
			return true;
		} else {
			return false;
		}
	}
	public boolean verkoop(Game g, Persoon koper) {
		if(mijnGames.contains(g) == true && !(koper.mijnGames.contains(g) && koper.budget >= g.huidigeWaarde())) {
			mijnGames.remove(mijnGames.indexOf(g));
			budget = budget + g.huidigeWaarde();
			koper.budget = koper.budget - g.huidigeWaarde();
			koper.mijnGames.add(g);
			return true;
		} else {
			return false;
		}
		
	}
	public String toString() {
		String array = "";
		for (int i = 0; i < mijnGames.size(); i++) {
			array += mijnGames.get(i) + "\n";
		};
		return naam + " heeft een budget van €" + budget + " en bezit de volgende games: \n" + array;
	}
}
