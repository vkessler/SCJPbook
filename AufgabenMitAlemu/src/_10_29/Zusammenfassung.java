package _10_29;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * Es liegt ein arrayList vor, wie kann ich es sortieren?  Collections.sort(arraylist)
 * Es liegt ein Vector vor, wie kann ich es sortieren?  Collections.sort(vector)
 * 
 * Es leigt vor ein HashSet, wie kann ich es sortieren? 
 */
public class Zusammenfassung {
	public static void main(String[] args) {
		HashSet<Integer> col = new HashSet<Integer>();
		col.add(12);
		col.add(11);
		col.add(15);
		col.add(13);
		col.add(17);
		
		TreeSet<Integer> ts = new TreeSet<Integer>(col);
	}

}
