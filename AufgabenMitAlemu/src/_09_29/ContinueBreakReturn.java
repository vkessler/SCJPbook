package _09_29;
/*
 * Continue : Eine Iteration verlassen
 * break    : Eine Schleife verlassen
 * return   : Eine Methode Verlassen
 */
public class ContinueBreakReturn {
	public static void main(String[] args) {
		int [] a = {-10,5,7,11,300};
		go(a);
		
	}
	
	public static void go(int[] x){
		for(int i = 0; i < x.length; i++){
			if(x[i]> 100) return ;
		
			if(x[i] > 10 ) break;
			System.out.println(x[i]);
			if(x[i] < 0) continue;
			System.out.println(x[i] % 3);
			x[i] = i +1;
			
		}
		
		
		System.out.println("go terminiert ");
	
	}

}
