package _11_05;

public class Zusammenfassung {
	

	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		
		MT t2 = new MT();
		t2.start();
		
		Thread t3 = new MT();//upcast
		t3.start();
		
		
		Thread t4 = new Thread(){
		
			@Override
			public void run() {
			System.out.println("run --- lokal");
			}
		};
		
		t4.start();
		
		new Integer(123);
		
		new Thread(){
			public void run() {
				System.out.println("run ... 5");
			}
		}.start();
		
		
		
	}

}

class MT extends Thread{
	@Override
	public void run() {
	System.out.println("run...");
	}
	
}