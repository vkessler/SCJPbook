/*
 Umlaute suchen und ersetzen
Lernziel
	Einlesen und Schreieben von Unicode - Zeichen aus einer bzw. in eine Datei.  Gegeben ist die Datei umlaute.txt, die unter anderem deutsche Umlaute und ß enthält.
Vorgehen:
1. Speichern Sie sich die Datei umlaute.txt lokal auf ihrem Rechner 
2. Schreiben Sie ein Programm UmlautConv.java, welches die folgenden Aufgaben erfüllt:
•	Einlesen der Daten aus der Datei umlaute.txt
•	Durchsuchen der eingelesenen Zeichen nach den Umlauten  'ä','Ä','ö','Ö','ü','Ü' und 'ß'
•	Ersetzen der gefunden Zeichen nach folgender Regel:
			ä - > ae, Ä ->Ae, ö->oe, Ö->Oe, ü->ue, ß->ss	
•	Schreiben der Zeichen einschließlich der geänderten in die Datei ohneumlaute.txt
3. Testen Sie das Programm
 */

package umlaute;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class UmlautConv {

	public static void main(String[] args) {
		
		//Die Datei befindet sich im Ordner "C:\Users\vkessler\Downloads"
		
//		File f = new File("C:"+File.separator+"Users"+File.separator+"vkessler"+
//				File.separator+"Downloads"+File.separator+"umlaute.txt");
		
		File f = new File("C:\\Users\\vkessler\\Downloads\\umlaute.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			while ( (br.readLine()) != null)
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(f.isFile());
		

	}

}
