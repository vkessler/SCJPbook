package _11_06;
/*
 * keywords: synchronized Modfiers 
 * 			-Methoden können synchronized deklariert :
 * 				...sychronized RWT name(Parameterliste )...
 * 			-Block synchronisieren
 * 
 * 		
 */
public class AccountInDanger implements Runnable {
	private Account acc = new Account();
	public static void main(String[] args) {
		
		AccountInDanger r = new AccountInDanger();
		
		Thread frau = new Thread(r, "Lucy");
		Thread mann = new Thread(r, "Fred");
		frau.start();
		mann.start();
		
		
	}

	
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			makewithdraw(10);
			
		}
		
	}



	private /*synchronized */void makewithdraw(int amt) {
		
		System.out.println("blavlblagfj");
		
		synchronized (this) {
			
		
		
		if(acc.getBalance() >= amt){
			System.out.println(Thread.currentThread().getName() + " wird Geldabheben");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			acc.withdraw(amt);
			
			System.out.println(Thread.currentThread().getName() + " hat Geld abgehoben");
			
		}else{
			System.out.println(Thread.currentThread().getName() + " möchte mehr als Kontostand ist: " + "Betrag: " + amt + " Kontos.: " + acc.getBalance());
		}
		
		}
		
		System.out.println("jfjdhgksehkg");
	}

}
