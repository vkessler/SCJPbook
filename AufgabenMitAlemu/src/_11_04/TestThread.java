package _11_04;

/*
 * JVM startet main - thread
 * 			main - thread kann weiterer Threads starten
 * 				Ein laufender Thread kann ein weiterer Thread starten
 * 
 * 				...
 */

public class TestThread {
	public static void main(String[] args) {
		MT t = new MT();// Object auf cem Heap!
		
		MT s = new MT();
		

		
		t.start();//run
		
		
		
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				
			System.out.println(e.getMessage());
			}
		}
		
		//t.start();//ISTE: erneut start aufrufen führt zu Runtimeexception.
		s.setName("Sandy");
		s.start();
		
		
	}

}

class MT extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				
			System.out.println(e.getMessage());
			}
		}
	}
}
