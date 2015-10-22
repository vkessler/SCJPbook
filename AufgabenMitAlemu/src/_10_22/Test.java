package _10_22;

import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		
		Telefoneintrag t1 = new Telefoneintrag("Alemu", "+4917680544416");
		Telefoneintrag t2 = new Telefoneintrag("Victor", "+4917680544415");
		Telefoneintrag t3 = new Telefoneintrag("Tariq", "+4917680544414");
		Telefoneintrag t4 = new Telefoneintrag("Gavric", "+4917680544417");
		Telefoneintrag t5 = new Telefoneintrag("Steffen", "+4917680544418");
		Telefoneintrag t6 = new Telefoneintrag("Patrin", "+4917680544413");
		
		Telefoneintrag[] k = {t1,t2,t3,t4,t5,t6};
		
		Telefonliste tlist = new Telefonliste(k);
		System.out.println(tlist.getTelefonbuch());
		tlist.sortiere();
		System.out.println("sorted nach name..");
		System.out.println(tlist.getTelefonbuch());
		
		System.out.println("Sorted Nummer");
		Comparator<Telefoneintrag> c = new TelefoneintragComparator();
		
		tlist.sortiere(c);
		System.out.println(tlist.getTelefonbuch());
		
		
	}

}
