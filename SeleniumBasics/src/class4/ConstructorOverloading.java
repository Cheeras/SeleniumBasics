package class4;

public class ConstructorOverloading {

	/*what is constructor
	 * Constructor is special method of a class which is same as className,it can not have
	 * return type not even void 
	 * Always try to avoid class name as method name
	 * Dont have to call - it will be called automatically once you create an object
	 * Initialise instance variable or data members
	 * */
	public static void main(String args[]) {
		
		ConstructorOverloading con = new ConstructorOverloading();
	}
	
	public ConstructorOverloading() {
		System.out.println("Constructor Overloading");
	}
}
