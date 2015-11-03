package _10_30;

import java.util.ArrayList;

public class TestWildcards {
	public static void main(String[] args) {
		
		Flasche<? super  Wein> f = new Flasche<Wein>();
		f = new Flasche<Wein>();
		
		f.fuellen(new RedWine(), 1);
		
		f.leeren();
	//	f = new Flasche<Wasser>(); Wasser IS - A Wein ? nein
		
		Flasche<?> f2 = new Flasche<Wasser>();
		f2 = new Flasche<String>();
		
		Flasche<Object> of = new Flasche<Object>();
		of = new Flasche<Wasser>();
	}

}


class WhiteWine extends Wein{
	
}