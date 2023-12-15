package class4.oopslocatorways;

import differentpack.NewParentClass;

public class NewChildClass extends NewParentClass {

	String newTool ="UIPath";
	int fee=200;
	public void childClassMethod1() {
		System.out.println("Child class - method1");
	}
	
	public static void main(String args[]) {
		
		NewChildClass child = new NewChildClass();
		child.childClassMethod1();
		child.parentClassMethod1();
		
	}
}
