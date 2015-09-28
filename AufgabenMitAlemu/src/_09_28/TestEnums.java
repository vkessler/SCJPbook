package _09_28;
/*
 * Konstruktor Enums wird implizit aufgerufen, sehe Beispiel!!!
 * ZugriffsKontrolle von Konstruktor: per Default private
 */
public class TestEnums {
	public enum Anrede{
		HR("Herr"), FR("Frau"), F("Frauelein"){
			public String format(String vorname, String nachname){
				  return    nachname + ", " + vorname;
			  }
			
		};
		private String title;
		
		  Anrede(String title) {
			this.title = title;
		}
		  public String format(String vorname, String nachname){
			  return this.title + " " +  nachname + ", " + vorname;
		  }
		
	}
	public static void main(String[] args) {
		Anrede a = Anrede.HR;
		System.out.println(a.format("Victor", "Kesseler"));
		Anrede a2 = Anrede.F;
		System.out.println(a2.format("Melanie", "Frome"));
		
		Produkt p = new Produkt(100, "xyz");
		System.out.println(p);
		int[] ints = {1,2,3,4,5};
		System.out.println(ints);
	}
	

}
