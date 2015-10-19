package _10_19;

import java.io.Console;

public class TestConsole {
	public static void main(String[] args) {
		Console con = System.console();
		
	if(con != null){
		System.out.print("User name: ");
		String user = con.readLine();
		System.out.print("Password: ");
		
		char[] password = con.readPassword();
		

		
		System.out.println(user + " passwrod: " + password.toString());
		
	}
		
	}

}
