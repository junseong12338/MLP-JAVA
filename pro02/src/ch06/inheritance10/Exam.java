package ch06.inheritance10;

public class Exam {


	public static void main(String[] args) {
		
		// 추상클래스는 자기 자신의 객체 생성 불가 
		// upcasting은 가능함
		// Parents p = new Parents();
			
		Parents p = new Son(1,2);
		p.msg();
		p.disp();
	}
}
