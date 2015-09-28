package _09_24;
/*
 * Wrapper Klassen
 * 
 * Heute:
 * 		-Type Conversion
 * 				-primitive DT:
 * 								-Widening (von lein nach Groß: int -> long -) -- implizites
 * 								-explizites Casten (double -> byte)
 * 				-Referenz Datentypen:
 * 								-upcast
 * 								-downcast
 * 				-Typkonvertierung zwischen Wrapper Klassen und primitive Datentypen (java 5)
 * 		-Autoboxing / Autounboxing
 * 		-Overloading
 * 
 */

public class WrapperKlasenUndOverloading {
public static void main(String[] args) {
	double d = 2;
	byte b = (byte) d;
	double c = b;
	
	Integer i = new Integer(12);
	int a = i;//Autounboxing
	//vor java 5
	a = i.intValue();
	
	Integer j = 25;//Autoboxing new Integer(25)
	
}
}
