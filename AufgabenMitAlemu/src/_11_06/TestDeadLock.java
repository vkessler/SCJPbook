package _11_06;

public class TestDeadLock {
	private static class Resource{
		private int value;
	}
	
	private Resource a = new Resource();
	private Resource b = new Resource();
	
	public int read(){
		synchronized (a) {
			synchronized (b) {
				return a.value + b.value;
				
			}
		}
		
		
	}
	
	public void write(int x, int y){
		synchronized (b) {
			synchronized (a) {
				a.value = x; b.value = y;
				
			}
			
		}
	}

}
