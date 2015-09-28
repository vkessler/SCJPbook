package _09_22;

import java.util.ArrayList;

import Prog1Tools.IOTools;
/*
 * ganze Zahlen Literale sind per Default: int 
 * Flieﬂkomma Zahlen Literale sind per Default: double
 */


public class Datentyp {
	public static void main(String[] args) {
		
//		int x = 12;
//		String s = "abc";
//		Math m;
//		ArrayList al;//eine Klasse aus Java API 
//		IOTools it;//Eine Klasse aus dritt Mittel
		
		//a und b
		
//		byte a = 70; //-128  <= 70 <= 127, es findet eine Bereichs¸berpr¸fung statt
//		short s = 123000;
//		
//		float f =  2.3f;//Es findet keine Bereichs¸berpr¸fung statt
		
		int x = IOTools.readInt("Bitte operand 1 eingeben: ");
		int y =  IOTools.readInt("Bitte operand 2 eingeben: ");
		
		int result = x  + y;
		
		System.out.println("Die Summe aus " + x + " und " + y + " ist " + result);
		
		String s1 = "wondmu"; String s2 = " Alemu";
		String s1s2 = s1 + s2;
		System.out.println(s1s2);
		
		
	
	
	}

}
