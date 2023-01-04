package ch02.contorl;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 입력 (키보드 System.in)/문자열 -- 자바 소스 
 * 				    자바소스 작성 -- 출력 (모니터 System)/문자열
 * 
 */
public class Exam25 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c); // View 훨씬 만다
		 
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("문자열 입력");
		String str = sc.next();
		
		
		System.out.println("정수형 입력");
		int num = sc.nextInt();
		
		
		
		System.out.println("정수형 입력");
		Short sh = sc.nextShort();
		
		
		
		System.out.println("실수형 입력");
		float fl = sc.nextFloat();
		
		
		System.out.println(str);
		System.out.println(num);
		System.out.println(sh);
		System.out.println(fl);
		
		sc.close();
		
		
		
	}
	
}


