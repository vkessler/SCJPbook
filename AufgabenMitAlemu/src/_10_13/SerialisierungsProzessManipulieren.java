package _10_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialisierungsProzessManipulieren {
	public static void main(String[] args) {
		Autor schreiber = new Autor(10, 45000);
		Book p = new Book(schreiber, "SCJP", "1234rt5");
		
		
		
		System.out.println("Vor der Serialisiert: " + p);
		
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
		
		
		
		
		//Lesen --> Deserialisierung
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Book r = null;
		
		try {
			 fis = new FileInputStream("SeriaInt.ser");
			 ois = new ObjectInputStream(fis);
			r =  (Book) ois.readObject();
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

class Book implements Serializable{
	transient Autor a;
	String title;
	String isbn;
	
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();//Standard Serialisierung
		
		oos.writeDouble(a.getUmsatz());
		oos.writeInt(a.getAnzahlBuecher());
		
		
		
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
		ois.defaultReadObject();//Standard Deserialisierung
		double d = ois.readDouble();
		a = new Autor(ois.readInt(), d);
	}

	/**
	 * @param a
	 * @param title
	 * @param isbn
	 */
	public Book(Autor a, String title, String isbn) {
		super();
		this.a = a;
		this.title = title;
		this.isbn = isbn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", Autor = " + a + "]";
	}

	/**
	 * @return the a
	 */
	public  Autor getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public  void setA(Autor a) {
		this.a = a;
	}

	/**
	 * @return the title
	 */
	public  String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public  void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the isbn
	 */
	public  String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public  void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
class Autor{
	private int anzahlBuecher;
	private double umsatz;
	/**
	 * @return the anzahlBuecher
	 */
	public synchronized int getAnzahlBuecher() {
		return anzahlBuecher;
	}
	/**
	 * @param anzahlBuecher the anzahlBuecher to set
	 */
	public  void setAnzahlBuecher(int anzahlBuecher) {
		this.anzahlBuecher = anzahlBuecher;
	}
	/**
	 * @return the umsatz
	 */
	public double getUmsatz() {
		return umsatz;
	}
	/**
	 * @param umsatz the umsatz to set
	 */
	public  void setUmsatz(double umsatz) {
		this.umsatz = umsatz;
	}
	/**
	 * @param anzahlBuecher
	 * @param umsatz
	 */
	public Autor(int anzahlBuecher, double umsatz) {
		super();
		this.anzahlBuecher = anzahlBuecher;
		this.umsatz = umsatz;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Autor [anzahlBuecher=" + anzahlBuecher + ", umsatz=" + umsatz
				+ "]";
	}
	
	
}