package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		map.put("AXAY", 75);
		map.put("Ankit", 123);
		map.put("Palash", 234);
		map.put("Krishna", 121);
		map.put("Ankit K", 124);
		map.put("Ankit", 123);
		map.put("AXAY", 76);
		
		System.out.println("Iterating Our HashMap:");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getValue() +" " + m.getKey());
		}
		
	}
}
