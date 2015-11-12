package geschaeft;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.TreeMap;

public class Geschaeft {
	
	public static final String homePC = "Victor-PC"; 
	
	public static void main(String... args) {
		
		TreeMap<String, Double> tmp = null;
		String computername = "";
		
		try {
			computername = InetAddress.getLocalHost().getHostName();
			String atHome = "C:\\Users\\Victor\\Desktop\\geschaeft\\obstliste.txt" ;
			String atComcave = "C:\\Users\\vkessler\\Downloads\\geschaeft\\obstliste.txt";
//			System.out.println(computername);
//			System.out.println(homePC);
//			tmp = ProduktIO.produktListeEinlesen(atHome);
			if (computername.equalsIgnoreCase(homePC)) {
				tmp = ProduktIO.produktListeEinlesen(atHome);
			} else {
				tmp = ProduktIO.produktListeEinlesen(atComcave);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println(tmp);
		
		tmp.put(Sonderangebote.Physalis.name(),Sonderangebote.Physalis.getPreis());
		
		System.out.println(tmp);
		
		System.out.println(Thread.currentThread().getId());
		System.out.println(Sonderangebote.Physalis);
		




		
	}

}