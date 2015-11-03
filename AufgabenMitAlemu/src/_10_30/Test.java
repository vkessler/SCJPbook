package _10_30;

import java.util.ArrayList;

public class Test {
	public void checkAnimal(Animal[] animals){
		
		animals[0] = new Dog();
		for (Animal a : animals){
			a.checkup();
		}
		
	}
	
	public void checkAnimalG(ArrayList<? super Animal> animals){
		animals.add(new Dog());
		animals.add(new Object());
		
		for (Object a : animals){
			((Animal) a).checkup();
		}
		
	}
	
	public static void main(String[] args) {
		Dog[] dogs = {new Dog(), new Dog()};
		Cat[] cats = {new Cat(), new Cat()};
		Bird[] birds = {new Bird(), new Bird()};
		
		Test t = new Test();
		t.checkAnimal(dogs);
		t.checkAnimal(cats);
		t.checkAnimal(birds);
		
		ArrayList<Animal> animals= new ArrayList<Animal>();
		ArrayList<Dog> DogList= new ArrayList<Dog>();
		DogList.add(new Dog());	DogList.add(new Dog());
		ArrayList<Cat> catList= new ArrayList<Cat>();
		catList.add(new Cat());	catList.add(new Cat());
		ArrayList<Bird> birdList= new ArrayList<Bird>();	
		birdList.add(new Bird());	birdList.add(new Bird());
		System.out.println("ArrayList:");
		t.checkAnimalG(animals);
		t.checkAnimalG(catList);
		t.checkAnimalG(DogList);
		t.checkAnimalG(birdList);
		
	}

}
