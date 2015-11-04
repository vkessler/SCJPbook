package _11_04;

/*
 * Standard Vorgehensweise: Es gibt 2 :
 * 		1. 
 * 			-Man definiert ein Threa-fähige Klasse : extends Thread
 * 					run() Überschreiebn: Hier definiert man die Arbeit des Threads
 * 			-Intsnzieren
 * 			-start()
 * 
 * 
 * 
 * 		
 */

public class Test {
	public static void main(String[] args) {
		Lieferer l = new Lieferer();
		l.setName("Alemu");
		//l.start();
		l.start();
		//int [] x = new int[-5];
		System.out.println(Thread.currentThread().getName() + " fertig");
		
	}

}

class Lieferer extends Thread{
	@Override
	public void run() {
		
		adressErmitteln();
		fahrzeugcheck();
		System.out.println("Ich bin Herr " + Thread.currentThread().getName() + " und bin der Lieferer von Hallo Pizza");
		System.out.println(Thread.currentThread().getName() + " fertig");
		
	}
	
	void adressErmitteln(){
		System.out.println("Adresse ermittelt");
	}
	void fahrzeugcheck(){
		System.out.println("Fehrzeug ist in Ordnung");
	}
	
}


