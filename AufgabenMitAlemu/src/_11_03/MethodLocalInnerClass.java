package _11_03;
/*
 * Eine Klasse innerhalb einer Methode
 * 			Analog zur lokalen Variablen
 * Zulässige Modifiers: abstract, final
 */
public class MethodLocalInnerClass {
	public static void main(String[] args) {
//		int x =1; int y = 2;//p1
//		int x2 = 0; int y2 = 3;//p2
		
		 class Point{
			int x;
			int y;
		}
		
		
		Point p1 = new Point(), p2 = new Point();
		
		double d = Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2));
		
	
		
		
		
	}

}
