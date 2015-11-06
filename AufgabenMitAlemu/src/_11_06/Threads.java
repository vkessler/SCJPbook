package _11_06;
/*
 * Runnable 
 * 			run()
 * Thread
 * 		-run()
 * 		-start()
 * 
 * Arbeit und arbeiter
 */
public class Threads {
	public static void main(String[] args) {
		MT target = new MT();
		
		Thread t = new Thread(target);
		t.start();
		
		Target r = new Target();
		
		Thread t2 = new Thread(r);
		t2.start();
		
		MT m = new MT(r);//
		m.start();
		
	}

}

class MT extends Thread {

		public void run() {
			System.out.println("MT");
		
	}
		
	public 	MT(Runnable r){
			super(r);
		}

	public MT() {
		// TODO Auto-generated constructor stub
	}
}


class Target implements Runnable{

	@Override
	public void run() {
		System.out.println("Target");
		
	}
	
}