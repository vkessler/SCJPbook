package _11_05;

public class Aufgabe {
	public static void main(String[] args) {
	Runnable r = new Thread(){
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	};
	
	r.run();
	((Thread) r).start();
	
	new Thread(r).start();;
	
	
	}

}
