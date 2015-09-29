package _09_29;
/*
 * Was möchten wir wiederholen?
 * 		Basic for --loop vs. enhanced for -- loop
 * 		labled Statements
 * Keywords: return, break, continue
 */
public class Loops {
	public static void main(String[] args) {
		
		//int a  = 1, b = 3;
		
		
		int [] ints = {1,2,3,4,5,6,-7,8,9,10};
		
		outer:
		for (int i = 0; i < 10;i++ ) {//basic for -- loop
			inner: for(int k = 0; k < 5; k++){
				
					System.out.print(ints[i] + " ");
					if(ints[i] < 0)break outer;
					
				}
		System.out.println();
		}
		
		System.out.println("weiter im Programm");
		
		
//		for(int e : ints){//enhanced for - loop seit java 1.5
//			System.out.println(e);
//		}
		
		
//		for(String s = "d"; s.length()< 5;s = s.concat("a")){
//			System.out.println(s);
//		}
		
		
	
		
		
	}

}
