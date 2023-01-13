package api09.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import api06.ArrayList.Data;

public class HashMapEx03 {

	public static void main(String[] args) {
		Data a = new Data(10,20);
		Data b = new Data(30,40);
		Data c = new Data(50,60);
		
		HashMap<String, Data> map = new HashMap<>();
		map.put("one",a);
		map.put("two",b);
		map.put("three",c);
		
		System.out.println(map.toString());
		Data one = map.get("one");
		one.sum();
		one.disp();
		
		System.out.println(); 
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()){
			Data data = map.get(iter.next());
			data.sum();
			data.disp();
		}
		
		// 추가 삭제 교체
		
		map.put("four", new Data(77,88));
		map.replace("two", new Data(1,2));
		map.remove("one");
		
		System.out.println(map);
	}

}
