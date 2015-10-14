package _10_14;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import Prog1Tools.IOTools;

/*
 * Date und Calendar
 * Calendar -> Date -> DateFormat.format(Date)
 * DateFormate(Locale)
 */

public class Zusammenfassung {
	public static void main(String[] args) {
		String s = IOTools.readString("Date: ");
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMANY);
		Date d = null;
		try {
			 d = df.parse(s);
		} catch (ParseException e) {
			System.out.println("Fehler beim Parsen");
			e.printStackTrace();
		}
		
		System.out.println(df.format(d));
	}

}
