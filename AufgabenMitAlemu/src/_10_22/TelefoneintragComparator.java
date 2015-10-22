package _10_22;

import java.util.Comparator;

/*
 * Comparator
 */
public class TelefoneintragComparator implements Comparator<Telefoneintrag> {

	@Override
	//return - 0 +;
	public int compare(Telefoneintrag o1, Telefoneintrag o2) {
		return 	o1.getNummer().compareTo(o2.getNummer());

	}

}
