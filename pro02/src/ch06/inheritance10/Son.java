package ch06.inheritance10;


// 추상클래스를 상속 받았으면 무조건 추상함수를 재정의 해야한다.. 강제성 
public class Son extends Parents { // x,y msg()
	// 추상클래스안에는
	// 일반함수와 추상함수를 가지고 있다.
	// 인터페이스는 전부다 재정의 해야함 모든 함수가 추상 메서드로 되어있음
	
	public Son(int x, int y) {
		super.x = x;
		super.y = y;
		
	}
	
	// 재정의 해도그만 안해도 그만 반강제
	public void msg () {
	
	}
	// 강제성
	public void disp(){
		
		System.out.println(x+"\t"+y);
	}
}
