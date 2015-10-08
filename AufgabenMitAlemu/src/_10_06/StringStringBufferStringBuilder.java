package _10_06;
/*
 * String und String ähnliche Klassen
 * 
 * Wir haben überhaupt mit primitie Datentypen + die zwei vordefinierte DT (String und Array) begonnen
 * 
 * String:
 * 		-stellt eine Zeichenkette dar (Zeichen = unicode Zeichen = Ascii Zeichen + Nationale Zeichen) +
 * 		-java.lang
 * 		-String Literale: "test",  +-
 * 		-ausführlich über Atributen , Konstruktoren, Methoden und überhapt über die Klasse ? -
 * 
 * Neue: Immutablität, String Constant Pool
 * 
 * 
 */

/*
 * String ist final, kann nicht erweitert
 * String Objekte sind immutable, die Objekte können nicht manipuliert werden
 * 		-Es gibt keine Settermethoden in der Klasse String
 * 
 */

public class StringStringBufferStringBuilder {
	public static void main(String[] args) {
//		String s = "abc";//Literale
//		char[] ca = {'a', 'b','c'};
//		
//		String s2 = new String("Test");//Konstruktor Aufruf
//		
//		String s3 = new String(); //empty String
//		
//		String s4 = new String(s2);//
//		char c = s2.charAt(-3);//Strings sind index basiert, index beginnt bei 0 und endet bei len -1
//		
//		int len = s2.length();
//		int n =  ca.length;
		
		String name = "alemu";
		String namenschild = name.toUpperCase();
		
		System.out.println(name);
		System.out.println(namenschild);
		
		name  = name.concat(", Wondmu");
		System.out.println(name);
	//	System.out.println(person);
		
		
		
	}

}
