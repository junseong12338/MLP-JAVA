package ch06.inheritance05;

/**
 * @Date : 2023. 1. 9.
 * @Author :이준성
 * @Description : 상속 - 함수 재정의 (Overriding)
 * 
 */
public class Exam { 

	public static void main(String[] args) {
		 Parents p = new Parents();
		 
		 p.aa();
		 p.bb();
		 p.cc();
		 p.dd();
		 p.disp();
		 System.out.println();
		 
		 Son s = new Son();
		 s.aa();
		 s.bb();
		 s.cc();
		 s.dd();
		 s.disp(); // 오버 라이딩한 함수
		 
		 
		 
		 // 부모관점
		 Parents e = new Son();
		 e.aa();
		 e.bb();
		 e.cc();
		 e.dd();
		 e.disp(); // 자식
		
	}

}
