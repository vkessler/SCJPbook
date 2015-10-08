package _10_07;
/*
 * String Literale: 	
 * 					String tauchen in der Praxis sehr häufig auf.
 * 					-bestimmte Zeichenketten tretten im code öfter
 * 
 * String Constant Pool: sonderbereich im Heap, der für String Literale vorgesehen ist
 * 				-Warum? Speicher im zu sparen
 * 
 */
public class StringImmutable {
public static void main(String[] args) {
	String s = "April";
	String geburtsMonat = "April";
	String viertesMonat = "April";
	String monat = "April";
	String str = "abc";
	//Bisher es gibt nur zwei String Objekt mit inhalt "April" und "abc"
	
	String s1 = new String("XYZ");
	String s2 = new String("XYZ");
	String s3 = new String("XYZ");
	//Aus dem Heap es werden drei String Objekte angelegt und ein einziges String Litera "XYZ" im string 
	//Constant Pool
	
	
}
}
