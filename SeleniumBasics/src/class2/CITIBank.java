package class2;

public class CITIBank {
	
	public void openAccount() {
		System.out.println("Open account in CITIBank");
	}

	// this is non static method
	public void withdraw() {
		System.out.println("With draw from CITIBank");
	}
	
	public void deposit() {
		System.out.println("deposit money in CITIBank");
	}
	
	public void buyMutualFund() {
		System.out.println("buy mutual funds from CITIBank");
	}
	
	public void closeAccount() {
		System.out.println("close account in CITIBank");
	}
	//every non static methods should be called using the object 
	//every static methods can be called by using className
	

}
