package _09_28;

public class Produkt {
	double preis;
	String bezeichnung;
	static int mwst = 7;
	/**
	 * @param preis
	 * @param bezeichnung
	 */
	
	static {
		System.out.println("statische I - Block");
	}
	public Produkt(double preis, String bezeichnung) {
		super();
		this.preis = preis;
		this.bezeichnung = bezeichnung;
		System.out.println("Konstruktor");
	}
	
	
	

}
