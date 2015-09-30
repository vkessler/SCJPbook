package _09_30;

public class Produkt {
	static int counter = 1;
	int id;
	String name;
	double price;
	
	public Produkt(String name, double price) {
		this.name = name;
		this.price = price;
		this.id = counter;
		counter++;
	}
	
	public static void main(String[] args) {
		Produkt p1 = new Produkt("Wasser", 3.10);
		Produkt p2 = new Produkt("Brot", 1.29);
		System.out.println(p1.id);
		System.out.println(p2.id);
	}

}
