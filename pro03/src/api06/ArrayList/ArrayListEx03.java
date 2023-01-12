package api06.ArrayList;

import java.util.ArrayList;

public class ArrayListEx03 {
	
	public static void main(String[] args) {
		
		DataEx03 a = new DataEx03(1,2);
		DataEx03 b = new DataEx03(3,4);
		DataEx03 c = new DataEx03(5,6);
		DataEx03 d = new DataEx03(7,8);
		
		
		ArrayList<DataEx03> list = new ArrayList<DataEx03>();
		
		list.add(a); // 0번지 : x, y, z, Data() Data(int x int y), sum(), disp()
		list.add(b);
		list.add(c);
		list.add(d);


		for(int i=0; i < list.size();i++) {
			DataEx03 data = list.get(i);
			data.sum();
			data.disp();
		}
		DataEx03 e = new DataEx03(10,20);
		list.add(e);
		System.out.println();
		

		
		for(int i=0; i < list.size();i++) {
			DataEx03 data = list.get(i);
			data.sum();
			data.disp();
		}
		
		list.add(new DataEx03(10,20));
		list.add(2, new DataEx03(77,88));
		list.remove(0);
		list.set(3, new DataEx03(55,66));
		
		for(int i=0; i < list.size();i++) {
			DataEx03 data = list.get(i);
			data.sum();
			data.disp();
		}
		
		System.out.println(list);
	}
	
}
