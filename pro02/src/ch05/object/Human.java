package ch05.object;

public class Human {
	
	
	private String name;
	private String address;
	private String ph;
	private String rsnum;
	private int age;
	
	
	public void setData(String n, String a, String p, String r, int ag ) {
		name = n;
		address = a;
		ph = p;
		rsnum = r;
		age = ag;
	}
	
	
	public void disp() {
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(ph);
		System.out.println(rsnum);
		System.out.println(age);
	}
	
	
	
	
	
}
