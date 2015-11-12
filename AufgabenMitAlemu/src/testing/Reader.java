package testing;

public class Reader extends Thread {
	Calculator c;
	
	public Reader(Calculator calc) {
		c = calc;
	}
	
	public void run() {
		synchronized (c) {
			System.out.println("Waiting for calculation...");
			try {
				c.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is: " + c.total);
			
			
		}
	}
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Reader(calculator).start();
		calculator.start();
		
		StringBuffer s = new StringBuffer("123456789");
		System.out.println(s.delete(0,3).replace(1,3,"24")//.delete(4,6)
				);
		
		
	}
	
	static class Calculator extends Thread {
		int total;
		
		public void run() {
			synchronized (this) {
				for (int i = 0; i < 100 ; i++) {
					total += i;
				}
				notify();
			}
		}
	}

}
