package geschaeft;

enum Sonderangebote {
	Trauben(0.99), Zitrone(0.49), Physalis(1.49);
	
	private double preis;
	
	Sonderangebote(double preis) {
		this.preis = preis;
	}
	
	public double getPreis() {
		return preis;
	}
	
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	
	

}
