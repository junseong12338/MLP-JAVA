package ch01.DataType;

/**
 * @Date : 2023. 1. 2.
 * @Author :이준성
 * @Description :2. 단항 연산자 : !부정, ~이진부정, +/-, ++전위형 cast 또는 자료형 
 * 
 */
public class Exam05 {
	public static void main(String[] args) {
		
	// cast 연산자
	byte  a = 10;
	short b = a;  // 묵시적 형변환

	System.out.println(a + "\n" + b); // 10 10
	
	int x = 10;
	short y = (short)x;
	System.out.println(x + "\n" + y);
	
	int num1 = 10;
	int num2 = 3;
	int sum  = num1 + num2;
	int mul  = num1 * num2;
	float div  = num1 / num2; 		 // 30.0;
		  div  = (float)num1 / num2; // 30.333; 명시적 형변환
	
	System.out.println(sum);
	System.out.println(mul);
	System.out.println(div);
	
	
	
	}

}
