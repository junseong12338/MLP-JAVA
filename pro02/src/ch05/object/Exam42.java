package ch05.object;

public class Exam42 { // 실행 클래스

	public static void main(String[] args) { // JDK 시작
		
		
		
		
		
		Obj_test A = new Obj_test(); // 클래스명 객체명 = new 클래스 명
		A.x=10;
		A.y=22.2f;
		A.z='A';
		System.out.println(A.x + "\t"+ A.y +"\t" +A.z);
		
		
		Obj_test B = new Obj_test(); 
		B.x=20;
		B.y=55.5f;
		B.z='B';
		System.out.println(B.x + "\t"+ B.y +"\t" +B.z);
		
		
		Obj_test C = new Obj_test(); 
		C.x=30;
		C.y=66.6f;
		C.z='C';
		System.out.println(C.x + "\t"+ C.y +"\t" +C.z);
		
		
	}
	
}
