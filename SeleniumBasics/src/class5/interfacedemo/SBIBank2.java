package class5.interfacedemo;

public class SBIBank2 implements BankApplication{
	//class to class - extends
	//class to interface - implements
	//interface to interface - extends

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

		//Scenario 1 - Child class ref and Child class obj all the methods of child class and child class variables(Provided both classes in same package) are
		//accessbile
		SBIBank2 bank = new SBIBank2();
		bank.calCarEMI();
		bank.calHomeEMI();
		bank.savingAccount();
		bank.termAndConditions();
		
		//Scenario 2 - Base class ref and child class object - only base class methods and variable can able 
		//to access, can not able to access child class methods and variables
		
		BankApplication obj = new SBIBank2();
		obj.calCarEMI();
		obj.calHomeEMI();
		obj.termAndConditions();
		
		//Scenario 2 - Base class ref and Child class object - Only base class methods and variables(Provided both base class/interface and 
		//child class in same package) can able to access
		RBI obj2 = new SBIBank2();
		obj2.termAndConditions();
		
		//Scenario 3 - Base class ref and base class obj
		//		BankApplication obj3 = new BankApplication(); it is invalid we can not create object for interface in java till java 1.7 from 
		
		/*
		 * Scenario 4 - Base class ref and base class obj
		 * */
		//		RBI obj4 = new RBI(); it is invalid we can not create object for interface in java till java 1.7
		// why we can not create object because interface contains only contains prototype of method no implementaion
		
		
		
		
	
	}
}