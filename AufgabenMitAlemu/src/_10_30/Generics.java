package _10_30;

import java.util.ArrayList;

public class Generics<T> {
	ArrayList<T> list;
	T[] array ;
	public static void main(String[] args) {
		Bird[] ar = {new Bird(), new Bird()};
		String[] str = {"Abc", "Test"};
		
//		ausgeben(ar);
//		//ausgeben(str);
//		
	Generics<Mamal> dogs = new Generics<Mamal>();
//		dogs.addA(new Cat());
//		dogs.add(new Cat());
		
		ArrayList<Animal> a = new ArrayList<Animal>();
		dogs.add(a, new Cat());
	}
	public  static <T extends Animal> void  ausgeben(T[] a) {
		for(int i = 0; i< a.length; i++){
			System.out.println(a[i]);
		}
		
	}
	
	public void add (ArrayList<Animal> animals, Animal t){
		animals.add(t);
		animals.add(new Dog());
		
	}
	
	public void addA(T t){
		array[0]= t;
		
	}


}
