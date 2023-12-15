package class4.oopslocatorways;

public class ChildClass extends ParentClass {

	String newTool ="UIPath";
	int fee=200;
	public void childClassMethod1() {
		System.out.println("Child class - method1");
	}
	
	public static void main(String args[]) {
		//scenario 1- Child class ref and child class object - you can access all the methods of
		//child class as well parent class provided parent class methods and variables are not private
		
		ChildClass child = new ChildClass();
		child.childClassMethod1();
		child.parentClassMethod1();
		
		System.out.println(child.fee);
		System.out.println(child.newTool);
		System.out.println(child.name);
		System.out.println(child.tool);
	}
}
