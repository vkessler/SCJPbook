package geschaeft;

import java.io.IOException;
import java.util.TreeMap;

public class Geschaeft {
	
	int test;
	
	

	public static void main(String[] args) {
		
		TreeMap<String, Double> tmp = null;
		Geschaeft.Person p = new Geschaeft.new Person();
		p.name = "Fred";
		
		try {
			tmp = ProduktIO.produktListeEinlesen("C:\\Users\\vkessler\\Downloads\\geschaeft\\obstliste.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(tmp);
		
		
	}

	static class Person {
		String name;
	}
	
}
