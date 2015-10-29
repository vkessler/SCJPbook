package spielerei;

public class S383 {
	
	String g ="";
	
	public static void main(String[] args) {
		
		short s2 = 3;
		short s1 = 4;
		short s3 = s1 + s2;
		
		int x = 3;
		boolean y = true;
		
		if ( (x > 2) && y ) {
			System.out.println("(x > 2) before &&");
		} else if ( x < 2 || y) {
			System.out.println("(x || 2) before &&");
		} else {
			System.out.println("x must be 2");
		}
		
		
	}

}
