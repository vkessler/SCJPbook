package _10_21;

import java.util.ArrayList;

/*
 * Verwalten Sie eine Liste von Personen mit Telefonnummer
 * 
 * Schritt 1. Fertigen Sie eine Klasse -  TelefonEintrag = Modeliert eine Person mit Name und Telefonnummer
 * 
 * Schritt 2: Fertigen Sie eine Klasse - Telefonliste = Modelliert Kontaktliste
 * 
 * Schritt 3: Fertigen Sie eine Klasse - Test = Implementieren Sie die main Methode und testen die funktionalitäten der einzelenen Klassen (1,2)
 * 
 * Lernziel: Umgang mit Methoden der Klasse ArrayList
 * 
 *Operationen der Anwendung:
 *							-Eintrag übernehmen
 *							-eintrag löschen
 *							-Eintrag ändern
 *							-suchen, Sortieren
 *								...
 *
 * 		
 */
public class AufgabeFuer22_10 {

	public static void main(String[] args) {
		
		TelefonEintrag te1 = new TelefonEintrag("Markus", "Müller", "03059652");
		TelefonEintrag te2 = new TelefonEintrag("Franziska", "Brand", "03056875");
		TelefonEintrag te3 = new TelefonEintrag("Heinz", "Becker", "03064966");
		TelefonEintrag te4 = new TelefonEintrag("Melanie", "Schütte", "030798596");
		
		TelefonListe tl1 = new TelefonListe();
		
		tl1.addContact(te1);
		tl1.addContact(te2);
		tl1.addContact(te3);
		tl1.addContact(te4);
		
		System.out.println(tl1);
		
		tl1.deleteContact(te3);
		
		System.out.println(tl1);
		
	}
	
}

class TelefonEintrag {
	
	private String vorname;
	private String nachname;
	private String telefonnummer;
	
	TelefonEintrag(String vorname, String nachname, String telefonnummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.telefonnummer = telefonnummer;
	}
	
	@Override
	public String toString () {
		return nachname + ", " + vorname + ": " + telefonnummer + "\r\n" ;
	}
}

class TelefonListe {
	
	ArrayList<TelefonEintrag> telefonbuch;
	
	TelefonListe () {
		telefonbuch = new ArrayList<TelefonEintrag>();
	}
	
	void addContact (TelefonEintrag te) {
		telefonbuch.add(te);
	}
	
	void deleteContact (TelefonEintrag te) {
		telefonbuch.remove(te);
	}
	
	void changeContact (TelefonEintrag te) {
		//telefonbuch.set(index, element);
	}
	
	@Override
	public String toString() {
		return telefonbuch.toString();
	}
	
	
	
}
