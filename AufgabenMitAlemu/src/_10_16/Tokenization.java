package _10_16;

import java.util.Scanner;

/*
 * Tokenization mittels : Scanner oder String.split()
 * 
 * Scanner die beste Wahl für Tokenization
 * 
 * Montag	Dienstag	Mittwoch	donnerstag	Freitag
 * 	Tokens:
 * 	delimeters:tabulator 
 */
public class Tokenization {
	public static void main(String[] args) {
		String temp = "12;4;6;-7;8;xyz";
		String delimeter = "\\s+";
		String[] tokens = temp.split(delimeter);
		
		//for(String t : tokens) System.out.print(t + " ");
		
		Scanner sc = new Scanner(temp);
		System.out.println(sc.delimiter());//Default
		
		sc.useDelimiter(";");
	while(sc.hasNextInt())System.out.println(sc.nextInt());
		
//	while(sc.hasNext()){
//		System.out.println(sc.nextInt());//kann zu InputMissmatchException führen
//	
//					}
	
	
//	while(true){
//		System.out.println(sc.next());//kann zu NosuchelementException führen
//	
//					}
		
		
		
		
	}

}
