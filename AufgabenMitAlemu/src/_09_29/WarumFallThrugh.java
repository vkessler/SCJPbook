package _09_29;

import Prog1Tools.IOTools;

/*
 * Fallbeispiel, wo fall thrugh mit switch -case hilfsreich ist
 */
public class WarumFallThrugh {
	public static void main(String[] args) {
		
		int monat = IOTools.readInt("Monat eingeben (1 -12)") ;
		
		switch (monat) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
			
			
		case 2:
			System.out.println("28");
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
	
		default:
			System.out.println("ungültiger Monat");
			break;
		}
	}

}
