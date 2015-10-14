package _10_14;
/*
 * Aufgabe 1:
 * 		Es gibt die Methode Calendar.add(...) und Calendar.roll(...)
 * 
 * 		Was ist der Unterschied zwischen diesen Methoden?
 * 
 * Aufgabe 2:
 * 			Calendar cal = Calendar.getInstance();
 * 			Sustrahiere 3 Wochen Tagen von cal !
 * 
 * Aufgabe 3:
 * 			Stellen Sie Datum = Mittwoch, 14. Oktober 2015 als ein Date Object dar und anschließend 
 * 
			konviereten Sie dieses zu eine ausfühliche Darstellung auf Portugesisch in Brazil.
 * 
 */

import java.text.DateFormat;
import java.util.*;

public class Aufgabe {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(1990, 9, 3);
		Date einheit = cal.getTime();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
		System.out.println("Deutsche Einheit: " + df.format(einheit));
		
		cal.add(Calendar.DAY_OF_MONTH, 33);
		Date future = cal.getTime();
		System.out.println("Die Methode Calendar.add() addiert die angegebene Zeitspanne dazu: " + df.format(future));
		
		cal.set(1990, 9, 10);
		cal.roll(Calendar.DAY_OF_MONTH, 33);
		Date futureRoll = cal.getTime();
		System.out.println("Die Methode Calendar.roll() addiert die an " + df.format(futureRoll));
		
		
	}

}
