package class6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("shankar");//0
		list.add("cheerala");//1
		list.add("Sravya");
		list.add("Latha");
		list.add("Jittu");
		list.add("Tom");
		list.add("Chris");//6
		System.out.println(list);
		System.out.println(list.get(0));
		list.remove(5);
		System.out.println(list);
		
		//for loop
		System.out.println("Using normal for loop..");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Using iterator for loop..");
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			System.out.println(str);
		}
		System.out.println("Using enhanced for loop ..");
		for (String str : list) {
			System.out.println(str);
		}
		
		
		//for each loop
		
		//while loop
		System.out.println("Using normal for loop..");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
