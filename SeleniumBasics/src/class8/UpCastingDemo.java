package class8;

public class UpCastingDemo {

	public static void main(String[] args) {
	
		
		/*byte-->short-->int-->long-->float-->double
		 * char-->int
		 * */
		
		int a =10;
		float f =a;// upcasting
		System.out.println(f);
		
		int b=10;
		short c = (short)b;//downcasting
		System.out.println(c);
		
		

	}

}
