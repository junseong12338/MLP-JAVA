package ch01.DataType;

/**
 * @Date : 2023. 1. 2.
 * @Author :이준성
 * @Description :6. 삼항 연산자
 * 
 */
public class Exam06 {
	public static void main(String[] args) {
		
	// 10 : 0000 1010	
	 int a = 10;
	// 2 : 0000 0010
	 int b = 2;
	 
	 
	 // 2  : 0000 0010
	 System.out.println(a & b);
	 // 10 : 0000 1010
	 System.out.println(a | b);
	 // 8  : 0000 1000
	 System.out.println(a ^ b);
	 
	 // 관계와 논리연산자가 같이 많이 사용된다.
	 int num = 15;
	 boolean x = num > 10 && num < 20;
	 System.out.println(x); // true
	 
	 boolean y = num == 10 || num == 15;
	 System.out.println(y); // true
	 
	
	}

}
