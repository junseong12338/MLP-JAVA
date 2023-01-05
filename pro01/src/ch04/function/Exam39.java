package ch04.function;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 함수 - 함수 중복 Overload(overlodaing)

 */
public class Exam39 {
	public static void main(String[] args) {	
	
	
		
		disp("LJS");
		disp(10);
		disp(55.f);
		disp(10,20);
		disp('A');
		
	}
	
	public static void disp(String str) {
		System.out.println(str);
	}
	
	public static void disp(int x) {
		System.out.println(x);
	}
	
	public static void disp(float y) {
		System.out.println(y);
	}
	
	public static void disp(int x , int y) {
		System.out.println(x +" "+ y);
	}
	
	public static void disp(char ch) {
		System.out.println(ch);
	}
	
	
}