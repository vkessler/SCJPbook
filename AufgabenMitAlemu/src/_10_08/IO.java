package _10_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import Prog1Tools.IOTools;

/*
 * Bisherige I/O : Konsole: Tastatur Eingaben + Bildschirmausgaben
 * 
 * Weitere: 
 * 			Dateien, Datenbank, GUI, Socket, ...
 * wir werden Dateien als IO betrachten
 * 			API: java.io
 * 
 */

/*
 * Dateien als IO:
 * 			Input: Programm liest Werte aus der Datei. (basic Methode: read)
 * 			Output: Programm schreibt in die Datei.  (basic Methode: write)
 * 	Es gibt texteulle Dateien (Write /read ist dann char basiert)
 * 	Dateien können auch Bilder, Audio und Video (write/read: byte orientiert)
 * 
 */

public class IO {
public static void main(String[] args) throws IOException {
	char temp = 0;
	FileInputStream input = null;
	FileOutputStream output = null;
	
	try {
		input = new FileInputStream("temperaturmessung.txt");//öffnen von Stream
		while((temp = (char)input.read()) != 13){
			System.out.println(temp);
		}
		
	} catch (FileNotFoundException e) {
		
		System.out.println("Datei konnte nicht gefunden werden");
	} catch (IOException e) {
		System.out.println("Algemeine IO Exception ist aufgetretten");
	
	}finally{
		if(input != null)input.close();
	}
	
	System.out.println(temp);
	
	output = new FileOutputStream("temperaturmessung2.txt");
	output.write('A');
	
	output.close();
	
}
}
