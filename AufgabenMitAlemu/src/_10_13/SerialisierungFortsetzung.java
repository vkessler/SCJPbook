package _10_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;





/*
 * Zusammenfassung:
 * 				-transient
 * 				-Serializable
 * 				-NotSerializableException
 * 				-Vererbung und Serialization
 * 				-InvalidClassException
 * 				-writeObject(Object) vs. readObject()
 */	

/*
 * Was kommt jetzt noch?
 * 			-static und Serialization: Statische Attribute werden nicht serialisiert.
 * 			-magische Serialisierungsprozess manipulieren...
 */

public class SerialisierungFortsetzung {
	public static void main(String[] args) {
		Produkt p = new Produkt(3.10, "Brot");
		
		
		
		System.out.println("Serialisiert: " + p);
		
		//Schreiben --> Seialisierung
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			 fos = new FileOutputStream("SeriaInt.ser");
			 oos = new ObjectOutputStream(fos);
			 oos.writeObject(p);
			 oos.close();//Empfohlen in finally block
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (NotSerializableException e) {
				
				e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Produkt.setMwst(19);
		
		
		//Lesen --> Deserialisierung
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Produkt r = null;
		
		try {
			 fis = new FileInputStream("SeriaInt.ser");
			 ois = new ObjectInputStream(fis);
			r =  (Produkt) ois.readObject();
			 oos.close();//Empfohlen in finally block
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("Deserialisiert : " + r);
		
		
	
		
		
		
	}

}


class Produkt implements Serializable{
	private double price;
	private String bezeichnung;
	public static int mwst = 7;
	/**
	 * @param price
	 * @param bezeichnung
	 */
	public Produkt(double price, String bezeichnung) {
		super();
		this.price = price;
		this.bezeichnung = bezeichnung;
	}
	/**
	 * @return the price
	 */
	public synchronized double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public synchronized void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the bezeichnung
	 */
	public synchronized String getBezeichnung() {
		return bezeichnung;
	}
	/**
	 * @param bezeichnung the bezeichnung to set
	 */
	public synchronized void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	/**
	 * @return the mwst
	 */
	public static synchronized int getMwst() {
		return mwst;
	}
	/**
	 * @param mwst the mwst to set
	 */
	public static synchronized void setMwst(int mwst) {
		Produkt.mwst = mwst;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produkt [price=" + price + ", bezeichnung=" + bezeichnung + ", mwst = " + mwst + "]";
	}
	
	
	
}