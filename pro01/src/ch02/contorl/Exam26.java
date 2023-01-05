package ch02.contorl;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 입력 (키보드 System.in)/문자열 -- 자바 소스 
 * 				    자바소스 작성 -- 출력 (모니터 System)/문자열
 * 
 */
public class Exam26 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		
		// 입력된 수가 양수이면 출력
		System.out.println("수 입력 : ");
		
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수 : "+num);
		}
		else {
			System.out.println("음수 입니다.");
		}
		
		
		sc.close();
		
		
		
	}
	
}


