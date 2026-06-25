package day24;

import java.util.HashMap;
import java.util.Map;
//internal working of a hashmap
public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String,Double> employees=new HashMap();
		employees.put("Alice", 800.0);

		
		//Object class
		System.out.println("HASHCODE OF Alice is " +"Alice".hashCode());
	}

}
