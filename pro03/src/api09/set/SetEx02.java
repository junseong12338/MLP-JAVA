package api09.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import api06.ArrayList.Data;

public class SetEx02 {
	public static void main(String[] args) {
		
		Data a = new Data(10,20); 
		Data b = new Data(30,40); 
		Data c = new Data(50,60); 
		
		HashSet<Data> set = new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		Iterator<Data> iter = set.iterator();
		while(iter.hasNext()) {
			Data data = iter.next();
			data.sum();
			data.disp();
		}
		set.add(new Data(1,2));
		set.remove(a);
		System.out.println(set);
	}
}
