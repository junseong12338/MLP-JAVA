package ch06.inheritance08;

public class Student extends Person{
	private int age;
	
	public void setData(String message) {
		super.message = message;
		this.age = 10;
	}
	
	public void disp() {
		System.out.println(message);
		System.out.println(age);
	}
}
