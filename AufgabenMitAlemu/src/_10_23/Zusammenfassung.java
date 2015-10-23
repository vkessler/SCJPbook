package _10_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Comparable vs. comparator
 */

public class Zusammenfassung {
	public static void main(String[] args) {
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		
		ints.add(17);ints.add(13);ints.add(15);ints.add(21);ints.add(27);
		
		int index = Collections.binarySearch(ints, 13);
		
		
		System.out.println(index);//
		
		Collections.sort(ints, new Comp());
		
		System.out.println(ints);
		
		index = Collections.binarySearch(ints, 13, new Comp());
		System.out.println(index);//
	
		
		
		
	}

}


class Comp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}
	
}