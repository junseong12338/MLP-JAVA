package api09.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		// 저장은 순서를 유지하지 않는다.
		map.put("Spring", "봄");
		map.put("Summer", "여름");
		map.put("Fall", "가을");
		map.put("Winter", "겨울");
		System.out.println(map.get("Spring"));
		
		System.out.println(map);
		
		map.put("apple","사과");
		System.out.println(map);
		
		map.remove("Fall");
		System.out.println(map);
		
		// 전체 데이터 출력
		// 전체 키값으로 데이터 출력
		System.out.println();System.out.println();
		Set<String> set = map.keySet();
		System.out.println(set);
		Iterator<String> iter =  set.iterator();
		while(iter.hasNext()) {
			String value = map.get(iter.next());
			System.out.println(value);
		}
		
		
		HashMap<Integer, Object> hashmap = new HashMap<>();
		
		hashmap.put(10, "gd");
		hashmap.put(20, 68.63);
		hashmap.put(30, 11);
		System.out.println(hashmap);
		
		Set<Integer> s = hashmap.keySet();
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()) {
			Object obj = hashmap.get(i.next());
		}

		
	}

}
