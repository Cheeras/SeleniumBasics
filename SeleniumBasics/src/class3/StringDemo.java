package class3;

public class StringDemo {

	public static void main(String[] args) {
		
		String name = "Welcome to Selenium Automation Lib";
		boolean status1 = name.startsWith("Welcome");
		boolean status2 = name.endsWith("Shankar");
		boolean status3 = name.contains("Lib");
		boolean status4 = name.equals("Welcome to Selenium Automation Lib");
		boolean status5 = name.equalsIgnoreCase("Welcome TO Selenium Automation LIB");
		boolean status6 = name.contains("SelE");
		
		System.out.println(status1);//true
		System.out.println(status2);//false
		System.out.println(status3);//true
		System.out.println(status4);//true
		System.out.println(status5);//true
		System.out.println(status6);//false - contains method is case sensitive
		
		
	}

}
