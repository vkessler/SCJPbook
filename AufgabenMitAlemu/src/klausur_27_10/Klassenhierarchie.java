package klausur_27_10;

class Medium {
	
	private String titel;
	
	public Medium (String titel) {
		titel = this.titel;
	}
	
	public void ausgeben() {
		System.out.print(titel);
	}

}

class Buch extends Medium {
	
	private String autor;
	
	public Buch (String titel, String autor) {
		super(titel);
		autor = this.autor;
	}
	
	public void ausgeben () {
		super.ausgeben();
		System.out.print(" " + autor);
	}

}

class Film extends Medium {
	
	private int spieldauer;
	
	public Film(String titel, int spieldauer) {
		super(titel);
		spieldauer = this.spieldauer;
	}
	
	public void ausgeben() {
		super.ausgeben();
		System.out.print(" " + spieldauer);
	}
	
}



public class Klassenhierarchie {

}
