package ch06.inheritance11;

public class Cat extends Animal{
	
	public Cat() {
		super.kind ="포유류";
	}
	
	// 반드시 재정의 필요
	@Override
	public void sound() {
		System.out.println("냥냥");
	}
	
	public void eat () {
		System.out.println("츄르 냠냠");
	}
	
}
