package _11_06;

public class Account {
	private int balance = 50;

	public  int getBalance() {
		return balance;
	}

	public  void withdraw(int amount) {
		this.balance -= amount;
	}
	
	

}
