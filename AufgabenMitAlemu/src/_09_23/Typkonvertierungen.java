package _09_23;
/*
 * byte  - > short -> int -> long -> float -> double (Automatische Typanpassung (promotion))
 * 			 char -> int -> long -> float -> double
 */
public class Typkonvertierungen {
public static void main(String[] args) {
	byte b = 12;
	
	short s = b;//implizites Cast
	
	byte b2 = (byte) s;
	
	System.out.println(Short.MAX_VALUE);
	System.out.println(b2);
	
	short s2 = 128;
	
	byte b3 = (byte)s2;//explizites Cast
	System.out.println(b3);
	
	byte a = 127;
	byte a2 = 3;
	int summe =  a + a2;//implizites Cast byte zu int
	System.out.println(summe);
	
	/*
	 * double d = 5; //automatische typanpassung: int -> double (5 als ganze Zahl Literale ist int)
	 * int i = 5L; compiler Fehler (von großer nach klein muss explizit angepasst werden)
	 * 
	 * unmöglich zu/von boolean zu casten
	 * 
	 */
	int i = (int)5L;
	
}
}
