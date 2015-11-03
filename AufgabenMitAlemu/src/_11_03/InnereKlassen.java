package _11_03;

public class InnereKlassen {
	public static void main(String[] args) {
		//rufen Sie die Methode go und foo auf!
		
		new Circle().go();
		new Circle.Point().foo();
		/*
		 *  p vom Typ Point
		*/
		Circle.Point p = new Circle.Point();
	}

}




class Circle{
	static class Point{
		private int x;
		private int y;
		public void foo(){
			System.out.println(mp.x + ", " + mp.y + ", " + radius );
		}
	}
	private int radius;
	private Point mp;
	
	public void go(){
		System.out.println(mp.x + ", " + mp.y + ", " + radius );
	}
}