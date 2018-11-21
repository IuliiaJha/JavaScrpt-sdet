package map;

import java.util.*;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
	
		//Map map = new HashMap();
		Map<String,String> map = new HashMap<>();
		
		map.put("My name", "Mike");
		map.put("My Job", "developer");
		map.put("My Age", "25");
		map.put("x", "y");
		System.out.println(map);
		
		System.out.println(map.get("My name"));
		System.out.println(map.get("My Job"));
		
		Set<String> keys = map.keySet(); // collect everething together for looping
		for(String key:keys) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
