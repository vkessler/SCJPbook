package _10_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListToArrays {
	public static void main(String[] args) {
		
	
		ArrayList<String> t = new ArrayList<String>();
				//Arrays.asList(new String[]{"Alemu", "Tariq", "Victor", "Steffen", "Gavric"}));
		t.add("Alemu");t.add("Tariq");t.add("Victor");t.add("Steffen");t.add("Gavric");
		
		t.add("Patrin");
		System.out.println(t);
		System.out.println();
		
		
		Object[] teilnehmerliste =  t.toArray();
		
		for(int i = 0; i < teilnehmerliste.length; i++)System.out.print(teilnehmerliste[i] + " ");
		
		teilnehmerliste[0] = "Wondmu";
		System.out.println();
		for(int i = 0; i < teilnehmerliste.length; i++)System.out.print(teilnehmerliste[i] + " ");
		System.out.println();
		System.out.println(t);
	}

}
