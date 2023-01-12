package api06.ArrayList;

import java.util.ArrayList;

public class ArrayListEx04 {
	
	public static void main(String[] args) {
		Grade a = new Grade(1, "LJS1", 70, 85, 90);
		Grade b = new Grade(2, "LJS2", 77, 99, 88);
		Grade c = new Grade(3, "LJS3", 100,78, 95);
		
		ArrayList<Grade> list = new ArrayList<Grade>();
		list.add(a); // 0 num name ,~~
		list.add(b); // 1 num name ,~~
		list.add(c); // 2 num name ,~~
		
		System.out.println(list);
		
		list.add(new Grade(4, "LJS", 90, 90, 90));
		System.out.println(list);
		
		list.set(3, new Grade(101, "lol", 77, 88, 90));
	
		System.out.println(list);
		
		list.remove(a);
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			Grade grade = list.get(i);
			grade.total();
			grade.average();
		}
		System.out.println(list);
	}
	
}
