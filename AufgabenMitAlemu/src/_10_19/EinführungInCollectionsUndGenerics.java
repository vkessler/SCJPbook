package _10_19;

import java.util.ArrayList;

/*
 * Material: SCJP buch Kapitel 7
 * 
 * Motivation collection:
 * 			bisher Sammlung von Dingen (Standard in der Datenverarbeitung) wurden in arrays gespeichert.
 * 				-Einschränkung (Nachteil) : Anzahl der Elemente muss im voraus bekannt sein, und bleibt fest (statisch)
 * 				-Mangel an einige eigenschaften: Duplikatefreiheit, Sortiert sein, ...
 * Lösung für die Schwachstellen von Arrays : Collections (alle sind dynamisch) 
 * 
 * Generics:
 * 		-Typsicherheit
 * 		-Die Collection Klassen sind mittlerweile Generics
 * 		-Eingeführt in Java 5
 */
public class EinführungInCollectionsUndGenerics {
	public static void main(String[] args) {
		
	Buch[] buecher = new Buch[100];
	String[] cont = new String[7];
	
	cont[0] = "North America";
	cont[1] = "Asia";
	cont[2] = "Europa";
	//...
	
	ArrayList<Buch> books = new ArrayList();
	//books.add(true);
	books.add(new Buch());
	//books.add("Test");
	System.out.println(books.size());
		
	}

}


class Buch{
	
}