package _11_09;
/*
 * wait(), notify(), notifyAll()
 * 
 * 
 */

public class ThreadInteraction {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
	
		
		Reader r = new Reader(cal);
		Reader r2 = new Reader(cal);
		Reader r3 = new Reader(cal);
		
		r.start();//Reader.run()
		r2.start();
		r3.start();
		
		cal.start();
		//cal2.start();cal3.start();
	
}

}
