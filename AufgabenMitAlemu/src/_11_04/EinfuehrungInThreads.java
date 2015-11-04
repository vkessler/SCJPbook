package _11_04;
/*
 * Bisher wir haben "single Threaded" Application
 * 		Ein einzige Threead : main - Thread
 * 
 * Motivation:
 * 		Warum multi - threaded Application?
 * 			-Parallel Verarbeitung (Multiprozessorsysteme) von Abläufe ist Performanter
 * Thread:	
 * 			-"Leicht geiwichtiger Prozess"
 * 			-eige Call stack
 */

public class EinfuehrungInThreads {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
	}

}
