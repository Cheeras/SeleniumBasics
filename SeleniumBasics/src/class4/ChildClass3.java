package class4;

public class ChildClass3 extends ParentClass {

	String newTool ="UIPath";
	int fee=200;
	public void childClassMethod1() {
		System.out.println("Child class - method1");
	}
	
	public static void main(String args[]) {
		//scenario 3- Parent class ref Child class object only 
		// properties/variable and methods of parent class are accessible
		ParentClass parent = new ChildClass();
		parent.parentClassMethod1();
		//Parent class ref can be used hold child class object
		//example Object obj = new Stundent();
		//Object obj = new ParentClass();
		//Object obj2 = new ChildClass();
		
		
		
	}
}
