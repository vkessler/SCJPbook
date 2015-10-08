/*
 * Erzeugen eine reguläre Datei : teilnehmerliste.txt
 * Befüllen sie die Datei mit folgendem Inhalt:
 * 												-Martin Steffen
 * 												-Slobodan Gavric
 * 												-Tariq Neghaben
 * 												-Victor Kesseler
 * -Lesen Sie den Inhalt der Datei teilnehmerliste.txt ins Programm in ein Array
 * -Teilnehmernamen sollen ausschließlich aus Großbuchstaben bestehen
 * -Überschreiebne Sie die Datei teilnehmerliste.txt mit Inhalt, diesmal gleiche Inhalt, nur Namen sind 
 * 	mit Großbuchstaben geschrieben.
 * 
 * 													
 */

package FileAufgabe_10_08;

import java.io.*;

public class FileAufgabe {

	public static void main(String[] args) {
		
		File f = new File("teilnehmerliste.txt");

		FileWriter fw = null;		
		try { 
			fw = new FileWriter(f); 
		} catch (IOException e) {
			System.out.println("IOException ist aufgetreten!");
			e.printStackTrace();
		}
		
		PrintWriter pw = new PrintWriter(fw);
		pw.println("Martin Steffen");
		pw.println("Slobodan Gavric");
		pw.println("Tariq Neghaban");
		pw.println("Victor Kessler");
		pw.close();
		
		FileReader fr = null;
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException ist aufgetreten!");
			e.printStackTrace();
		}
		
		BufferedReader reader = new BufferedReader(fr);
		String s = null;
		String[] ta = new String[4];
		int count = 0;
		System.out.println("\"reader\" Ausgabe Zeile für Zeile:");
		try {
			while ( (s = reader.readLine()) != null ) {
				System.out.println(s);
				ta[count++] = s;
				//System.out.println(count);
			}
		} catch (IOException e) {
			System.out.println("IOException ist aufgetreten!");
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("IOException ist aufgetreten!");
				e.printStackTrace();
			}
		}
		
		System.out.println("\nArrayausgabe:");
		for (String p : ta) {
			System.out.println(p);
		};
		
		String[] taUpper = new String[4];
		for (int i = 0 ; i < ta.length ; i++) {
			taUpper[i] = ta[i].toUpperCase();
		}
		
		System.out.println("\nArrayausgabe mit uppercase:");
		for (String pp : taUpper) {
			System.out.println(pp);
		}

		
		
		
		

	}

}
