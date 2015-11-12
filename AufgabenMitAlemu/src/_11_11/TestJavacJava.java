package _11_11;

/*
 * javac: ein Befehl um den Java - Compiler zu starten
 * javac <options> <source files>
 * 
 * Beipiel: javac -source 1.5 Datei1.java Datei2.java 
 * Ergebnis: Erstellung von class files für alle Klassen, die in Datei1.java und Datei2.java sich befinden
 * per Default die class files werden im aktuellen Verzeichnis angelegt 
 */

public class TestJavacJava {
	public static void main(String[] args) {
		System.out.println(args.length);
		new Java().go();
		new Javac().go();
	}

}

class Java{
	public void go(){
		System.out.println("java");
	}
}
class Javac{
	public void go(){
		System.out.println("javac");
	}
}