package geschaeft;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.TreeMap;

public class ProduktIO extends Produkt {
	
	//File f = new File("C:\\Users\\vkessler\\Downloads\\geschaeft\\obstliste.txt");
	
	//String dateipfad = null;

	public static TreeMap<String, Double> produktListeEinlesen(String dateipfad) throws IOException {
		return produktListeEinlesen(new File(dateipfad));
	}
	
	public static TreeMap<String, Double> produktListeEinlesen(File f) throws IOException {
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader( fis ,  StandardCharsets.ISO_8859_1.name());
		BufferedReader br = new BufferedReader(isr);
		
		TreeMap<String, Double> tmp = new TreeMap<String, Double> ();
		
		String data = null;
		//String uberschrift = br.readLine();
		while ( (data= br.readLine()) != null) {
			//System.out.println(data);
			if (!data.contains("Preis")) {
				String[] dataArray = data.split("\\t");
				ArrayList<String> daNew = new ArrayList<String>();
				for (int i = 0 ; i < dataArray.length ; i++) {
					if (!dataArray[i].replace("\\s","").equalsIgnoreCase("")) {
						daNew.add(dataArray[i]);
					}
				}
				tmp.put(daNew.get(0), Double.parseDouble(daNew.get(1).replace(",","."))); 
			}
		} 
		br.close();
		return tmp;
	}

}
