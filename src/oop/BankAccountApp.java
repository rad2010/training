package oop;

public class BankAccountApp {

	
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("Checking");
		BankAccount acc3 = new BankAccount("Savings", 500);
		acc3.checkBalance();
		acc3.withdraw(250);
		acc3.deposit(500);
		acc3.setName("Ashok");
		System.out.println(acc3.getName());
	}
	
	
	
}
