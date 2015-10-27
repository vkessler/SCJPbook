package klausur_27_10;

import Prog1Tools.IOTools;

public class aufgabe1b {
	
	static int addPositive(int a, int b) {
		if(a >= 0 && b >= 0) {
			return a + b;
		} else throw new IllegalArgumentException();
	}
	
	// "Unchecked Exceptions" werden von der JVM geworfen und lassen sich nicht konkret verwenden. 
	// "Unchecked Exceptions" müssen nicht im Methodenkopf angezeigt werden. 

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		boolean test = true;
		while (test) {
			try {
				a = IOTools.readInt("Bitte ersten int-Wert eingeben: ");
				b = IOTools.readInt("Bitte zweiten int-Wert eingeben: ");
				c = addPositive(a,b);
				test = false;
			} catch (IllegalArgumentException e) {
				System.out.println("Die eingegebenen Zahlen müssen größer oder gleich 0 sein.");
			} 
		}	
		System.out.println("Das Ergebnis der Addition ist: " + c);
		
	}
	
}
