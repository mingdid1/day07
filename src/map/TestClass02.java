package map;

import java.util.HashMap;

public class TestClass02 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("num", 100);
		map.put("age", 20);
		System.out.println("map : " + map);
		// map : {num=100, age=20}
		
		int n1 = map.get("age");
		System.out.println("n1 : " + n1);
		System.out.println("map.get(num) : " + map.get("num"));
		
		System.out.println(map.containsKey("age"));		// true
		System.out.println(map.containsValue(100));		// true
		
		
		map.put("age", 100);		// key 중복안됨
		System.out.println("map : " + map);		// map : {num=100, age=100}
		
		
		map.remove("age");
		System.out.println("remove : " + map);	// remove : {num=100}
		
	}
}
