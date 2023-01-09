package ch06.inheritance09;

public class Dog extends Animal{
	
	public Dog() {
		super.kind ="포유류";
	}
	
	public void sound() {
		System.out.println("멍멍");
	}
	
	public void play() {
		System.out.println("공놀이");
	}
	
}
