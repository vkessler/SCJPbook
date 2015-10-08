package _10_07;

/*
 * String 
 * 			-Immutable
 * StringBuffer und StringBuilder: Mutable
 * 		Diese zwei Klassen beinhalte die gleiche Menge an Methoden. Wann soll ich was benutzen?
 * 	StringBuffer: langsam, Thread - Safe (lerne wir während thread Programmierung)
 * 					-alle Methode sind "synchronized"
 * StringBuilder: 
 * 			existiert erst seit Java, Performanter, die Methoden sind nicht "synchronized", ist nicht Thread - safe
 */
public class StringBuilderStringBuffer {
	public static void main(String[] args) {
		StringBuilder sb;
		StringBuffer buf;
		sb = new StringBuilder("Spring");
		
		StringBuilder result = sb.append(" Summer");
		
		System.out.println(sb);//Sehen Sie die Mutablität der Klasse StringBuilder im Gegensatz zu String
		System.out.println(result);
	}

}
