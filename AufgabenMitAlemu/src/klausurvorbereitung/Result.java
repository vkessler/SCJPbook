package klausurvorbereitung;

public class Result { 				// Spielergebnisse
	public String team1, team2; 	// Manschaften
	public int tore1, tore2; 		// erzielte Tore
	
	@Override
	public String toString() {
		return team1 + ":" + team2 + " " + tore1 + ":" + tore2 + "\n";
	}
}
