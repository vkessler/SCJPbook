package __11_02;
/*
 * Kapitel 8
 * Motivation:
 * 		-Klassenbeziehung:
 * 				-IS - A
 * 				-Has - A
 * 
 * 				-Äußer - Innere : Innere Klasse hat eine uneingeschränkter Zugriff auf Mitglieder der äußeren Klassen
 * 					(auch auf private Elemente)
 *	
 *Syntax:
 *		-Regulare Innere Klasse:
 *				steht an der Stelle wo auch Konstruktoren, Methoden und Atrribute vorkommen könnten
 */
public class EinfuehrungInInnereKlassen {
public static void main(String[] args) {
	Circle c = new Circle();
	
	Circle.Point p = c.new Point();
	Elipse.Point p2 = new Elipse().new Point() ;
	
}
}


class Elipse extends Circle{
	
}

class Circle{
	private Point mp;
	private int radius;
	

	public void go() {
		System.out.println(radius);
		System.out.println(mp.x);// Obwohl x in Point private ist
		
		Point p = new Point();
		System.out.println(p.x);// obwohl x ein privater Attribut
	//	System.out.println(x); compiler 
		
	}
	
	
	protected  class Point{
		private int x;
		int y;
		
		public void m(){
			System.out.println(x);
			System.out.println(radius);//obwohl radius privat ist
		}
		
		
	}
	
	
	
}


