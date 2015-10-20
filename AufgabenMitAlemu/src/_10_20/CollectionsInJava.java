package _10_20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/*
 * Es gibt viele Interfaces und Klassen für die Verarbeitung der Sammlung von Dingen (Elemente in Collection: Objekte)
 * 
 * 		Arrays											Collections
 * 		T [] (Beispiel 1: int[] x;)					Interfaces und Klassen (Beispiel 1: ArrayList x; ArrayList<Integer> x;)
 * 		Elemente können bel. Datentyp 				Elemente sind nur Referenztypen (primitive DT sind nicht zulässig)
 * 			(primitive, Referenz DT)
 * 		statisch (Anzahl der Elemente fest)     dynamisch (Anzahl der Elemente variable: add() +, remove() -)
 * 
 * 
 */

/*
 * Was muss man über die API von Collections wissen?
 * 
 * 		Klassifizierung:
 * 				1.	Interfaces vs. classes
 * Interfaces (9):
 * 			-Collection
 * 						-Queue, List, Set (SortedSet, NavigableSet)
 * 			-Map (SortedMap, NavigableMap)
 * 
 * Classes: Queue:
 * 				priorityQueue, LinkedList
 * 			List:
 * 				Vector, ArrayList, LinkedList
 * 			Set:
 * 				HashSet, TreeSet
 * 			Map:
 * 				HashMap, TreeMap
 * 
 * 2. Ordered 				vs. 			Unordered
 * 		
 * List, Queue							Set (HashSet), Map (HashMap)
 * 
 * 
 * 	3. Unique (Duplikatefrei)		vs. non - unique (Duplikate dürfen vorkommen)
 * 
 * 		Set, Map					List, Queue
 * 4. Sorted    		 vs. Unsorted
 * 		TreeSet, TreeMap				alle anderen
 */

public class CollectionsInJava {
	public static void main(String[] args) {
		int[] x = new int[3];
		int[] y = { 10, 2, 3 };
		System.out.println("ArrayList");

		ArrayList<Integer> xa = new ArrayList<Integer>();// is -a

		Collection<Integer> intCol = new ArrayList<Integer>();

		intCol.add(3);// java 5, autoboxing, java 4: intcol.add(new Integer(3))
		intCol.add(7);
		intCol.add(-71);
		intCol.add(7);

		// ordred, duplikate, nicht sortiert sein, indexed

		System.out.println(intCol);
		System.out.println(((ArrayList<Integer>) intCol).get(3));

		
		// HashSet Beispiel:
		System.out.println("HashSet");
		Collection<Integer> xh = new HashSet<Integer>();//is -a 

		Collection<Integer> intColH = new HashSet<Integer>();

		intColH.add(3);// java 5, autoboxing, java 4: intcol.add(new Integer(3))
		intColH.add(7);
		intColH.add(-71);
		intColH.add(7);
		

		// ordred, duplikate, nicht sortiert sein, indexed

		System.out.println(intColH);
		
		intColH.add(17);
		System.out.println(intColH);
		intColH.add(70);
		
		System.out.println(intColH);
		//nicht indexed, nicht ordered, unique, nicht sortiert 
	//	System.out.println((HashSet<Integer>()) intColH).get(3));#
		
		
		//Treset Beispiel
		Collection<Integer> intColT = new TreeSet<Integer>();

		intColT.add(3);// java 5, autoboxing, java 4: intcol.add(new Integer(3))
		intColT.add(7);
		intColT.add(-71);
		intColT.add(7);
		

		// ordred, duplikate, nicht sortiert sein, indexed
		
		System.out.println("TreeSet");

		System.out.println(intColT);
		
		intColT.add(17);
		System.out.println(intColT);
		intColT.add(70);
		
		System.out.println(intColT);

	}

}
