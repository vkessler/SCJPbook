package _10_30;

import java.util.ArrayList;

public class Box<T> {
	
	T inhalt;
	
	public  void set(T t) {
		this.inhalt = t;
	}
	
	public T get (){
		return this.inhalt;
	}
public static void main(String[] args) {
	
	Box<? super Geld> tasche = new Box<Gegenstand>();
	tasche.set(new Einkaufszettel());
	tasche.get();
}

}

class Gegenstand {
	
}

class Geld extends Gegenstand{
	
}
class Schein extends Geld{
	
}
class Muenze extends Geld{
	
}
class Einkaufszettel extends Gegenstand{
	
}
