package api06.ArrayList;

import java.util.ArrayList;

// List - ArrayList
// 배열과 차이점 : 추가 삭제  수정 가능
public class ArrayListEx01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("JSP");
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		
		System.out.println(list.get(0));
		System.out.println("저장된 총 객체 수 : " +list.size());
		
		
		for(int i = 0; i< list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		System.out.println();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		
		for(int i = 0; i< arr.size();i++) {
			Integer num = arr.get(i);
			System.out.println(num);
		}
		
		System.out.println(arr.toString()+"\n");
		
		// 10,22.2, apple, A
		ArrayList<Object> array = new ArrayList<Object>();
		array.add(10);
		array.add(22.2);
		array.add("apple");
		array.add('A');
		
		
	}
}
