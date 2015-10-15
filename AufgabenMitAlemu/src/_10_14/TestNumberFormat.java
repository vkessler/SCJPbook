package _10_14;

import java.text.NumberFormat;
import java.util.Locale;

/*
 * Zahlen und währungen werden auch Sprach- und Ortabhängig dargestellt!
 * 
 */
public class TestNumberFormat {
public static void main(String[] args) {
	double gehalt = 8700.47;
	NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CANADA);
	NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
	NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
	System.out.println(nf.format(gehalt));
	System.out.println(nf2.format(gehalt));
	System.out.println(nf3.format(gehalt));
	
	
	double x = 123.123456789;
	double y = 123.678;
	double z = 123;
	
	
	
	NumberFormat nfx = NumberFormat.getInstance(new Locale("bg", "BG"));
	System.out.println(nfx.format(x));
	
	NumberFormat nfxCH= NumberFormat.getInstance(new Locale("de", "CH"));
	
	nfxCH.setMinimumFractionDigits(2);//5 -5
	
	System.out.println(nfxCH.format(x));
	System.out.println(nfxCH.format(y));//123.67800
	System.out.println(nfxCH.format(z));//123.00000
	
	System.out.println(nfx.getMaximumFractionDigits());
	System.out.println(nfx.getMinimumFractionDigits());
}
}
