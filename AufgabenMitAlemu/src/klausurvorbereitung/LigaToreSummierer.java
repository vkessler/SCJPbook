package klausurvorbereitung;

public class LigaToreSummierer {
	

	
	public static int summeIn (String land) throws ResultException {
		
		LigaTicker lt = new LigaTicker(land);
		int summe = 0;		
		while (lt.resultAvailable()) {
			if (lt.nextResult().tore1 >= 0 && lt.nextResult().tore2 >= 0) 
				summe += lt.nextResult().tore1 + lt.nextResult().tore2;
			else throw new ResultException(lt.nextResult().team1, lt.nextResult().team2);
		}
		System.out.println("Die Summe aller Tore in der Liga in " + land + " ist " + summe + ".");
		return summe;
		
		
	}
	
}
