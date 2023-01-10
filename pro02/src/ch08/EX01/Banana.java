package ch08.EX01;

public class Banana {
	
	private int num;
	private Apple apple;
	
	public void setData(int num,Apple apple) { // 매개변수, 매개 Object
		this.num = num;
		this.apple = apple; // 변수 함수 생성자
	}
	
	public void sub() {
		int temp = 77; // 지역 변수
	
		Apple a = new Apple(); // 지역 Object,변수 함수 생성자
	}
	
	public void disp() {
		System.out.println(num);
		System.out.println(apple.getData());
	}
}
