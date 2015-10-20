package _10_20;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList implements List
 * 
 */
public class TestArrayList {
	public static void main(String[] args) {
		List teilnehmerList = new ArrayList(); // non - Generic variante bis java 4 
		teilnehmerList.add("Victor");
		teilnehmerList.add(3);
		teilnehmerList.add("Steffen");
		
		List<String> teilnehmerListG = new ArrayList<String>(); //  Generic variante bis java 5
		teilnehmerListG.add("Victor");
		teilnehmerListG.add("Tariq");
		teilnehmerListG.add("Steffen");
		System.out.println(teilnehmerListG);
		//
		teilnehmerListG.add(0, "Gavric");
		System.out.println(teilnehmerListG);
		
		//teilnehmerListG.addAll(1,teilnehmerList);
		System.out.println(teilnehmerListG);
		
		for(int i = 0; i< teilnehmerListG.size(); i++){
			System.out.println(teilnehmerListG.get(i).toUpperCase());
		}
		
		for(String s : teilnehmerListG) System.out.println(s.toUpperCase());
		
		
		
	
		
		
		
	}

}

