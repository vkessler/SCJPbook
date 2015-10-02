package _10_02;
/*
 * throws , throw
 * try -catch
 * try -catch - finally
 * 
 */
public class Zusammenfassung {
	public static void main(String[] args)  {
		try {
			go(12, 0);
		} catch (Exception e) {
			
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
static int divide(int a, int b) throws Exception{
	if(b == 0) throw new Exception(new ArithmeticException("Nenner ist 0"));
	return a/b;

}

static void go(int x, int y) throws Exception{
	
	int  r = divide(x, y);
	System.out.println(r);
	
}

}
