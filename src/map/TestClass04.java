package map;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestClass04 {
	public static void main(String[] args) {
		
		//HashMap<String, Integer> map = new HashMap<>();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		map.put("선풍기", 100);
		map.put("자동차", 200);
		map.put("에어컨", 300);
		System.out.println(map);
		
		// HashMap : {에어컨=300, 선풍기=100, 자동차=200}
		// LinkedHashMap : {선풍기=100, 자동차=200, 에어컨=300}
		
		// Set<String> set = map.keySet();
		// Iterator<String> it = set.iterator();
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
