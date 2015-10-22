package klausurvorbereitung;

public class ResultException extends Exception {
	// Konstruktor
	ResultException (String team1, String team2) {
	// Message-String des Exception-Objekts festlegen
	super("fuer das Spiel " + team1 + " gegen " + team2);
	}
	}
