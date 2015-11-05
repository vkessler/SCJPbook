package exercise3_2;

import java.util.Date;

public class CheckGC {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memors: " + rt.totalMemory());
		System.out.println("Anzahl an Prozessoren auf die die JVM zugreifen kann: " 
							+ rt.availableProcessors());
		System.out.println("Before Memory = " + rt.freeMemory());
		
		Date d = null;
		for (int i = 0; i < 100000; i++) {
			d = new Date();
			d = null;			
		}
		
		System.out.println("After Memory = " + rt.freeMemory());
		
		for (int i = 0; i < 10; i++) {
			rt.gc();
			System.out.println("After GC Memory = " + rt.freeMemory());
		}
	
	
	}

}
