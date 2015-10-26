package klausurvorbereitung;

import java.util.ArrayList;
import java.util.List;

public class LigaToreIn {
	
public static void main(String[] args) {
	
	Result r1 = new Result();
	r1.team1 = "BVB";
	r1.team2 = "FCB";
	r1.tore1 = 4;
	r1.tore2 = 1;
	
	Result r2 = new Result();
	r2.team1 = "HSV";
	r2.team2 = "Hertha BSC";
	r2.tore1 = 0;
	r2.tore2 = 3;
	
	//String land = args[0];
	String land ="Deutschland";
	int summe = 0;
	try {
		summe = LigaToreSummierer.summeIn(land);
	} catch (ResultException e) {
		e.getMessage();
		e.printStackTrace();
	}
	
//	List<Result> resultList = new ArrayList<Result>();
//	resultList.add(r1);
//	resultList.add(r2);
//	System.out.println(resultList);
	
	
	
}


}
