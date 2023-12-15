package class6.windowsalertscollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
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
		
		System.out.println("Using enhanced for loop ..");
		for (String str : list) {
			System.out.println(str);
		}
		
		list.addFirst("First");
		list.addLast("Last");
		System.out.println(list);
		
		
	}
}
