package _10_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Konvertierungen {
	public static void main(String[] args) {
		String [] x = {"Gondar","Berlin","Dresden"};
		System.out.println();
		for (String a : x )System.out.print(a + " ");
		System.out.println();
		List<String>list = Arrays.asList(x);
		System.out.println(list);
		//System.out.println(list.getClass().getName());
		System.out.println();
		
		list.set(0, "Stuttgart");
		System.out.println(list);
		System.out.println();
		for (String a : x )System.out.print(a + " ");
		
		//list.remove("Berlin");
		Collections.sort(list);
		System.out.println("Alles sortiert");
		
		System.out.println(list);
		System.out.println();
		for (String a : x )System.out.print(a + " ");
		
		ArrayList l = new ArrayList(list);
		l.remove(0);
			
		
	}

}
