package class5;

public class SBIBank implements BankApplication{

	@Override
	public void termAndConditions() {
	System.out.println("Terms and condition are followed from RBI");	
	}
	
	@Override
	public void calHomeEMI() {
		System.out.println(BankApplication.homeLoanRate);
		System.out.println("Home Loan EMI "+45000);
		
	}

	@Override
	public void calCarEMI() {
		System.out.println(BankApplication.car_Loan_Rate);
		System.out.println("Car Loan EMI "+45000);
		
	}

	public void savingAccount() {
		System.out.println("Interest rate is 2 %");
	}

	
	public static void main(String args[]) {
		
		//Scanario 1- child class ref and Child class obj - all the methods of parent class and child 
		//class are accessible
		SBIBank bank = new SBIBank();
		bank.calCarEMI();
		bank.calHomeEMI();
		bank.savingAccount();
		
		//scenario 2 - base class ref and child class object - only base class methods can be accessible not child class 
		//methods
		BankApplication app = new SBIBank();
		app.calCarEMI();
		app.calHomeEMI();
		
		//Scenario 3- Baseclass ref and Base class object
		//we can not create object for interface because it have only method prototypes does not have 
		//method defintions
		//BankApplication obj = new BankApplication();//invalid scenario
		
		//Scenario 4 - Child class ref and Base class object - invalid
		//	SBIBank obj = new BankApplication();//invalid scenario
	}

	
}
