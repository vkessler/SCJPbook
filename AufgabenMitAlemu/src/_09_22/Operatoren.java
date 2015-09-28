package _09_22;
/*
 * Klassifizierung:
 * 		-Arithmetische Operatorn: Anwendung auf Zahlendatentypen: byte, short, int , long, float, double
 * 			-Grundrechnarten: + - / *
 * 			-Modulo Operator:  %
 * 			-Inkrement und dekremnt: ++, --
 * 			-compund operator: +=, -= , /= %=
 * 		-logische Operatoren: !, || , &&, instanceof,^ 
 * 
 * aufgabe: Recherchieren Sie nach verschiedene Operatoren in  Java
 */
public class Operatoren {
	public static void main(String[] args) {
		int x = 12;
		int a = 4;
		int b = a +1;
		
		x = x + 1;//= ist nitc gleichheit, sonder "wird" oder becomes , ist eine Zuweisungsoperator
		x += 1;
		x++;//Inkrement Operator
		
		x = x / 5;
		x /=5;
		
		x = x - 1;
		x -= 1;
		x--;
		
		boolean bol1 = false;
		boolean bol2 = bol1 + true;
		
	}

}
