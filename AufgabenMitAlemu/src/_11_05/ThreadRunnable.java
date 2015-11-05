package _11_05;
/*
 * Klasse Thread
 * Interface Runnable
 * 
 */
public class ThreadRunnable {
	public static void main(String[] args) {
		
		EinThread et = new EinThread();
		
		EinRunnableImplementierer er = new EinRunnableImplementierer();
		
		
		Thread t = new Thread();
		
		Thread t2 = new Thread(et);
		Thread t3 = new Thread(er);
		Thread t4 = new Thread(new Thread());
		
		et.start();
	//	er.start(); Error: start ist in Thread definiert und nicht in Runnable
		
		t.start();//Thread.run()
		t2.start();//EinThread.run()
		t3.start();//EinrunnableImplemnetierer.run()
		
	}

}

class EinThread extends Thread{
	@Override
	public void run() {
		System.out.println("run aus einem Thread");
	}
}

class EinRunnableImplementierer implements Runnable{

	@Override
	public void run() {
		System.out.println("run aus einem Runnable");
		
	}
	
}
