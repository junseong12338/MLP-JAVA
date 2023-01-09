package ch06.inheritance11;

public abstract class Animal { // 추상클래스
	
	protected String kind;
	
	public void breathe() {
		System.out.println("숨쉬는 중");
	}
	
	// 추상 함수
	public abstract void sound();
	
}
