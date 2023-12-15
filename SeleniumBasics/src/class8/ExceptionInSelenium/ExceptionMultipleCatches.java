package class8.ExceptionInSelenium;

public class ExceptionMultipleCatches {

	public static void main(String[] args) {

		int [] num = new int[2];
		try {
		num[0]=10;
		num[1]=20;
		num[2]=30;
		}
		catch(IllegalAccessError e) {
			System.out.println(e.getMessage());
			System.out.println("seems some thing is wrong with indexing please check the array size");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("seems some thing is wrong with indexing please check the array size");
		}
		
		/*catch(ArrayIndexOutOfBoundsException e) {
			//Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
			System.out.println(e.getMessage());
			System.out.println("seems some thing is wrong with indexing please check the array size");
		}*/
		
		//when you are exception handling coding using try catch block always child class followed by Parent class
		// but not Parent class followed by child class
		System.out.println(num[0]);
		System.out.println("Program end");
	}
}
