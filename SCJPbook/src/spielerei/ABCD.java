package spielerei;

class A {
private void tell() {
	System.out.println("AAAA");
}
}
class B extends A {
public void tell() {
	System.out.println("BBBB");
}
}
class C extends B {
}
 class D extends C {
public void tell() {
	System.out.println("DDDD");
}
}
public class ABCD {
public static void main (String[] args) {
//	A a = new A();
//	a.tell(); 		// Aufruf 1
//	A b = new B();
//	b.tell(); 		// Aufruf 2
	B c = new C();
	c.tell(); 		// Aufruf 3
	C d = new D();
	d.tell(); 		// Aufruf 4
}
}


