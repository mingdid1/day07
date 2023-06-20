package map;

import java.util.HashMap;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		 	Map - HashMap
		 	- 순서를 유지하지 않는다
		 	- key, value 형식으로 만들어진다
		 	- key의 중복은 허용되지 않으며 value 중복은 가능하다
		 */
		
		HashMap<String, String> map = new HashMap<>();

		map.put("num", "100");
		map.put("name", "홍길동");

		System.out.println("map : " + map);		// map : {num=100, name=홍길동}
		System.out.println(map.get("num"));		// 100
		System.out.println(map.get("name"));	// 홍길동
		System.out.println(map.get("없는키"));	// null
		
		
		
	}
}
