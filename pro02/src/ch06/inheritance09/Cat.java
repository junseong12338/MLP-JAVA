package ch06.inheritance09;

public class Cat extends Animal{
	
	public Cat() {
		super.kind ="포유류";
	}
	
	public void sound() {
		System.out.println("냥냥");
	}
	
	public void eat () {
		System.out.println("츄르 냠냠");
	}
	
}
