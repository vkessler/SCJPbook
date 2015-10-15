package _10_14;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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
public class Aufgabe {
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	System.out.println(DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY).format(cal.getTime()));
	
//	System.out.println(cal.getFirstDayOfWeek());
//	System.out.println(Calendar.SUNDAY);
	
	//cal donnerstag, 15 Oktober (Mon(12) - Sonn (18))
	cal.roll(Calendar.DAY_OF_WEEK, 17);
	
	System.out.println(DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY).format(cal.getTime()));
	
	String deutschFull = "Mittwoch, 14. Oktober 2015";
	Date d = null;
	try {
	d =	DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY).parse(deutschFull);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String portBrFull = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR")).format(d);
	System.out.println(portBrFull);
	System.out.println(deutschFull);
	
	
}
}
