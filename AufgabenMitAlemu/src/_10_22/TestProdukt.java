package _10_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestProdukt {
	public static void main(String[] args) {
		ArrayList<Produkt> produkte = new ArrayList<Produkt>();
		
		produkte.add(new Produkt("Banana", 12, "Brasilien"));
		produkte.add(new Produkt("Orange", 3, "Spanien"));
		produkte.add(new Produkt("Oliven", 14, "Italien"));
		produkte.add(new Produkt("Spargel", 6, "Deutschland"));
		
		System.out.println("unsortiert");
		System.out.println(produkte);
		
		Collections.sort(produkte);//natural
		
		System.out.println("nach Kennung sortiert");
		System.out.println(produkte);
		
		System.out.println("nach price sortiert");
		Collections.sort(produkte, new Produkt());
		System.out.println(produkte);
		
		System.out.println("nach Herkunft sortiert");
		Comp co = new Comp();
		Collections.sort(produkte,co);
		
	}

}

class Comp implements Comparator<Produkt>{

	@Override
	//Herkunft
	public int compare(Produkt o1, Produkt o2) {
		
		return o1.getHerkunft().compareTo(o2.getHerkunft());
	}
	
}
