package class2.Overriding;

public class BankingApplication {

	public static void main(String[] args) {

		//this is static area
		BankingApplication hdfcBank = new BankingApplication();
		hdfcBank.openAccount();
		hdfcBank.deposit();
		hdfcBank.withdraw();
		hdfcBank.closeAccount();
		CITIBank citi = new CITIBank();
		citi.openAccount();
		citi.deposit();
		citi.withdraw();
		citi.buyMutualFund();
		citi.closeAccount();
	}
	
	public void openAccount() {
		System.out.println("Open account");
	}

	// this is non static method
	public void withdraw() {
		System.out.println("With draw");
	}
	
	public void deposit() {
		System.out.println("deposit money");
	}
	
	public void buyMutualFund() {
		System.out.println("buy mutual funds");
	}
	
	public void closeAccount() {
		System.out.println("close account");
	}
	//every non static methods should be called using the object 
	//every static methods can be called by using className
	
}
