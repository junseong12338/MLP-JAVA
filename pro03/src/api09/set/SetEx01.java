package api09.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx01 {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("strawberry");
		set.add("strawberry");
		System.out.println(set);
		
		// 중복 x 추가 삭제 o 교체 x
		
		set.add("수박");
		set.remove("strawberry");
		System.out.println(set);
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비워져있음");
		}
		
		System.out.println();
		
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("바나나");
		list.add("메론");
		
		Iterator<String> t =list.iterator();
		while(t.hasNext()) {
			while(t.hasNext()) {
				System.out.println(t.next());
			}
		}
	}
}
