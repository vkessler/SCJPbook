package dateCalendar_10_14;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateCalendar {
	

	public static void main(String[] args) {
	
		Date d = new Date();
		String s = d.toString();
		System.out.println(s);
		
		Locale loc = new Locale("DE","de");
		
		Calendar c = Calendar.getInstance(loc);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		d = c.getTime();
		s = df.format(d);
		
		
		System.out.println(s);
		
		Date now = new Date();
		System.out.println(now.getTime());
		
		Calendar cal  = Calendar.getInstance();
		Date     time = cal.getTime();
		DateFormat formatter = new SimpleDateFormat("dd.MM.YYYY", loc);
		System.out.println( formatter.format( time ) ); 
		
		
		
	}

}
