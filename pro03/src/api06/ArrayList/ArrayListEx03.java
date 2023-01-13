package api06.ArrayList;

import java.util.ArrayList;

public class ArrayListEx03 {
	
	public static void main(String[] args) {
		
		Data a = new Data(1,2);
		Data b = new Data(3,4);
		Data c = new Data(5,6);
		Data d = new Data(7,8);
		
		
		ArrayList<Data> list = new ArrayList<Data>();
		
		list.add(a); // 0번지 : x, y, z, Data() Data(int x int y), sum(), disp()
		list.add(b);
		list.add(c);
		list.add(d);


		for(int i=0; i < list.size();i++) {
			Data data = list.get(i);
			data.sum();
			data.disp();
		}
		Data e = new Data(10,20);
		list.add(e);
		System.out.println();
		

		
		for(int i=0; i < list.size();i++) {
			Data data = list.get(i);
			data.sum();
			data.disp();
		}
		
		list.add(new Data(10,20));
		list.add(2, new Data(77,88));
		list.remove(0);
		list.set(3, new Data(55,66));
		
		for(int i=0; i < list.size();i++) {
			Data data = list.get(i);
			data.sum();
			data.disp();
		}
		
		System.out.println(list);
	}
	
}
