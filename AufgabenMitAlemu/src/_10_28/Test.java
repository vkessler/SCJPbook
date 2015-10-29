package _10_28;

import java.util.HashMap;

/*
 * Fallbeispiel:
 * 		
 * 	Name des Mitarbeiters			Gehalt
 * 		Steffen						2900.00 €
 * 		Victor						1785.00 €
 * 		Alemu						1926.00
 * 		Tariq						3500.00
 * 		Gavric						3500.00
 * 
 */
public class Test {
	public static void main(String[] args) {
		HashMap<String, Double> employee = new HashMap<String, Double>();
		
//		System.out.println(employee.put("Alemu", 100.00));//null
//		System.out.println(employee.put("Alemu", 200.00));//100
//		System.out.println(employee.put("Alemu", 300.00));//200
//		System.out.println(employee.put("Alemu", 400.00));//300
//		System.out.println(employee.put("Alemu", 5000.00));//400
//		System.out.println(employee.size());//1
//		System.out.println(employee);//Alemu = 5000
		employee.put("Steffen", 2900.00);
		employee.put("Victor", 1785.00);
		employee.put("Alemu", 2900.00);
		employee.put("Gavric", 2900.00);
		employee.put("Tariq", 2900.00);
		
		double summe = 0;
		for(Double d : employee.values()){
			summe += d;
		}
		System.out.println("summe = " + summe);
		
		
	}

}
