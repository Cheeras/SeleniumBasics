package class10;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer,String> studentNames = new HashMap<Integer,String>();
		studentNames.put(1234, "Shankar");
		studentNames.put(4561, "Chris");
		studentNames.put(9516, "Yogesh");
		studentNames.put(7894, "Manish");
		studentNames.put(1234, "Priyesh");//  if the key is same it will override existing value
		
		System.out.println(studentNames);
		
		

	}

}
