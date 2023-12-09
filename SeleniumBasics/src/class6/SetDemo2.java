package class6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {

		/*
		 * Set will not allow duplicate values
		 * for set there is no indexing,meaning using set we can not access
		 * elements using index
		 * */
		Set<String> countries = new HashSet<String>();
		countries.add("India");
		countries.add("UnitedStages");
		countries.add("UK");
		countries.add("Spain");
		countries.add("Italy");
		countries.add("Italy");
		System.out.println(countries);
		
		//Iterating the over the set using normal for loop it is not possible
		//Iterating the Set elements using enhaced for loop
		
		System.out.println("Iterating the Set using enahced for loop");
		for(String coun : countries) {
			System.out.println(coun);
		}
		
		//Iterating the set using iterator
		System.out.println("Iterating the set using Iterator object");
		for(Iterator<String> country =  countries.iterator();country.hasNext();) {
			System.out.println(country.next());
		}
		
		//Iterating using while loop
		System.out.println("Iterating the set using while loop iterator");
		Iterator<String> coun =  countries.iterator();
		while(coun.hasNext()) {
			System.out.println(coun.next());
		}
	}
}
