package geschaeft;

import java.io.IOException;
import java.util.TreeMap;

public class Geschaeft {

	public static void main(String[] args) {
		
		TreeMap<String, Double> tmp = null;
		
		try {
			tmp = ProduktIO.produktListeEinlesen("C:\\Users\\vkessler\\Downloads\\geschaeft\\obstliste.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(tmp);
		
	}

}
