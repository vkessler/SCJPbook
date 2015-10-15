package umlaute;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class UmlautConv {

	public static void main(String[] args) {
		
		//Die Datei befindet sich im Ordner "C:\Users\vkessler\Downloads"
		
//		File f = new File("C:"+File.separator+"Users"+File.separator+"vkessler"+
//				File.separator+"Downloads"+File.separator+"umlaute.txt");
		
		File f = new File("C:\\Users\\vkessler\\Downloads\\umlaute.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			while ( (br.readLine()) != null)
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(f.isFile());
		

	}

}
