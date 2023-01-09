package ch06.inheritance11;

public class Dog extends Animal{
	
	public Dog() {
		super.kind ="포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	

	
}
