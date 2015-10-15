/*
Fallbeispiel: Währungsrechner
Lernziel
Einlesen und Schreiben von Unicode - Zeichen aus der bzw. in die Konsole.
Schreiben Sie ein Programm Eurorechner.java, mit dem Umrechnungen eines Euro - Betrages in einen US Dollar - Betrag und umgekehrt vorgenommen werden können.
Beginnen Sie dazu mit der folgenden Abfrage:
"Eingabe der Ausgangswaehrung (E)uro oder (U)s Dollar? :"
 Wird E oder e eingegeben, dann wird für den eingegeben Wert der entsprechende US Dollar - Betrag ausgegeben
 Wird U oder u eingegeben, dann wird für den eingegeben Wert der entsprechende Euro - Betrag ausgegeben
Testen Sie die Eingaben, ob auch wirklich Zahlenbeträge eingegeben worden sind und reagieren Sie gegebenenfalls darauf:
"Falsche Eingabe bitte nochmal!"
Geben Sie dem Anwender die Möglichkeit, das Programm noch einmal zu wiederholen:
"Wollen Sie noch einmal j/n? :"
Die Umrechnungswert (Stand Oktober 2015) von Euro in US Dollar, der in die Berechnung mit eingeht lautet:
private final double KURS = 1.14077;
 */


package waehrungsrechner;

import java.text.NumberFormat;
import java.util.Locale;
import Prog1Tools.IOTools;

public class Eurorechner {
	
	private final double kurs = 1.14077;

	public static void main(String[] args) {
		
		Eurorechner eur = new Eurorechner();
		
		boolean wdh = true;
		while (wdh) {
			char command = ' ';
			boolean bool1 = true;
			while (bool1) {
				try { 
					command = IOTools.readChar("Eingabe der Ausgangswaehrung (E)uro oder (U)s Dollar? :");
					if (command == 'e' || command == 'E' || command == 'u' || command == 'U' ) {
						bool1 = false;
						break;
					} else {
						System.out.println("Falsche Eingabe. Eingabe wiederholen");
						bool1 =true;
						//break;		
					}
				} catch (Exception e){
					System.out.println("Falsch Eingabe. Bitte wiederholen Sie die Eingabe!");
				}
			}
			double eingabebetrag = 0;
			double ausgabebetrag = 0;
			try {
				eingabebetrag = IOTools.readDouble("Bitte geben Sie den Betrag ein, welcher umgerechnet werden soll: ");
			} catch (Exception e) {
				System.out.println("Falsch Eingabe. Bitte wiederholen Sie die Eingabe!");
			}
			switch (command) {
				case 'e':  ausgabebetrag = eingabebetrag * eur.kurs;
				break;
				case 'E': ausgabebetrag = eingabebetrag * eur.kurs;
				break;
				case 'u': ausgabebetrag = eingabebetrag / eur.kurs;
				break;
				case 'U': ausgabebetrag = eingabebetrag / eur.kurs;
				break;
				default: System.out.println("Falsche Eingabe!");
				break;
			}
			NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
			System.out.println(nf.format(ausgabebetrag));
			char wdhChar = ' ';
			try {
				wdhChar = IOTools.readChar("Möchten Sie das Programm widerholen j/n ? ");
				if (wdhChar == 'j') {
					wdh = true;
				} else {
					wdh = false;
				}
			} catch (Exception e) {
				System.out.println("Falsch Eingabe. Bitte wiederholen Sie die Eingabe!");
			}
			
		}//Ende der While Schleife

	}//Ende von main

}//Ende von Eurorechner
