package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("12343241134132", 2500);
		BankAccount acc2 = new BankAccount("99999241134132", 2000);
		BankAccount acc3 = new BankAccount("88888888888132", 1000);
	
		acc1.setName("Ash");
		System.out.println(acc1.getName());
		acc1.makeDeposit(5000);
		acc1.payBill(2000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}
	
	

}

class BankAccount implements IInterest {
	private static int iD = 1000;
	private String accountNumber;
	private String routingNumber;
	private String name;
	private String SSN;
	private double balance;
	
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		System.out.println("New Account Created");
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
			
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		System.out.println(random);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println(accountNumber);
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		showBalance();
		
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return name;
	}
}


