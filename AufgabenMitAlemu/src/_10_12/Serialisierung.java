package _10_12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/*
 * writeObject() und readObject()
 */
public class Serialisierung {
public static void main(String[] args) {
	String s;
	File f;
	Scanner sc;
	Integer i = new Integer(100);
	Auto a = new Auto(12, 3);
	System.out.println("Serialisiert: " + a);
	
	//Schreiben --> Seialisierung
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	
	try {
		 fos = new FileOutputStream("SeriaInt.ser");
		 oos = new ObjectOutputStream(fos);
		 oos.writeObject(a);
		 oos.close();//Empfohlen in finally block
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (NotSerializableException e) {
			
			e.printStackTrace();
	}catch (IOException e) {
		
		e.printStackTrace();
	}
	
	i = new Integer(200);
	
	
	//Lesen --> Deserialisierung
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	Auto r = null;
	
	try {
		 fis = new FileInputStream("SeriaInt.ser");
		 ois = new ObjectInputStream(fis);
		r =  (Auto) ois.readObject();
		 oos.close();//Empfohlen in finally block
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	System.out.println("Deserialisiert : " + r);
	System.out.println(i);
	
}


}

class Auto implements Serializable{
	int age = 3;
	transient Rad r;

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auto [age=" + age + ", r=" + r + "]";
	}



	/**
	 * @param age
	 */
	public Auto(int age, int n) {
		super();
		this.age = age;
		r = new Rad(n);
	}
	
	
}
//class MyRad extends Rad implements Serializable{ // was ist dann wenn Rad final deklariert wurde ?
//	
//
//	public MyRad(int anzahl) {
//		super(anzahl);
//		// TODO Auto-generated constructor stub
//	}
//	
//}

class Rad implements Serializable{
	int anzahl ;

	/**
	 * @param anzahl
	 */
	public Rad(int anzahl) {
		super();
		this.anzahl = anzahl;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rad [anzahl=" + anzahl + "]";
	}
	
	
}
