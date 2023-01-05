package ch01.DataType;

/**
 * @Date : 2023. 1. 2.
 * @Author :이준성
 * @Description :4. 관계 연산자
 * 
 */
public class Exam07 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		boolean c = a > b;  // 10 > 20
		boolean d = a < b;  // 10 < 20
		boolean e = a >= b; // 10 >= 20
		
		System.out.println(c); // false
		System.out.println(d); // true
		System.out.println(e); // false
		
		int x = 100;
		int y = 200;
		
		boolean num = x ==y;  // 100 == 200
		boolean value = x!=y; // 100 != 200
		
		System.out.println(num);   // false
		System.out.println(value); // true
	
	}

}
