package _10_09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * IO:
 * 		-Werte sind im Programm gespeichert: primitive Werte, String, Objekte ...
 * 		-werte werden in eine Datei als text gespeichert
 * Übertragung: char - orientiert
 * 
 * Serialisierung: Objekte in eine Datei schreiben
 * Deserialisierung: Objekte aus einer Datei ins Programm einlsesen
 * Übertragung: Objekt - basiert
 * 				
 * 
 */
/*
 * Was bietet uns Java für Serialisierung?
 * 		-Keywords (transient), API(Streams, Serializable, readObject(), writeObject())
 * 			
 */
public class EinfuehrungSerialisierung {
	public static void main(String[] args) {
		//Schreibe --> Serialisierung
		
		Produkt obj = new Produkt("Wasser", 1.29, 7);
		
		try {
			FileOutputStream fos = new FileOutputStream(new File("test.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			
		} catch (FileNotFoundException e) {
			
			
		} catch (IOException e) {
			System.out.println("Es ist eine Exception ...");
		}
		
		
		
		
		
		
		//Lesen --> Deserialisierung
		Produkt i = null;
		try {
			FileInputStream fis = new FileInputStream(new File("test.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			i= (Produkt) ois.readObject();
			ois.close();
			
		} catch (FileNotFoundException e) {
			
			
		} catch (IOException e) {
			System.out.println("Es ist eine Exception ...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj + " " + i);
	}

}
class Produkt implements Serializable{
	String name;
	double Price;
	int mwst;
	
	
	/**
	 * @param name
	 * @param price
	 * @param mwst
	 */
	public Produkt(String name, double price, int mwst) {
		super();
		this.name = name;
		Price = price;
		this.mwst = mwst;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produkt [name=" + name + ", Price=" + Price + ", mwst=" + mwst
				+ "]";
	}
	
	
}
