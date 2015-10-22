package _10_22;

import java.util.Comparator;

public class Produkt implements Comparable<Produkt>, Comparator<Produkt> {
	String kennung;
	int price;
	String herkunft;
	
	Produkt(){
		
	}
	/**
	 * @param kennung
	 * @param price
	 * @param herkunft
	 */
	public Produkt(String kennung, int price, String herkunft) {
		super();
		this.kennung = kennung;
		this.price = price;
		this.herkunft = herkunft;
	}
	/**
	 * @return the kennung
	 */
	public String getKennung() {
		return kennung;
	}
	/**
	 * @param kennung the kennung to set
	 */
	public void setKennung(String kennung) {
		this.kennung = kennung;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the herkunft
	 */
	public String getHerkunft() {
		return herkunft;
	}
	/**
	 * @param herkunft the herkunft to set
	 */
	public void setHerkunft(String herkunft) {
		this.herkunft = herkunft;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[kennung=" + kennung + ", price=" + price
				+ ", herkunft=" + herkunft + "]" + "\n";
	}
	
	@Override
	
	//Kennung
	public int compareTo(Produkt o) {
		
		return this.kennung.compareTo(o.getKennung());
	}
	@Override
	
	//price
	public int compare(Produkt o1, Produkt o2) {
		
		return new Integer(o1.getPrice()).compareTo(o2.getPrice());
	}
	

}
