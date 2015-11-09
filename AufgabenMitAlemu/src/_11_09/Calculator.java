package _11_09;

public class Calculator extends Thread {
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 100; i++){
				total += i;
			}
			this.notify();//notifyAll()
		}
	}

}
