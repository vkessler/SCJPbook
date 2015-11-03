package _10_30;

/*
 * Generics = Klassen mit Parameter
 * Argumente von Generische Klassen sind immer Referenztypen 
 * 
 * Typ - enschränkung:
 * 			Mittels extends und   (super im Zusammenhang mit Methoden)
 * 
 * Generische Klasse kann mehre Parameter haben.
 * 
 *   Beispiel: APi Map Interface
 */

public class Flasche<T> {//Typparameter: gültiger Bezeichner. Üblich: T oder E, prinzipiel bel. gültiger Bezeichner
	T inhalt;
	int vol;
	

	public void fuellen(T t, int v){
		inhalt = t;
		vol = v;
	}
	
	public T leeren(){
		T temp = inhalt;
		inhalt = null;
		vol = 0;
		return temp;
	}
	
public static void main(String[] args) {
	int s = add(12, 4);
	Flasche<Wasser> wasserFlasche = new Flasche<Wasser>();
	Flasche<Oel> oelFlasche = new Flasche<Oel>();
	Flasche<Wein> weinFlasche = new Flasche<Wein>();
	
	Flasche<RedWine> redwineflasche = new Flasche<RedWine>();
	Flasche<String> stringFlasche; //semantisch unsinn
//	Flasche<int> intFlasche;// int ist kein Referenztyp!
	
	oelFlasche.fuellen(new Oel(), 1);
	
	Flasche f;
}

public static int add(int x, int y){
	return x +y;
}
}

class Fluessigkeit{
	
}
class Getraenk extends Fluessigkeit{
	
}
class Wasser extends Getraenk{
	
}
class Oel extends Fluessigkeit{
	
}
class Wein extends Getraenk{
	
}

class RedWine extends Wein{
	
}