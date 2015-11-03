package __11_02;
/*
 * Generische Methoden:
 * 			-Syntax: <Typparameter> RWT weiteres
 */

class MyThread extends Thread{
	
}
public class GenerischeMethoden<E> {
	public int add (int x, int y){
		return x + y;
	}
	
	public String con(String s1 , String s2){
		return s1 + s2;
	}
	
	public <T extends Thread> int concat (T t1, E t2){
		return t1.hashCode() + t2.hashCode();
	}
	public static void main(String[] args) {
		GenerischeMethoden<String> o = new GenerischeMethoden<String>();
		o.concat(new Thread(), "Test");
		o.concat(new MyThread(), new String("abc"));
		
	}

}
