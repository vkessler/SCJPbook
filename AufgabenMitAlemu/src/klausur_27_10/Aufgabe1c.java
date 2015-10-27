package klausur_27_10;

class ThreeObjectBucket {
	Object[] oa = new Object[3];
	
	public void add (int index, Object o) throws BucketFullException  {
		if (index < 3) {
			oa[index] = o;
		} else throw new BucketFullException();
	}
	
	public Object read(int index) {
		return oa[index];
	}
	
	public void delete(int index) {
		oa[index] = null;
	}
	
}

class BucketFullException extends Exception {
	BucketFullException() {
        super("Bucket ist voll!");
    }
}

public class Aufgabe1c {

	public static void main(String[] args) {
		ThreeObjectBucket tob = new ThreeObjectBucket();
		try {
			tob.add(0, 1);
			tob.add(1, 2);
			tob.add(2, 3);
			tob.add(3, 4); // ArrayIndexOutOFBoundException. Verhalten ist unerwünscht.
		} catch (BucketFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(tob.read(0).toString());

	}
}
