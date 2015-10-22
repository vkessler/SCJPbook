package _10_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Telefonliste {
	ArrayList<Telefoneintrag> telefonbuch;

	/**
	 * @param telefonbuch
	 */
	public Telefonliste(ArrayList<Telefoneintrag> telefonbuch) {
		super();
		this.telefonbuch = telefonbuch;
	}
	
	public Telefonliste(Telefoneintrag [] kontakte){
		
		List<Telefoneintrag> tel = Arrays.asList(kontakte);
		
		this.telefonbuch = new ArrayList<Telefoneintrag>(tel);
		
	}
	
	//Eintrag aufnehmen
	
	public boolean eintrag_aufnehmen(Telefoneintrag eintrag) {
		return telefonbuch.add(eintrag);
	}
	
	//Eintrag Löschen
	
	public boolean eintrag_loeschen(Telefoneintrag eintrag) {
		return telefonbuch.remove(eintrag);
	}
	
	public boolean modifiziere(Telefoneintrag eintrag, String nummer) {
		for(int i = 0; i < telefonbuch.size(); i++){
			if(telefonbuch.get(i).equals(eintrag) ){
				eintrag.setNummer(nummer);
				telefonbuch.set(i, eintrag);
				return true;
			}
		}
		return false;
	}
	
	//Sortieren
	public void sortiere() {
		Collections.sort(this.telefonbuch);
		
	}
	public void sortiere(Comparator<Telefoneintrag> c) {
		Collections.sort(this.telefonbuch, c);
	}

	/**
	 * @return the telefonbuch
	 */
	public  ArrayList<Telefoneintrag> getTelefonbuch() {
		return telefonbuch;
	}

	/**
	 * @param telefonbuch the telefonbuch to set
	 */
	public  void setTelefonbuch(ArrayList<Telefoneintrag> telefonbuch) {
		this.telefonbuch = telefonbuch;
	}
	
	

}
