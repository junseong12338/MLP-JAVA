package ch05.object;

public class Birthday {
	
	
	private int year;
	private int month;
	private int day;
	private String name;
	
	

	public Birthday(int year, int month, int day, String name) {
	
		this.year = year;
		this.month = month;
		this.day = day;
		this.name = name;
	}
	
	public void disp() {
		System.out.println(name+ "\t" + year);
	}
	
	
	
	
}
