package _10_20;
/*
 * Arrays und arraylist sind äquivalent
 * Aufgabe 1: Machen Sie eine Gegenüberstellung (Vergleich: Vor- und Nachteil)
 * 
 * Aufgabe 2: Array und  ArrayList sind "ordered"- Einfügereihenfolge, aber die Elemente Sind nicht sortiert.
 * 
 * 			-Schauen Sie sich nach Klassen für das Sortieren/Suchen von arrays und ArrayList
 * 					(Arrays, Collections)
 * 			
 */
import java.util.ArrayList;

public class Aufgabe {
	
	public static void main(String[] args) {
		
		Bier becks = new Bier(4.8, "Becks");
		Bier rothaus = new Bier(4.9, "Rothaus");
		
		ArrayList<Bier> al = new ArrayList<Bier>(); 
		al.add(becks);
		al.add(rothaus);
		
		for (Bier b : al) System.out.println(b);
		
	}

}

class Bier {
	private double vol;
	private String name;
	
	Bier(double vol, String name) {
		this.vol = vol;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + "\t Alkoholgehalt: " + vol;
	}
	
}
