package _10_14;

import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
	public static void main(String[] args) {
//	long i = 	Long.MAX_VALUE - System.currentTimeMillis();
//	System.out.println(i);
		
//		Date d = new Date();
//		System.out.println(d);
//		Date d2 = new Date(System.currentTimeMillis());
//		System.out.println(d2);
//		Date d3 = new Date(1000);
//		System.out.println(d3);
//		System.out.println(new Date(Long.MAX_VALUE));
		
	Date  max = new Date((12 * 365 + 5 ) * 24 * 60 * 60 * 1000L);//Geboren: Jan 3 1982 um 0:00
//		System.out.println(max);
//		Date  peter = new Date((16 * 365 + 3 ) * 24 * 60 * 60 * 1000L);
//		
//		
//		if(max.after(peter)){
//			System.out.println("peter is older than max");
//			
//		}
//		else{
//			System.out.println("max is older than peter");
//		}
//		
//		System.out.println("max is born on month " + max.getMonth());
//		System.out.println(max);
//		System.out.println("max is born on Day: " + max.getDay());
		System.out.println(Calendar.getInstance().getTime());
		Calendar cal = Calendar.getInstance();
		
		
		cal.setTime(max);
		
		
		System.out.println(max);
		cal.add(Calendar.DAY_OF_WEEK_IN_MONTH, 3);
		System.out.println(cal.getTime());
		
		//3.5.1982
		 cal.set(1982, 5, 17);
		 
		 Date dat = cal.getTime();
		 
		System.out.println(cal.getTime());
		
		
		
	}

}
