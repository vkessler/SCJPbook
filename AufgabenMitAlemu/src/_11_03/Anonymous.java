package _11_03;

public class Anonymous {
public static void main(String[] args) {
	Shape s = new Rectangle();
	
	Shape q = new Shape() {
		int side;
		
		@Override
		public double area() {
			// TODO Auto-generated method stub
			return side * side;
		}
	};
	System.out.println(q.area());
	
	Shape s2 = new Shape() {
		
		@Override
		public double area() {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	go(new Shape() {
		
		@Override
		public double area() {
			// TODO Auto-generated method stub
			return 0;
		}
	});
	
	go(new Rectangle(){
		@Override
		public double area() {
			// TODO Auto-generated method stub
			return 0;
		}
	});
	
	
}

static void go(Shape s){
	
}
}




interface Shape{
	
	public double area();
}

class Rectangle implements Shape{
	int breite, hoehe;

	@Override
	public double area() {
		
		return breite * hoehe;
	}
	
}
