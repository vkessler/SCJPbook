package _10_09;

import java.io.File;
import java.io.IOException;

/*
 * 
 */
public class Testfile {
	public static void main(String[] args) {
		
//		String pathname = "Seminar" + File.separator + "2015" + File.separator + "OCPJP";
//		File f = new File(pathname);
//		f.mkdirs();
		
		File f = new File("Seminar"); 
		f.mkdir();
		File f2 = new File(f, "2015");
		f2.mkdir();
		File f3 = new File(f2, "OCPJP");
		f3.mkdir();
		
		File notiz = new File(f3, "notiz.txt");
		
		try {
			notiz.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//Konstruktoren von Writer - Klassen (FileWriter, BufferedWriter, PrintWriter und auch FileOutputStream)
		//erzeugen automatisch eine leere Datei, falls die Datei noch nicht existiert. In diesem Fall
		//ist Aufruf von createNewFile nicht zwingend (Im Gegensatz zu readers!)
		
		
		File test = new File(".." + File.separator + ".." + File.separator +  "test");
		System.out.println(test.mkdir());
		
		if(f.exists()){
			if(f.isDirectory()) System.out.println("Es handelt sich um Verzeichnis");
			if(f.isFile())System.out.println("Es handelt sich um eine reguläre Datei (z.b txt datei)");
		}
		else System.out.println("Datei exstiert im DS nicht");
		
	}

}
