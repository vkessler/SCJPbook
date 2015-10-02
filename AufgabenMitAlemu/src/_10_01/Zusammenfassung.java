package _10_01;
/*
 * Einleitung / Motivtion Exception Handling
 * Syntax von try catch
 */
public class Zusammenfassung {
	
	static  int go(int x){
		if(x % 2 == 0)return 0;
		else return 1;
		
	}
	public static void main(String[] args) {
		int n = 124;
		
		String compiler;
		
		if(n % 2 == 0){
			compiler = "Java compiler ";
			
		}
		else{
			compiler = " C++ Compiler";
			
		}
		
		System.out.println(compiler);
		
		int a = 12;
		int b = 0;
		System.out.println("vor try - catch");
		int result;
		
		try {
				result = a/b;
		
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
			result = 0;
		}
		
		System.out.println(result);
		
		System.out.println("try blockk");
		System.out.println("Heute ist donnerstag");
		System.out.println("Programm ende");
		
		Animal an = new Dog();
		System.out.println(an.getClass());
	}

}

class Animal{
	
}
class Dog extends Animal{
	
}
