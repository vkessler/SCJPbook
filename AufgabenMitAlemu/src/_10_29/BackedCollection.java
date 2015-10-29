package _10_29;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * 
 */
public class BackedCollection {
	public static void main(String[] args) {
		
//	
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		ts.add(1);	ts.add(-1);	ts.add(3);	ts.add(-3);	ts.add(4);	ts.add(-4);
//		
//		Set<Integer> subs = ts.subSet(-3,true, 3,true);	
//		
//		System.out.println(ts);
//		System.out.println(subs);
//		
//		
//		System.out.println("Man...");
//		
//		ts.add(0);
//		
//		System.out.println(ts);
//		System.out.println(subs);
//		
//		TreeMap<String, String> laender = new TreeMap<String, String>();
//		laender.put("Aethiopien", "Addis abeba");
//		laender.put("Deutschland", "Bonn");
//		laender.put("Frankreich", "Paris");
//		laender.put("Sudan", "Khartum");
//		laender.put("Deutschland", "Berlin");
//		laender.put("Gabon", "Paris");
//		
//		Map<String,	String> sm = laender.subMap("Deutschland", true, "Gabon", true);
//		//System.out.println(laender.size());
//		
//		System.out.println(laender);
//		System.out.println(sm);
//		
//		sm.put("England", "London");
//		laender.put("Italien", "Rom");
//		
//		System.out.println(laender);
//		System.out.println(sm);
//		
//		
//		laender.remove("England");
//		
//		System.out.println();
//		
//		System.out.println(laender);
//		System.out.println(sm);
		
		TreeSet<Integer> times = new TreeSet<Integer>();
		
		times.add(1215); 
		times.add(1115); 
		times.add(1245); 
		times.add(1015); 
		times.add(1315); 
		times.add(1400); 
		times.add(1500); 
		times.add(1535); 
		times.add(1700); 
		times.add(1600); 
		times.add(1815); 
		System.out.println(times);
		
		Set<Integer> heads = times.headSet(1600);
		
		System.out.println("headset: " + heads);
		heads.add(1100);
		heads.add(1000);
		System.out.println();
		
		System.out.println(times);
		
		System.out.println("headset: " + heads);
		
		//heads.add(1000);
//		
//		System.out.println(times.subSet(1400,  true, 1600,true));
		
		//Der letzter Zug, der vor 16 uhr fährt
//		
//		System.out.println(times.subSet(1400,  true, 1600,false).last());
//		
//		System.out.println("letzer Zug vor 1600:" + times.headSet(1600).last());
//		System.out.println("erster Zug ab 1600:" + times.tailSet(1600).first());
		
//		TreeMap<Integer, String> timesM = new TreeMap<Integer, String>();
//		
//		timesM.put(1215, "Bremen"); 
//		timesM.put(1115, "Dresden"); 
//		timesM.put(1245, "Frankfurt"); 
//		timesM.put(1015, "Erfurt"); 
//		timesM.put(1315, "Leipzig"); 
//		timesM.put(1400, "Magdeburg"); 
//		timesM.put(1500, "Dresden"); 
//		timesM.put(1535, "Dresden"); 
//		timesM.put(1700, "Leipzig"); 
//		timesM.put(1600, "Dresden"); 
//		timesM.put(1815, "Dresden"); 
//	           
//		System.out.println(timesM);
//		
//		System.out.println(timesM.tailMap(1600).firstKey() + " nach " + timesM.get(timesM.tailMap(1600).firstKey()));
//		System.out.println();
//		for(Integer uz : timesM.keySet()){
//			if(timesM.get(uz).equalsIgnoreCase("Dresden"))System.out.print(uz + " ");
//		}
		
		
		
		
		
		
	}

}
