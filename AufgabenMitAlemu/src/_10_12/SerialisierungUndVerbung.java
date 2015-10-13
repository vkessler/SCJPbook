package _10_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Die Serializablität ist eine vererbare eigenschaft:
 * 			Sehen sie Beispiel unten. Klasse Human implemntiert nicht explicit den Interface Serializable
 * 			aber als Kindklasse von einer serializable Klasse (Mamal) ist serializable
 */

/*
 * Bei der Deserialiserung, es entssteht ein neues Objekt (neuer Hashwert) vgl. Konstruktor
 */

public class SerialisierungUndVerbung {
	public static void main(String[] args) {
		Animal a = new Animal("Animal");
		Mamal m = new Mamal("Mamal", 12);
		Human h = new Human("Human", 14, 3);
		
	
		System.out.println(h);
		
		
		//Schreiben --> Seialisierung
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			 fos = new FileOutputStream("SeriaInt.ser");
			 oos = new ObjectOutputStream(fos);
			 oos.writeObject(h);
			 oos.close();//Empfohlen in finally block
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (NotSerializableException e) {
				
				e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		//Lesen --> Deserialisierung
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Human r = null;
		
		try {
			 fis = new FileInputStream("SeriaInt.ser");
			 ois = new ObjectInputStream(fis);
			r =  (Human) ois.readObject();
			 oos.close();//Empfohlen in finally block
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	
		System.out.println(r);
		
	}

}

class Animal{
	String herkunft;

	/**
	 * @param herkunft
	 */
	public Animal(String herkunft) {
		super();
		this.herkunft = herkunft;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [herkunft=" + herkunft + "]";
	}

	/**
	 * 
	 */
	public Animal() {
		super();
		herkunft = "Afrika";
	}
	
	
}

class Mamal extends Animal implements Serializable{
	public Mamal(String herkunft, int kinder) {
		super(herkunft);
		this.kinder = kinder;

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mamal [kinder=" + kinder + ", herkunft=" + herkunft + "]";
	}

	int kinder;
}
class Human extends Mamal {
	public Human(String herkunft, int kinder, int age) {
		super(herkunft, kinder);
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Human [age=" + age + ", kinder=" + kinder + ", herkunft="
				+ herkunft + "]";
	}

	int age;
	
}
