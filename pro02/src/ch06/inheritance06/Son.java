package ch06.inheritance06;

public class Son extends Parents{
	
	public Son() {
		super();
	}
	
	public Son(int x, int y) {
		super(x,y);
	}
	
	public void disp() {
		System.out.println("월요일 조아~ 최고로 조아~");
	}
	
	public void cal() { // 함수 재정의 이렇게하면... 일단 드는 생각이 내가 원하는 값만 오버라이딩해서 뽑아쓰면 데이터 절약 가능할듯?
		System.out.println("mul : "+(x*y));
	}
}
