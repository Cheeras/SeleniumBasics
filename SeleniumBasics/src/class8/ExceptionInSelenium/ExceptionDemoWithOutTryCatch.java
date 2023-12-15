package class8.ExceptionInSelenium;

public class ExceptionDemoWithOutTryCatch {

	public static void main(String[] args) {

		int [] num = new int[2];
		try {
		num[0]=10;
		num[1]=20;
		num[2]=30;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("seems some thing is wrong with indexing please check the array size");
		}
		System.out.println(num[0]);
		System.out.println("Program end");
	}
}
