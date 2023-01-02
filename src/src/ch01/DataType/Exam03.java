package ch01.DataType;

/**
 * @Date : 2023. 1. 2.
 * @Author :이준성
 * @Description :2. 단항 연산자 : !부정, ~이진부정, +/-, ++전위형 cast 또는 자료형 
 * 
 */
public class Exam03 {
	public static void main(String[] args) {
		
		int x = 10;
		x++; // 후위형 증감 연산자
		++x; // 전위형 증감 연산자
		System.out.println("x : " + x); 	   // 12
		 
		--x;
		x--;
		System.out.println("x : " + x +"\n");  // 10
	
		
		int y = 20;
		int z = ++y;

		System.out.println("y : " + y); 	   // 21
		System.out.println("z : " + z +"\n");  // 21
		
	
		System.out.println("x : " + x+"\n");
		
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = ++num1 + num2--;
	
		
		System.out.println("num1 : " + num1);  // 11
		System.out.println("num2 : " + num2);  // 19
		System.out.println("sum  : " + sum);   // 31
	}

}
