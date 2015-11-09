package _11_09;



public class Reader extends Thread {
Calculator c;

/**
 * @param c
 */
public Reader(Calculator c) {
	super();
	this.c = c;
}
@Override
	public void run() {
	synchronized(c){
		System.out.println("Walting for Calculation...");
		
		try {
			c.wait();;//Thread trägt sich auf der Warteliste wartet auf notify()
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(c.total);
		
	}
	}
}
