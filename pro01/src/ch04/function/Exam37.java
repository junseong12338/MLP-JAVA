package ch04.function;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 5.
 * @Author :이준성
 * @Description : 함수 - Call by value ~ return
 * 				   
 * 
 */
public class Exam37 {
	public static void main(String[] args) {	

		int x = sub1();
		float y = sub2();
		String z =  sub3();
		int sum = sub4(10,20);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(sum);
	}


	public static int sub1() {
		// TODO Auto-generated method stub
		int x = 10;
		return x;
	}
	
	public static float sub2() {
		// TODO Auto-generated method stub
		float y = 22.5f;
		return y;
	}
	
	
	public static String sub3() {
		
		return "Hi";
	}
	
	public static int sub4(int num1, int num2) {
		
		return num1+num2;
	}

}