package _10_14;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestDateformat {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.getTime());
//		
//		DateFormat df = DateFormat.getInstance();
//		System.out.println(df.format(cal.getTime()));
//		
//		DateFormat df2 = DateFormat.getDateInstance();
//		System.out.println(df2.format(cal.getTime()));
//		
//		DateFormat df3 = DateFormat.getTimeInstance();
//		System.out.println(df3.format(cal.getTime()));
		
//		DateFormat dffull = DateFormat.getDateInstance(DateFormat.FULL);
//		DateFormat dfLong= DateFormat.getDateInstance(DateFormat.LONG);
//		DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);
		
		DateFormat dffull = DateFormat.getDateInstance(DateFormat.FULL, new Locale("DE"));
		DateFormat dfLong= DateFormat.getDateInstance(DateFormat.LONG,Locale.ITALY);
		DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.ITALY);
		DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT,Locale.ITALY);
		
		System.out.println(dffull.format(cal.getTime()));
		System.out.println(dfLong.format(cal.getTime()));
		System.out.println(dfMedium.format(cal.getTime()));
		System.out.println(dfShort.format(cal.getTime()));
	}

}
