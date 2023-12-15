package class4.oopslocatorways;

public class ChildClass2 extends ParentClass {

	String newTool ="UIPath";
	int fee=200;
	public void childClassMethod1() {
		System.out.println("Child class - method1");
	}
	
	public static void main(String args[]) {
		//Base class ref and Base class object you can access only base class methods and base class
		//variables
		ParentClass parent = new ParentClass();
		parent.parentClassMethod1();
		System.out.println(parent.name);
		System.out.println(parent.tool);
		
	}
}
