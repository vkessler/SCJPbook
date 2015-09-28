package _09_28;

public class TestProdukt {
	static{
		System.out.println("st. i b. in Test Produkt");
	}
	public TestProdukt() {
		System.out.println("konstruktor testProdukt");
	}
	public static void main(String[] args) {
		System.out.println("programm start");
		Produkt p = new Produkt(0.58, "Wasser");
		Produkt p2 = new Produkt(0.89, "Milch");
		
	}
}
