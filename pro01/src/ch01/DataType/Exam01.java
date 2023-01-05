package ch01.DataType;

public class Exam01 {

/**
 * @Date : 2023. 1. 2.
 * @Author :이준성
 * 설명 : 자료형
 * 			숫자 : 정수형(byte, short, int, long)
 * 					 실수형 (float, double)
 * 			문자 : char
 * 			문자열 : String - 클래스
 * 			논리형 : boolean
 * */
	
	public static void main(String[] args) {
		
		System.out.println("정수형 자료형");
		
		byte a = 10;     // 1byte
		short b = 128;	 // 2byte
		int  c = 1000;   // 4byte
		long d = 6580L;  // 8byte
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		System.out.println("실수형 자료형");
		
		float e = 45.4f;
		double f = 120.40;
		System.out.println(e);
		System.out.println(f);
		System.out.println();
	

		System.out.println("문자형 자료형");
		char x ='a';
		char y = '김';
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		System.out.println("문자열 자료형  - 클래스/객체");
		String str1 = "Hell Java";
		String str2 = "안녕하세요, 추워요~";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("논리형 자료형");
		boolean b1 = true;   // 1 true
		boolean b2 = false;  // 0 false
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
