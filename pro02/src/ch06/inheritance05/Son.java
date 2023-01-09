package ch06.inheritance05;

public class Son extends Parents{
	
	public void output() {
		System.out.println("자식 output");
	}
	
	// 함수 재정의
	public void disp() {
		System.out.println("재정의된 자식  disp()");
	}

}
