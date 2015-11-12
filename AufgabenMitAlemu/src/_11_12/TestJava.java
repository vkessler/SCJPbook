package _11_12;

import java.util.Properties;
/*
 * java Programname Argument
 * 
 * javac Test.java: Der Compiler sucht nach der Datei Test.java in . (current directory)
 * 
 * java Test : Der JVM sucht nach den Klassen (Test.class) nicht automatisch im aktuellen Verzeichnis, diesc passiert nur wenn . im classpath
 * eingetragen ist.
 * 
 * java -cp v1:v2:v3:v4 Test
 */
/*
 * Welche Optionen muss man für die Prüfung kennen?
 * 		-cp bzw -classpath
 * 		-D (nicht verwechseln mit -d (dies ist für javac))
 * 	Mit der Option -D, man hat die Möglichkeit die Systemeigneschaften zu beeinflüssen:
 * 			-neue Eigenschaft hinzufügen
 * 			-bereits existierende Eigenschaft mit neuem Wert versehen
 */

public class TestJava {
	public static void main(String[] args) {
		Properties p = System.getProperties();//systemeigenschaften
		//p.list(System.out);
		System.out.println(p.getProperty("os.name"));
		System.out.println(p.getProperty("user.language"));
		System.out.println(p.getProperty("user.country"));
		System.out.println("user.status: " + p.getProperty("user.status"));
		
		System.out.println(System.getProperties().getProperty("user.language"));
		System.out.println(System.getProperty("user.language"));
		
		p.list(System.out);
		
	}

}
