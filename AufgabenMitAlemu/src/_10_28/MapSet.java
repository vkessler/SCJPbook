package _10_28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Set       						Map
 * Kind Interface Collection		-
 * Elemente sind "skalar"			Elemente sind Tupel aus key und value
 * 
 * HashSet							HashMap
 * TreeSet							TreeMap
 */
public class MapSet {
	public static void main(String[] args) {
		HashSet<String> wochentagen = new HashSet<String>();
		
		wochentagen.add("Montag"); wochentagen.add("Dienstag");wochentagen.add("Mittwoch"); wochentagen.add("Donnerstag");
		wochentagen.add("Freitag"); wochentagen.add("Samstag"); wochentagen.add("Sonntag");
		
		boolean b = wochentagen.add("Montag");
		System.out.println(b);
		System.out.println(wochentagen);
		
		HashMap<String, Integer> wts = new HashMap<String, Integer>();
		wts.put("Montag", 8);wts.put("Dienstag", 8);wts.put("Mittwoch", 8);wts.put("Donnerstag", 8);
		Integer x = wts.put("Freitag", 8);wts.put("Samstag", 6);wts.put("Sonntag", 0);
		
		int v = wts.put("Montag", 7);
		
		wts.put("Thirsday", null);
		wts.put("Thirsday", 5);
		
		System.out.println(v);
		System.out.println(x);
		
		System.out.println(wts);
		
		TreeSet<String> ts = new TreeSet<String>(wochentagen);
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(wts);
		
		TreeSet<String> wt = new TreeSet<String>(wts.keySet());
		TreeSet<Integer> ws = new TreeSet<Integer>(wts.values());
		
		System.out.println(ts);
		System.out.println(tm);
		System.out.println("Wochen Tagen");
		System.out.println(wt);
		
		System.out.println("stunden");
		System.out.println(ws);
		System.out.println(wts.values());
		
		
	}

}
