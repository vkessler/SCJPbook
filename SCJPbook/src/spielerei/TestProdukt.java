package spielerei;

class Ware {
public long nummer;
public static long code = 4444;
public Ware (long nummer) {
this.nummer = nummer;
}
public Ware copy () {
return new Ware(2 * nummer + code);
}
}
class Produkt {
public Ware etwas;
public Produkt (Ware nochwas) {
etwas = nochwas;
}
public Produkt copy () {
return new Produkt(etwas);
}
}
public class TestProdukt {
public static void main (String[] args) {
Ware viel1 = new Ware(333), viel2;
Produkt wenig1 = new Produkt(viel1), wenig2;
System.out.print (Ware.code + ".");
System.out.println(wenig1.etwas.nummer);
viel2 = viel1.copy();
wenig2 = wenig1.copy();
viel1.nummer = 22;
Ware.code = 1;
System.out.print (viel2.nummer + ".");
System.out.print (viel2.code + ".");
System.out.print (wenig1.etwas.nummer + ".");
System.out.print (wenig2.etwas.nummer + ".");
System.out.println(wenig2.etwas.code);
}
}
