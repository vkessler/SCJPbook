package exercise5_1;

public class SwitchExercise {

	public static void main(String[] args) {

		char c = 'w';
		
		switch (c) {
			case 'j': System.out.println("Match! c = j");
			break;
			case 'd': System.out.println("Match! c = d");
			break;
			case 'r': System.out.println("Match! c = r");
			break;
			case 'p': System.out.println("Match! c = p");
			break;
			case 'P': System.out.println("Match! c = P");
			break;
			case 'E': System.out.println("Match! c = E");
			default: System.out.println("No match found!");
			break;
		}

	}
	
}