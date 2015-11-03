package _11_03;
public class Aufgabe {
	public static void main(String[] args) {

		// Deklaraiere eine Variable p vom Typ Point und initialisiere diese!
		// Deklaraiere eine Variable l vom Typ Line und initialisiere diese!
		
		Geometry.Point p = new Geometry().new Point() ;
		Geometry.Line l = new  Geometry.Line();
		
	}
}



class Geometry {
	class Point {
		int x;
		int y;
	}

	static class Line {
		Point p;
		Point q;
	}

	void print(Point pt) {
		System.out.println(pt.x + " " + pt.y);

		Line l = new Line();
		Point p = new Point();
	}
}