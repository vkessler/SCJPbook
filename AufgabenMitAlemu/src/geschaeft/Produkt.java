package geschaeft;

class Produkt {
	
	private String name;
	private double preis;
	
	Produkt(String name, double preis) {
		this.name = name;
		this.preis = preis;
	}
	
	Produkt() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreis() {
		return preis;
	}
	
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	@Override
	public String toString() {
		return name + " " + preis + " Euro";
		
	}

}
