package api06.ArrayList;

import java.util.ArrayList;

public class ArrayListEx02 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("바나나");
		list.add("딸기");
		list.add("수박");
		
		System.out.println(list.toString());
	
		System.out.println();
		// 추가 삭제 수정
		list.add("메론");
		list.add(1,"JAVA"); // 추가 
		System.out.println(list);
	
		list.set(4, "Oracle"); // 수정
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
	
	}
	
}
