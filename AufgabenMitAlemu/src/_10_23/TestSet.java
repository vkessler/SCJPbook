package _10_23;

import java.util.HashSet;
import java.util.Set;

/*
 * Set:
 * 		-dynamisch
 * 		-Einträge sind einzigartig
 * 
 * HashSet verwendet die Methode hashCode und equals um Duplikate zu vermeiden
 * 			zuerst hashcode() und dadruch Bucket ermitteln, anschließend mittels equals() die Elemente im Bucket vergleichen
 * 
 * Achtung : Elemente in unterschiedlichen Buckets werden nicht verglichen
 * 
 * Man muss immer equals und hashcode folgendermaßen implementieren:
 * 
 * 			diese zwei Methoden sind inder Klasse Object definiert -> jede Klasse hat automatisch default Implentierung dieser Methoden
 * Default Implementierung: 
 * 						jedes Objekt hat eindeutige Hashwert
 * 						zwei Refenzvariable sind "mittels equals " gleich, wenn die variable auf ein und das selbe Objekt referenzieren!
 * 
 *  In der Regel möchte man aber:
 *  	
 * 
 */
public class TestSet {
	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<Integer>();
		System.out.println(intSet.add(12));
		System.out.println(intSet.add(3));
		System.out.println(intSet.add(5));
		System.out.println(intSet.add(12));
		
		System.out.println(intSet.size());
		
		System.out.println(intSet);
		Integer e = new Integer(13);
		Integer e2 = new Integer(13);
		intSet.add(e);
		intSet.add(e2);
		System.out.println(intSet);
		
		Box b1 = new Box(12,120);//geht ins bucket nummer 12
		Box b2 = new Box(12,175);//geht ins Bucket nummer 12
		Box b3 = new Box(13, 120);//geht ins bucket nummer 13
		
		Box b4 = b1;
		
		Set<Box> boxes = new HashSet<Box>();
		boxes.add(b1);boxes.add(b2);boxes.add(b3);boxes.add(b4);
		
		System.out.println(boxes.size());//3
		System.out.println(boxes);//
		
		
		
	}

}


class Box{
	int anzahl;
	double price;
	Box(int anzahl, double price){
		this.anzahl = anzahl;
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Box [anzahl=" + anzahl + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return anzahl;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (price != other.price)
			return false;
		return true;
	}
	
	
	
}