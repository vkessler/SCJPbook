package _10_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* Datei: 	text
 * 
 * Lesen				Schreiben
 * 			File
 * Reader				Writer
 * FileReader			FileWriter
 * BufferedReader		BufferedWriter, PrintWriter
 * 
 */

public class InputOutputTextuelleDateien {
	public static void main(String[] args) throws IOException {
		//Lesen
		
		/*
		 * Eine File Objekt im Heap erzeugen
		 * 		-Falls zufälligerweise eine Datei gleiches Namen im DS exitiert, dann es entsteht eine Beziehung
		 * 		
		 */
		File f = new File("einkaufzettel.txt");
		
//		
//		System.out.println("Existiert die Dateie im Dateisystem? " + f.exists() );
//		
//		boolean w = f.createNewFile();
//		System.out.println("neue leere Datei erzeugt ? " + w);
//		System.out.println("Existiert die Dateie im Dateisystem? " + f.exists() );
		
//		FileWriter fw = new FileWriter(f);
//		fw.write("Teller 3; Loeffel 10");
//		fw.flush();
//		fw.close();//erste Anweisung in close() ist flush();
		
//		FileReader fr = new FileReader(f);
//		int i = 0;
//		System.out.println("Zeichen aus  Datei");
//		while((i = fr.read())!= -1){
//			System.out.print((char)i );
//		}
//		
//		//fr.flush();Achtung: Reader haben keinen Buffer im Gegensatz zu Writers, und deswegen keine flush() 
//		fr.close();
		
		//FileWriter writer = new FileWriter(new File("todoList.txt"));
//		BufferedWriter writer = new BufferedWriter( new FileWriter(new File("todoList.txt")));
//	
//		writer.write("Seminar vorbereiten");
//		writer.newLine();
//		writer.write("Einkaufen");
//		writer.newLine();
//		writer.write("Eltern besuchen");
//		
//		writer.close();
		
		PrintWriter writer = new PrintWriter(new FileWriter(new File("todoList.txt")));
		writer.println("Seminar vorbereiten");
		writer.println("Einkaufen");
		writer.println("Eltern besuchen");
		writer.close();
		
//		FileReader reader = new FileReader(new  File("todoList.txt"));
//		int c = 0;
//		System.out.println();
//		while((c = reader.read()) !=-1){
//			System.out.print((char)c);
//		}
		
		BufferedReader reader = new BufferedReader(new FileReader(new  File("todoList.txt")));
		String s = null;
		while((s = reader.readLine())!=null){
			System.out.println(s);	
		}
		
		
	}

}
