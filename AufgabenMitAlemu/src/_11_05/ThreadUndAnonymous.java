package _11_05;

public class ThreadUndAnonymous {
	
	public static void main(String[] args) {
		
		
		new Thread(new Thread("Abebe"){
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}, "Tadesse").start();
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
		}, "Hanna").start();
		
		System.out.println(Thread.currentThread().getName());
		
	}

}
