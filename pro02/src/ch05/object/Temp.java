package ch05.object;

public class Temp {

	private int num;
	public static int count; // 멤버변수 X static 변수 , 클래스 변수(this no)
	
	public Temp() {
		++count;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void disp() {
		System.out.println("num : "+ num);
		System.out.println("count : " + count);
	}
	
	
	
	
	
	
	
	
}


