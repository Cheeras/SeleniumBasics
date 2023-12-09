package class4;

public class SBIBank {
	/*
	 * The first line of the selenium is constructor overloading
	 * ChromeDriver driver = new ChromeDriver();
	 * 
	 * */

	public static void main(String[] args) {
		
		SBIBank sbi = new SBIBank("Vinukonda Branch");
		sbi.transfer();
		sbi.transfer("300USD");
		
		SBIBank sbi1 = new SBIBank("shankar");
		sbi1.transfer();
		
		SBIBank sbi2 = new SBIBank("Cheerala",1000);
		sbi2.transfer("500USD");
	} 
	
	public SBIBank() {
		  System.out.println("Welcome to SBI"); 
	}
	 	
	public SBIBank(String name) {
		System.out.println("Welcome to SBI "+name);
	}
	
	public SBIBank(int amount) {
		System.out.println("Welcome to SBI Total amount is "+amount);
	}
	
	public SBIBank(String name,int amount) {
		System.out.println("Welcome to SBI "+name +"Total Amount in account is "+amount);
	}
	
	public void transfer() {
		System.out.println("Transfer 200USD");
	}
	
	public void transfer(String amount) {
		System.out.println("Transfer "+amount);
	}
}
