package _10_01;

/*
 * Syntax:
 * 		zu jedem try Block muss mindestens enstprechedes finally oder catch Block exitieren
 * 		Umgekehrt: Catch oder finally blocks exitieren nicht ohne zugehöriges try Block
 * 		Sehe Beispiel unten, dass ein try meherere Catches haben kann
 * 
 */

public class ExceptionFortsetzung {
	public static void main(String[] args) {
		try {
			// Ausnahmebehafteter Code
			/*
			 * -user eingaben -Zufälliger Wegfall von Resourcen (Hardware:
			 * Internet, Dateien, Drucker, Sensoren..)
			 */

		} 
		catch (ArithmeticException e) {
			// Ausnahmebehandlungscode

		} catch (NullPointerException npe) {

		} catch (ClassCastException cce) {

		}
		
		//Multi - catch um Code Redundanz zu vermeiden seit java 7:
		//catch (ArithmeticException | NullPointerException | ClassCastException e)

	}

}
