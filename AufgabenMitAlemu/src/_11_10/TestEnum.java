package _11_10;

public class TestEnum {
	
	public enum WochenTagen{
		
		MO(8),DI(7),MI(5),DO(10),FR(11);
		
		private final int hrs;
		WochenTagen(int hrs){
			System.out.println("test...");
			this.hrs = hrs;
		}
	}
	public static void main(String[] args) {
		
	WochenTagen t = WochenTagen.MO;
	WochenTagen t1 = WochenTagen.DI;
		
	}

}
