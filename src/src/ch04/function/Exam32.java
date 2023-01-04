package ch04.function;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 함수(function, method)
 * 				   
 * 
 */
public class Exam32 {
	public static void main(String[] args) {	// main 함수는 JDK 호출
 // 접근 제한자 지정 예약어  반환형함수 이름 (매개변수...){구현부}
		
		System.out.println("함수 시작");
		sub();
		System.out.println("banana");
		sub();
	}
	
	
	public static void sub() { // 나중에 의미 있는 기능 역할
		System.out.println("안녕 하시오");
		
	}
}