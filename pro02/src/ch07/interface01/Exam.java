package ch07.interface01;


public class Exam {

	public static void main(String[] args) {
	 
		// Apple a = new Apple 인터페이스는 객체발생 불가 
		
		Banana b = new Banana();
		b.disp();
		
		// upcasting 가능
		Apple c = new Banana();
		c.disp();
		
		// downcasting 가능
		Banana d = (Banana) c;
		d.disp();
	}
}
