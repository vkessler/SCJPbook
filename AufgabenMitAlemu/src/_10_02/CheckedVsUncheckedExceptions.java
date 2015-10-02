package _10_02;

import java.io.IOException;

/*
 * Checked Exceptions: müssen entweder propagiert (throws ...) oder behandelt (try - catch) werden
 * 						sonst mekert der compiler ---> checked
 * 		Catch(T t) und throws T
 * 			T muss eine Is- A Beziehung zu Throwable haben
 * 
 * Wenn man selber eine Exception Klasse definiert, deklariert man die Klasse als Unterklasse von Exception
 * 
 * 		Throwable, Exception sind generiell checked Exceptions
 * 
 * Unchecked Exceptions:
 * 						-süpezielle Unterkllassen von Exception: RuntimeException (unterklassemn) 
 * 						und Error (Unterklassen: StackOverflowError)
 * 						-Der Compiler zwingt uns nicht solche Ausnahmen zu behandeln oder zu propagieren
 * 
 * 
 */

public class CheckedVsUncheckedExceptions {
static void go(int x) throws IOException, InterruptedException{
	
	if(x == 0) throw new IOException();
	if (x==1) throw new InterruptedException();
	if(x<0)
		try {
			throw new Throwable();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	if(x==2) throw new ClassCastException();
	
	
}
}
