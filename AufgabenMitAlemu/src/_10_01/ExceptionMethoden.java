package _10_01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMethoden {
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int x  =0;
		try{
			x = sc.nextInt();
		}catch(InputMismatchException e){
			while(sc.hasNext()){
				sc.next();
			}
			System.out.println("Bitte eine Zahl...");
			
			x = sc.nextInt();
		}
		System.out.println(x);
		
		
		
//			long r =0 ;
//			try {
//				r = divide(12, 0);
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//			System.out.println(r);
		
		System.out.println("ende");
	}
	
	static long divide(int a, int b) throws IOException{
		
		System.out.println(a);
		System.out.println(b);
		
		if(b ==0) throw new IOException("Divider is zeor");
		System.out.println("...");
		return a / b;
	}

}
