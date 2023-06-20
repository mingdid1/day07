package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestClass03 {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("이름", "홍길동");
		map.put("나이", "20");
		map.put("주소", "산골짜기");
		System.out.println("map : " + map);
		// map : {이름=홍길동, 주소=산골짜기, 나이=20}
		
		System.out.println(map.keySet());	// [이름, 주소, 나이]
		System.out.println(map.values());	// [홍길동, 산골짜기, 20]
		
		
		Set<String> set = map.keySet();
		System.out.println("set : " + set);	// [이름, 주소, 나이]
		
		
		Iterator<String> it = set.iterator();		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		
	}
}
