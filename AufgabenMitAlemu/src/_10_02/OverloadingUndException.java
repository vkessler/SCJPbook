package _10_02;

/*
 * Overriding Rules:
 * 				1.
 * 				2.
 * 				3.
 * 				4. Die überschreibende Methode darf keine neue checked Exception werfen
 * 					Falls eine Exception geworfen, der Typ muss ein Untertyp von der Exceptionklasse, die
 * 					von der überschriebenen Methode geworfen wird, sein.
 */

public class OverloadingUndException {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.age = 45;
		a.fertilitiy = false;
		try {
			a.giveBirth();
		} catch (SubException e) {
			e.print(a);
		}

	}

}

class SubException extends Exception {
	void print(Animal a) {
		System.out.println(a.age);
		
		Integer i;
	}

}

class SubSubException extends SubException {

}

class Animal {
	boolean fertilitiy;
	int age;

	Animal giveBirth() throws SubException {
		if (fertilitiy)
			return new Animal();
		else
			throw new SubException();
	}
}

class Bird extends Animal {
	public Bird giveBirth() {
		return new Bird();
	}
}
