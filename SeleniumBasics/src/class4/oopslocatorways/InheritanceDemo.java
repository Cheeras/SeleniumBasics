package class4.oopslocatorways;

public class InheritanceDemo {

	public static void main(String[] args) {

		ChildClass child = new ChildClass();
		child.childClassMethod1();
		child.parentClassMethod1();
		
			System.out.println(child.tool);
			System.out.println(child.name);
			System.out.println(child.newTool);
			System.out.println(child.fee);
		
	}

}
