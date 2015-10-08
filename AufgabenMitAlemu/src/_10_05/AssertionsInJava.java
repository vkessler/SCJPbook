package _10_05;

import Prog1Tools.IOTools;
/*
 * 		-Assertions gibt es auch in C++
 * 
 * Motivation:
 * 			-Lebarer Code 
 * 						statt try - catch oder if -else Block, einfache assert statement
 * 			-Performance
 * 						Assert statements werden in der Regel nur während Produktion (
 * 							Entwicklung, Test) aktiviert, und während Endeinsatz deaktiviert
 */
/*
 * Was soll ich überhaupt im Bezug auf die Zertifizierung insebesondere Assertions wissen?
 * 		-Syntax
 * 		-Version: Assertion ist in Java erst ab der Version 4 eingebaut
 */
/*
 * Wann ist es überhaupt sinnvoll (appropriate) assertions zu benutzen?
 * 		-Man soll kine Annanhme (assertion) treffen über Commandezeile eingaben (user inputs)
 * 		-Man soll keine Annahme (Assertions) treffen über Argument einer public Methode
 * 
 * 	+ Es sinvoll assertions zu benutzen:
 * 				-Parameter einer private Methode
 * 				-switch case
 * 							default:	assert(false)
 * 		
 * 
 */
/*
 * Syntax:
 * 			assert (boolean expression); //Variant 1
 * 			assert (boolean expression) : expression; //Variante 2
 * expression: muss etwas zurück geben, was auf der Konsole ausggeben werden kann
 * 
 * 
 * 
 */

public class AssertionsInJava {
	
	private static double divide(double x,  double y){
		assert (y != 0) ;//Ich gehe davon aus, dass y !=0
			return  x / y;
	
		}
	
	public static void main(String[] args) {
//		int a= IOTools.readInt("Bitte Zähler eingeben");
//		int b = IOTools.readInt("Bitte Nenner (Nenner darf nicht 0 sein) eingeben");
		
		double result =divide(8, 0);
		
		System.out.println("Quotient aus a /b = " + result);
		
		System.out.println("");
		System.out.println(divide(1, 2));
		
		
	}
	private static void go(){
		
	}

}
