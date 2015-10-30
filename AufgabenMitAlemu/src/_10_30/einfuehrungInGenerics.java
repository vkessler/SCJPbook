package _10_30;

import java.util.ArrayList;
/*
 * Generics in Java = Templates in C++
 * 
 * Generics ist ein Advanced Features
 * 		erst in Java 5 eingeführt...
 * Generics ist nur für den Compiler
 * 
 * Was möchte ich erklären?
 * 			-Motivation
 * 					-Collections ohne Generics sind im Vgl. zu arrays typ - unsicher
 * 							(Die Elemente sind nicht typisiert, sind alg. Object)
 * 							Problem:
 * 									-Notwendigkeit von Downcast -> ursache für ClassCastException
 * 									-Compiler hat keine mögliche uns zu helfen
 * 							Lösung: anwendung von Generics
 * 									-In Java 5, man hat die ganze Collection Typen zu Generics überschrieben
 * 			-Syntax
 * 			-Generische Typen (Klassen, Interfaces, Enums)
 * 			-Generische Methoden
 * 
 * Begriffe:	Type Bounding (extends, super), wildcard (?)
 */

public class einfuehrungInGenerics {
	
	public static void main(String[] args) {
		String s = new String("test");
		Integer i = new Integer(3);
		
		String[] sa = new String[2];
		Integer [] ia  = new Integer[2];
		
		sa[0] = s;sa[1] = "tst";
		ia[0] =45;ia[1] = 21;
		
		ArrayList namen = new ArrayList();
		namen.add("Alemu");namen.add(12);
		
		for(int j = 0; j < namen.size(); j++){
			System.out.println(((String)namen.get(j)).toUpperCase());
		}
		
	}

}
