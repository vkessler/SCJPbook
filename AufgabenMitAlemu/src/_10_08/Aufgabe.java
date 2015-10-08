package _10_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

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
public class Aufgabe {
	public static void main(String[] args) throws IOException {
		File regFile = new File("teilnehmerliste.txt");
			//String path = File.listRoots()[0] + File.pathSeparator + "Seminar" + File.pathSeparator + "java";
			regFile.createNewFile();
			PrintWriter pw = new PrintWriter(regFile);
			pw.println("-Martin Steffen");
			pw.println("-Slobodan Gavric");
			pw.println("-Tariq Neghaben");
			pw.println("-Victor Kesseler");
			pw.close();
			
	StringBuilder[] teilnehmerliste;
	int n = 0;
	BufferedReader bufReader = new BufferedReader(new FileReader(regFile));
	while(bufReader.readLine() != null){
		n++;
	}
	bufReader.close();
	
	teilnehmerliste = new StringBuilder[n];
	bufReader =  new BufferedReader(new FileReader(regFile));
	int i = 0;
	String s = null;
	while((s = bufReader.readLine()) != null){
		teilnehmerliste[i++] = new StringBuilder(s.toUpperCase());
	}
		
	bufReader.close();
	
	pw = new PrintWriter(regFile);
	
	for(int k = 0; k < teilnehmerliste.length; k++){
	pw.println(teilnehmerliste[k]);

		
	}
	pw.close();
	
	for(StringBuilder teil : teilnehmerliste){
		System.out.println(teil);
			
		}
	
		
		
	}

}
