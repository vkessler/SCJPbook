package _09_24;
/*
 * Overload Resolution:
 * 				1-gibt es 1 - 1 passendes
 * 				2-Type Conversion -> Automatische anpassung
 * 					byte -> short ->int ->long ->float ->double
 * 							char
 * 				3-Autoboxing
 * 				4-var-arg
 * Achtung: widening und anschließendes autoboxing ist nicht zulässig!
 * aber widening, Autoboxing / autounboxing kann beliebig mit var - arg kombiniert werden
 */							
public class TestOverloading {
	public static void main(String[] args) {
		int i = 5;
		Integer j = 5;
		long l = 21;
		short s =3;
		go();//parameterlos
		go(s);//long
		go(j);//Integer
		System.out.println("TESTETSTST");
//		go(l);//long
//		Long a =12L; Long b = 13L;
//		
//	go(a);
		int[] ints = {1,2,3};
		go(ints);
	}
	
//	public static void go(){
//		System.out.println("parameterlos");
//	}
////	public static void go(int i){
////		System.out.println("int");
////	}
//	public static void go(Long i){
//		System.out.println("long");
//	}
//	public static void go(Integer i){
//		System.out.println("Integer");
//	}
	
	public static void go(int...is){//bel. viele ints (o bis n)
		System.out.println("int...");
	}
	

}
