package ch06.inheritance10;

public abstract class Parents { // 추상클래스 - 추상함수를 하나라도 가지고 있으면
	protected int x;
	protected int y;
	
	public void msg() {
		System.out.println("하하하");
	}
	
	public abstract void disp(); // 추상함수 
	// 접근 제한자 지정 예악어 (abstract) 반환형 함수명(매개변수...)
}
