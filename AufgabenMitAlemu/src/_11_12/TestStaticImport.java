package _11_12;

import static java.util.Arrays.sort;

import java.util.Arrays;

/*
 * Mit normaler import:
 * 				man kann eine Klasse oder ganze Klassen aus einem Package importieren
 * 
 * 			BSP:
 * 					import java.util.Arrays;  die Klasse Arrays importiert
 * 					import java.util.*; 	alle Klassen aus dem Package java.lang.util
 * 
 * Mit static import (Richtitige Befehl: import static ) kann man statische Elemente (Attribute und Methoden) einer Klasse importieren
 * 
 * 		BSP:
 * 			import static java.util.Arrays.sort;  Die statische Methode sort aus der Klasse Arrays
 * 			import static java.util.Arrays.* ;    Alle Statische Elemente der Klasse sort
 */

public class TestStaticImport {
	public static void main(String[] args) {
		
		int[] ints ={1,2,3,4,3,1};
		
		sort(ints);
		
		Arrays a;
		
		
		
	}

}
