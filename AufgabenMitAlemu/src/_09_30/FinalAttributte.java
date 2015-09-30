package _09_30;

public class FinalAttributte {
public static void main(String[] args) {
	final int x;
	
	Konto k = new Konto(1,2,"Test");
	k.blz = 123;
}
}
/*
 * final deklariert Attribute müssen spätstens im Konstruktor initialisiert werden
 * 
 */
class Konto{
	final int blz;
	final int knr = 6692750;
	final String name = "Meyer";
	
	public Konto(int b, int k, String s) {
		blz = b;
	}
	
	
	
}