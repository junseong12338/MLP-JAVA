package ch06.inheritance06;

/**
 * @Date : 2023. 1. 9.
 * @Author :이준성
 * @Description : 상속 - 함수 재정의 (Overriding)
 * 
 */
public class Exam { 

	public static void main(String[] args) {
		Parents p = new Parents(1,2);
		 
		p.cal();
		System.out.println();
		Son s = new Son(77,88);
		s.disp();
		s.cal();
		
		System.out.println();
		Parents c = new Son(100,200);
		c.cal();
		
		
	}

}
