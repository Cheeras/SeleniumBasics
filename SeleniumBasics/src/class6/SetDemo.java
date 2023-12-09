package class6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();
		/*
		 * No duplicates are allowed
		 * No indexing
		 * only using enhaced forloop and iterator
		 * */
		names.add("Bala");
		names.add("Soniya");
		names.add("Priyesh");
		names.add("Vijay");
		names.add("Asif");
		names.add("BalA");
		System.out.println(names);
		
		System.out.println("Iterating the set Using enhaced for loop");
		//using enhanced for loop
		for(String str:names) {
		System.out.println(str);
		}
		System.out.println("Iterating the Set Using Iterator");
		//using iterator
		for(Iterator<String> itr = names.iterator();itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		
	}

}
