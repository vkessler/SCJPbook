package _10_01;

public class ExceptionAusloeser {
	static Animal tier;
public static void main(String[] args) {
	int[] ints = {1,2,3};
	int a  = 12, b = 0;
	try {
		//Rissikanter Code
		int result = a / b;			//möglicher Fehler: b = 0
		tier.go();					//möglicher Fehler tier = null 		
		System.out.println(ints[3]);// kein gültiger
		((Bird) tier).foo();		//classcast
		
	} catch (Exception e) {
		
	}
}
}

class Animal{
	void go(){
		System.out.println("animal");
	}
}
class Bird extends Animal{
	void go(){
		System.out.println("bird");
	}
	void foo(){
		System.out.println("foo");
	}
}