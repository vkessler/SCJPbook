package _10_30;

import java.util.ArrayList;

public class TestWildcards {
	public static void main(String[] args) {
		
		Flasche<? extends Wein> f = new Flasche<RedWine>();
		f = new Flasche<WhiteWine>();
	//	f = new Flasche<Wasser>(); Wasser IS - A Wein ? nein
		
		Flasche<?> f2 = new Flasche<Wasser>();
		f2 = new Flasche<String>();
		
		Flasche<Object> of = new Flasche<Object>();
		of = new Flasche<Wasser>();
	}

}


class WhiteWine extends Wein{
	
}