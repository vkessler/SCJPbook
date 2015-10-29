package _10_26;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(100); 
		ts.add(-100); 
		ts.add(50);
		ts.add(100);
		System.out.println(ts.size());
		System.out.println(ts);
		
		TreeSet<Produkt> produkte = new TreeSet<Produkt>(new SortName());
		produkte.add(new Produkt(100, "Buch"));
		produkte.add(new Produkt(120, "Whisky"));
		System.out.println(produkte.size());
		System.out.println(produkte);
		System.out.println();
		
		for(Produkt p : produkte){ // java 5
			System.out.print(p.name + " ");
			
		}
		
//		for (int i = 0; i < produkte.size(); i++){
//			System.out.println(produkte.get);
//		}
		
		Iterator iter = produkte.iterator();
		System.out.println();
		
		while(iter.hasNext()){
			Produkt p = (Produkt) iter.next();
			System.out.print(p.name + " ");
		}
		
	}

}

class SortName implements Comparator<Produkt>{

	@Override
	public int compare(Produkt arg0, Produkt arg1) {
		
		return arg0.name.compareTo(arg1.name);
	}
	
}

class Produkt /*implements Comparable<Produkt>*/{
	int price;
	String name;
	/**
	 * @param price
	 * @param name
	 */
	public Produkt(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produkt [price=" + price + ", name=" + name + "]";
	}
//	@Override
//	public int compareTo(Produkt arg0) {
//		
//		return new Integer(price).compareTo(arg0.price);
//	}
	
}
