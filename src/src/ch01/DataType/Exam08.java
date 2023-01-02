package ch01.DataType;

/**
 * @Date : 2023. 1. 2.
 * @Author :이준성
 * @Description : 6. 삼항 연산자 : 조건식 ? 참 : 거짓
 *				: 7. 대입연산자  : =, +=, *=, /= != ...ETC
 *				: 8. 후위형 증감 연산자 num++, value-- 
 *				: 9. 컴마(순차)연산자.
 *
 */ 	
public class Exam08 {
	public static void main(String[] args) {
		
		// 삼항 연산자 : 조건식 ? 참 : 거짓
		int a = 10;
		System.out.println(a==10 ? "T" : "F"); // T
		
		int b = 20;
		int c = 30;
		int d = b!=c ? b:c;
		System.out.println(d); //20;
		
		
		// 대입 연산자 대입연산자  : =, +=, *=, /= != ...ETC
		int i = 100;
		System.out.println(i+=2); // i = i+2 102
		System.out.println(i-=2); // i = i-2 100
		System.out.println(i*=2); // i = i*2 200
		System.out.println(i/=2); // i = i/2 100
		
		// 8. 컴마(순차)연산자
		int x=10, y=20,z=30;
		
		
		
		
		
		
		
		
		
		
	}

}
