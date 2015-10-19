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
import java.io.FileWriter;
import java.io.PrintWriter;

public class UmlautConv {

	public static void main(String[] args) {
		
		//Die Datei befindet sich im Ordner "C:\Users\vkessler\Downloads"
		
//		File f = new File("C:"+File.separator+"Users"+File.separator+"vkessler"+
//				File.separator+"Downloads"+File.separator+"umlaute.txt");
		
		File f = new File("C:\\Users\\vkessler\\Downloads\\umlaute.txt");
		File g = new File("C:\\Users\\vkessler\\Downloads\\ohneumlaute.txt");
		try {
			g.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		StringBuffer s1 = null;
		StringBuffer s2 = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			fw = new FileWriter(g);
			pw = new PrintWriter(fw);
			s1 = new StringBuffer();
			//System.out.println(br);
			//s1.append(br.readLine());
			String str;// = br.readLine();
			
			while ( (str = br.readLine())!= null) {
				
				str = str.replace('Ä', 'A');
				str = str.replaceAll("ä", "ae");
				
				str = str.replaceAll("Ö", "Oe");
				str = str.replaceAll("ö", "oe");
				
				str = str.replaceAll("Ä", "Ue");
				str = str.replaceAll("ä", "ue");
				
				str = str.replaceAll("ß", "ss");
				
				pw.println(str);
				//str = br.readLine();
				//s1.append(br.readLine() + "\n");
				
			}
			//pw.println(s1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fr.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(f.isFile());
		

	}

}
