package _10_01;

import java.util.Scanner;

/*
 * finally block: 	Aufräume Arbeit (Resource freigabe: close())
 * 		-Code, welcher auf jedem Fall ausgeführt werden muss, tut man in finally block!
 */

public class WeiterMitExceptions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String s = sc.next();
			char i = s.charAt(3);
			System.out.println(i);
			System.out.println(s);
//			try {
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
			
		}
		
		catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println("Fehler");
			
//			try {
//				
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
		}
		finally{
			sc.close();
//			try {
//				
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
		}
		
		
		System.out.println("finished");
		
		
		try {
			String s = sc.next();
			char i = s.charAt(3);
			System.out.println(i);
			System.out.println(s);
			sc.close();
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println("Fehler");
		}
	}

}
