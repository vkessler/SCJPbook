package _10_15;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import Prog1Tools.IOTools;

public class Waehrungsumrechner {
	private final double KURS = 1.14077;// Euro - Dollar

	public static void main(String[] args) {
		Waehrungsumrechner wr = new Waehrungsumrechner();
		Scanner sc = new Scanner(System.in);
		String waehrung = null;
		double betrag = 0.0;
		boolean parseEx = false;
		
		String wiederholung = null;
		
		do{

		do {
			waehrung = IOTools
					.readString("Eingabe der Ausgangswaehrung (E)uro oder (U)s Dollar? ");
			if (waehrung.equalsIgnoreCase("E")) {

				do {
					System.out.println("Betrag: ");
					String betragin = sc.next();
					try {
						parseEx = false;
						betrag = Double.parseDouble(betragin);
					} catch (NumberFormatException ex) {
						parseEx = true;
						System.out.println("Falsche Eingabe bitte noch mal");
					}
				} while (parseEx);
				
				System.out.println(
						NumberFormat.getCurrencyInstance(Locale.GERMANY).format(betrag) + " =" + 
						NumberFormat.getCurrencyInstance(Locale.US).format(betrag * wr.KURS));
				

			}
			
			if (waehrung.equalsIgnoreCase("U")) {

				do {
					System.out.println("Betrag: ");
					String betragin = sc.next();
					try {
						parseEx = false;
						betrag = Double.parseDouble(betragin);
					} catch (NumberFormatException ex) {
						parseEx = true;
						System.out.println("Falsche Eingabe bitte noch mal");
					}
				} while (parseEx);
				
				System.out.println(
						NumberFormat.getCurrencyInstance(Locale.US).format(betrag) + " =" + 
						NumberFormat.getCurrencyInstance(Locale.GERMANY).format(betrag / wr.KURS));
				

			}

		} while (!(waehrung.equalsIgnoreCase("E") || waehrung
				.equalsIgnoreCase("u")));
		
		wiederholung = IOTools.readString("Wollen sie noch einmal j/n ?");
		}while(wiederholung.equalsIgnoreCase("j"));
	}
}
