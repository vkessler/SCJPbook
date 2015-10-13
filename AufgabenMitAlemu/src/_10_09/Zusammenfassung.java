package _10_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * API Tabele : s. 450
 * Exceptions: FileNotfoundException, IOException
 * 
 */
/*
 * Aufgabe: Experimentieren sie mit der Tabelle 6-1 aus dem Buch SCJP Seit 450
 * 
 */

public class Zusammenfassung {
	public static void main(String[] args) {
		File f = new File("test.txt");
		FileReader fr = null;

		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {

		}

		try {
			fr.read();
		} catch (IOException e1) {

		}

		FileWriter fw = null;
		try {
			fw = new FileWriter(f);//BufferedWriter, PrintWriter
		} catch (IOException e) {

		}
	}

}
