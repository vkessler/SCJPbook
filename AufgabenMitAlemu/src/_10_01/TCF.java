package _10_01;

public class TCF {
	public static void main(String[] args) {
		
		int a = 1, b = 0;
		
		try {
			int c = a / b;
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("ende");
	}
}
