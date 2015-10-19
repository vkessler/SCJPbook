package _10_19;

import java.util.ArrayList;
import java.util.TreeSet;

/*
 * Um duplikate zu vemeiden oder Elemente zu sortieren Elemente in Collection müssen einige Methoden implementieren
 * 
 * equals(), hashCode(), toString()
 * 
 */
public class MethodenausObjectFuerCollections {

	
	public static void main(String[] args) {
		Point p = new Point(1, 8);
		Point q = new Point(1, 8);
		Point r = p;
		
		System.out.println("p: " + p);
		System.out.println("q: " + q);
		System.out.println("r: " + r);
		
		System.out.println(p == q);//false
		System.out.println(p.equals(q));// Die Dafault implementierung von equals in der Klasse Object ist wie ==
		
		System.out.println(p == r);//true
		System.out.println(p.equals(r));//true
		
		boolean b = true;
		boolean c = true;
		
		System.out.println("==: " +( b == c));//true: Es gibt kein separates Objekt für Primitive.
		
	}
	
	
}

class Point{
	int x;
	int y;
	/**
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)//p.equals(p)
			return true;
		if (obj == null)//p.equals(null)
			return false;
		if (getClass() != obj.getClass())//Point p = new Point() ; Circle c = new Circle(); p.equals(c)
			return false;
		
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
}
