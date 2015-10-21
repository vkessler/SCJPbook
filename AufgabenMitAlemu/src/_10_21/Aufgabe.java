package _10_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Arrays und arraylist sind äquivalent
 * Aufgabe 1: Machen Sie eine Gegenüberstellung (Vergleich: Vor- und Nachteil)
 * 
 * Aufgabe 2: Array und  ArrayList sind "ordered"- Einfügereihenfolge, aber die Elemente Sind nicht sortiert.
 * 
 * 			-Schauen Sie sich nach Klassen für das Sortieren/Suchen von arrays und ArrayList
 * 					(Arrays, Collections)
 * 
 * Arrays und Collections sind sog. Utility classes, die mit zahlreiche statische Methoden ausgestattet sind.
 * 		beliebte Operationen
 * 					-Suchen, Sortieren, Konvertieren (Collection <-> Array)
 * 
 * Achtung.
 * 			Suchen geht von einem sortiertem array / List (-> man soll zuerst sortieren und dann suchen)
 * 			
 */
public class Aufgabe {
	public static void main(String[] args) {
		int[] temp = {12,13,15,11,5,5,35,21, 100};
		int [] alt = new int[temp.length];
		for(int i = 0; i < temp.length;i++){
			alt[i] =temp[i];
		}
		
		System.out.println("Array: ");
		for(int t : temp){
			System.out.print(t + " ");
		}
		
		Arrays.sort(temp);
		System.out.println();
		System.out.println("Arrays sortiert:");
		for(int t : temp){
			System.out.print(t + " ");
		}
		
//		System.out.println();
//		for(int t : alt){
//			System.out.print(t + " ");
//		}
		
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(12);ints.add(13);ints.add(15); ints.add(11); ints.add(11);
		System.out.println();
		System.out.println("ArrayList");
		System.out.println(ints);
		
		System.out.println("arrayList sortiert");
		Collections.sort(ints);
		System.out.println(ints);
		
		System.out.println();
		System.out.println("index");
		System.out.println(5 + " ist an der Stelle : " + Arrays.binarySearch(alt, 5));
		
		
		
	}

}