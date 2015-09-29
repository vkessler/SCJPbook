package _09_29;

import Prog1Tools.IOTools;
/*
 * if 
 * if else
 * switch - case
 * 
 * Schleifen:
 * 			-for 
 * 			-while
 * 			-do while
 * 
 * 
 */

/*
 * switch - case  überschabarer als verschachteltes if -else
 * 
 * Syntax:
 * 			switch(int compatible expression){
 * 				case v1:
 * 						anweisungen
 * 						break; //optional
 * 				case v2:
 * 						Anweisungen
 * 						break;
 * 				default:
 * 						Anweisungen
 * 						break;
 * 				}
 * 
 * Achtung:
 * 			switch hat als Argument ein int compatibler Expression
 * 			case  hat als Argument Literale oder Konstante
 * 
 * Frage :
 *  Was ist fall thrugh?
 */
public class Kontrollstrukturen {
	public static int go(int x){
		return x % 4;
		
	}
	public static void main(String[] args) {
		int n = IOTools.readInt();
		
	final  int a = 3;
		
		switch (IOTools.readInt()) {//7
		default:
			System.out.println("defualt");
		case 0:
			System.out.println(0);
			
		case 1:
			System.out.println(1);
			
		case 2:
			System.out.println(2);
			break;
			
		case a:
			System.out.println(3);
		
	

		
		}
		
		System.out.println("weiter mit Programm");
		
	}

}

//class Test{
//	final int x =1;
//	final static int y = 3;
//	void go(){
//		final int a = 3;
//	}
//}
