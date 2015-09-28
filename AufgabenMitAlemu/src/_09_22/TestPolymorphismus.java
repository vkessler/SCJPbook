package _09_22;

public class TestPolymorphismus {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		//upcast (Automatische Typanpassung)
		Animal ab = new Bird();
		Animal ca = new Cat();
		Animal da = new Dog();
		
		Cat y = new Cat();
		
		Animal x =  y;//upcast
		
		//Dog d = (Dog)x;//zur Complierungszeit ist kein Problem, aber zur Laufzeit es gibt
		//eine Exception (Laufzeitfehler: ClassCastException)
		
		Cat c = (Cat)x;
		
		((Cat)x).bar();
		x.go();
	}

}

class Animal{
	public void go(){
		System.out.println("move");
	}
}
class Bird extends Animal{
	public void go(){
		System.out.println("fly");
	}
	public void foo(){
		System.out.println("foo aus Bird");
	}
}

class Dog extends Animal{
	public void go(){
		System.out.println("laufen");
	}
	public void f(){
		System.out.println(" f aus Dog");
	}
}

class Cat extends Animal{
	public void go(){
		System.out.println("springen");
	}
	public void bar(){
		System.out.println("bar aus Cat");
	}
}