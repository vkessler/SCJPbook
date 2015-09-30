package _09_30;

import java.io.IOException;

import Prog1Tools.IOTools;

/*
 * Exceptions (Ausnahme) Handling
 * 		Fortsezung "Flow Control"
 * 
 * 		
 */
public class ExceptionsInJava {
	public static void main(String[] args) {
	
		int x = IOTools.readInt("Geben Sie eine ganze Zahl");
		int y = IOTools.readInt("Geben Sie eine ganze Zahl (Bitte nicht 0!)");
		
		float result = Float.NaN;
		try{
			result	= x/y;//risikanter Code
			System.out.println("Quotient:= " + result);
		}catch(NullPointerException ae){
			System.out.println("Warnung: Nenner darf nicht zero sein!!!");
		}
		
		
		System.out.println("Programm normal terminiert");
	}

}
