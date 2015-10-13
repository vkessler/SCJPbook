package _10_12;

import java.io.Serializable;

/*
 * Serilisiere und deserialisiere Account - Objekt in der main Methode. 
 * 		-Ergänzen Sie die Klasse Account und Person, wenn es notwendig ist. 
 * 		-Aus Datenschutzgründe soll balance nicht serialisiert werden
 */
public class Aufgabe {
	public static void main(String[] args) {
		//Serialiazation
		
		//Deserialization
	}

}


class Account implements Serializable{
	transient double balance;
	Person owner;
	int knr;
	int blz;
	
}
class Person implements Serializable {
	String owner;
	String inst;
}