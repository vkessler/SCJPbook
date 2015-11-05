package exercise5_2;

public class LabeledLoop {

	public static void main(String[] args) {

		//int age = (int) (Math.random() * 100);
		int age = 23;

		Outer:
		while (age <= 21) {
			if (age++ == 16) {
				System.out.println("Get your driver´s license!");
				continue Outer;
			} else {
				System.out.println("Another year.");
			}
		}
		
	}

}
