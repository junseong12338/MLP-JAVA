package ch06.inheritance08;

public class Exam {

	public static void main(String[] args) {
		
		
		int a= 10;
		long c = a; // 묵시적 형변환
		byte b = (byte)a;
		
		
		Person p = new Person();
		p.setData("연습");
		System.out.println(p.getData());
		
		Student s = new Student();
		s.setData("사과"); // 함수 중복 Person의  setData 오버 라이딩
		s.disp();
		
		// 부모는 자식을 담아 줄 수 있다.
		// 클래스에서는 부모것을 더 크게 본다.
		// 겁나 중요함 ㅇㅇ 
		Person x = new Student(); // Upcasting  자동 형변환 묵시적 형변환 
		Student z = (Student) x;  // downcasting 명시적 형변환 
		
		z.setData("z임"); // 함수 중복   Person의  setData 오버 라이딩
		z.disp();
		
	 // Student y = new Person(); 안됨
	}
}
