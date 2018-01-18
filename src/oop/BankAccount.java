package oop;

public class BankAccount {

	String AccountNumber;
	private String routingNumber;
	private String Name;
	String ssn;
	String AccountType;
	double balance;
	BankAccount(){
		System.out.println("BANK ACCOUNT CREATED");
	}
	
	BankAccount(String accountType)
	{
		System.out.println("new account " + accountType);
	}
	
	BankAccount(String accountType, double initialAmt)
	{
		System.out.println("new Account Type" + accountType + "£" + initialAmt);
		String Msg = null;
		if (initialAmt < 1000) {
			 Msg = "Minumum Deposit should be more than £1000";
		}
			else  {
				Msg = "Thank you for your initila deposit of " + initialAmt;
			}
			System.out.println(Msg);
			
			balance = initialAmt;
	
		
	}
	
	private void showActivity(String Activity) {
		System.out.println("your RECENT TRANSACTION " + Activity);
		System.out.println("your NEW BALANCE IS " + balance);
		
	}
	
	public void setName(String Name) {
		this.Name = Name;
		System.out.println("account name is " + Name);
		

	}

	
	public String getName() {
		return Name;
		
	}
	public  void deposit(double amount) {
		balance = (balance + amount);
		showActivity("DEPOSIT");
	}

	void withdraw(double amount) {
		balance = (balance - amount);
		showActivity("WITHDRAW");
	}
	
	void checkBalance() {
		System.out.println("your Balance = " + balance);
	}
	
	void getStatus() {
		
	}



}




	
	
