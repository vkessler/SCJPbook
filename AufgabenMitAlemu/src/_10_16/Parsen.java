package _10_16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Motivation:
 * 		-Bestimmte Begriffe (Wörter) in String (text) suchen  "static". "Berlin" "Dresden"
 * 			"Mayer", Maier, Meyer
 * 		
 * 		-6; 13; 17; 12 -> [6,13,17,12]: Tokenization: Tokens und Delimeters
 * 		-Formatieren von Zahlen (Währungen) und Datum aus einer Text:
 */

/*
 * API: 
 * 				java.util.regex.Pattern und java.util.regex.Matcher
 * 				String.split(), Scanner für Tokenization
 * 				java.util.Formatter
 * 
 */
public class Parsen {
	public static void main(String[] args) {
		//suchen
//		String quelle= "I Saw a Saw Sawing a Saw";// wo suche ich
//		String muster = "\\s+Saw\\s*";//Was suche ich
		
//		String quelle= "abababa";// wo suche ich
//		String muster = "aba";//Was suche ich
		
		String quelle= "a12c3e456f";// wo suche ich
		String muster = "\\d";//Was suche ich
		
		Pattern p = Pattern.compile(muster);
		Matcher m = p.matcher(quelle);
		
		Matcher mat = Pattern.compile(muster).matcher(quelle);
		
		//quelle: a12c3e456f
		//Index	  01234567890
		
//		while(mat.find()){
//			System.out.println(mat.start() + " : " + mat.group() + " : "  + mat.end());
//		}
		
		/*
		 * Mengenangabe (quantifiers):
		 * 					* 0 - n -->{0, }
		 * 					+ 1 - n -->{1, }
		 * 					? 0 - 1 -->{0.1}
		 */
		
		/*
		 * Auswahlliste
		 */
		//Suche nach Zahlen: 
//		Matcher mm = Pattern.compile("\\d+").matcher("1 a12 234b");
//		
//		while(mm.find()){
//			System.out.println(mm.start() + " : " + mm.group() + " : "  + mm.end());
//		}
		
		
		Matcher mm = Pattern.compile("M[ae][yi]er").matcher("Mayer wird auch als Maier oder Meyer geschrieben.");
		
		while(mm.find()){
			System.out.println(mm.start() + " : " + mm.group() + " : "  + mm.end());
		}
		
		String muster1 ="[123789]";
		String muster2 ="[1-3][7-9]";//[1-37-9]
	//wort_1
				
		/*
		 * Meta charachters:
		 * 		Digit					\\d   --> [0123456789] --> [0-9]
		 * 		Word Charchter			\\w  ---> [0-9a-zA-Z_] = [\\da-zA-Z_]
		 * 		Whitespace charachter	\\s  tabulatoren, Leertaste
		 */	
		
		 String source = "Die Zahl 15 wirdHexadezimal als 0xF dargstellt, und 0Xa1df ist auch eine Hexadezimal Zahl";
		 
		 Matcher mmm = Pattern.compile("0[Xx]([0-9a-fA-F])+").matcher(source);
			
			while(mmm.find()){
				System.out.println(mmm.start() + " : " + mmm.group() + " : "  + mmm.end());
			}
			
			Matcher zerol = Pattern.compile("a*").matcher("abebaab");
			/*
			 * input: abebaab
			 * index: 01234567
			 * 
			 */
			/*
			 * 0 a 1
			 * 1   1
			 * 2   2
			 * 3   3
			 * 4 aa 6
			 * 6    6
			 * 7    7
			 * 
			 */
			
			while(zerol.find()){
				System.out.println(zerol.start() + " : " + zerol.group() + " : "  + zerol.end());
			}
			
			
			
			
			Matcher dot = Pattern.compile("x\\.z").matcher("xyz x z x12z xacz x.z");
			//xyz x z x12z xacz x.z
			//0123456789012345678901
			
			while(dot.find()){
				System.out.println(dot.start() + " : " + dot.group() + " : "  + dot.end());
			}
				
			}
	
	
			
		
	}


