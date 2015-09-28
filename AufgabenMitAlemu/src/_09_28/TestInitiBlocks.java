package _09_28;
/*
 * statische Init Blocks werden ein einziges Mal, wenn die Klasse gealden wird, vom class Loader
 * ausgeführt.
 * 
 * class Loader ist ein Bestanteil von JRE (wie Garabge Collector, Scheduler ...) und generiert statische
 * Objekte. Das Objekt heißt Klassenname.class (z.B. Produkt.class)
 * Instance Init Blocks werden jedes Mal ausgeführt, wenn ein Instanz (Objekt) der Klasse durch den Konstruktor erzeugt 
 * wird.
 * 
 * Instnace Init Blocks werden unmittlbar nach super() ausgeführt, und zwar in der Reihenfolge wie die 
 * im Sorcecode auftauschen.
 */

public class TestInitiBlocks {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		Animal a2 = new Animal();
		
		Bird b = new Bird();
	}

}

class Animal{
	{System.out.println("Init block 1 in animal ");}
	
	Animal(){
		
		
		System.out.println("Default animal");
	}
	
	
	{System.out.println("init block 2 in animal");}
	
	Animal(int x){
		super();
		
		System.out.println("int x Animal ");
	}
	{System.out.println("Init block 3 in animal");}
	
}



class Bird extends Animal{
	Bird(){
		System.out.println("default bird");
	}
	{System.out.println("Init block 1 in bird");}
}
