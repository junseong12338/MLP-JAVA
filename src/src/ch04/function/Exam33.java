package ch04.function;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 함수 - Call by name
 * 				   
 * 
 */
public class Exam33 {
	public static void main(String[] args) {	// main 함수는 JDK 호출
 // 접근 제한자 지정 예약어  반환형함수 이름 (매개변수...){구현부}

		
		for(int i = 0; i<5; i++) {
			apple();
			
		
		}
		System.out.println("end");
		
	}
	
	
	public static void apple() { // 나중에 의미 있는 기능 역할
		System.out.println("사과");
		
	}
}