package ch04.function;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description :

 */
public class Exam40 {
	public static void main(String[] args) {	
	
		int a = 10;
		int b = 20;
		int c= func(a, b);
		
		float x = 30.3f;
		float y = 44.4f;
		float z = func(x, y);
		
		System.out.println(c);
		System.out.println(z);
		
	}
	
	
	public static int func(int a, int b) {
		return a+b;
	}
	
	public static float func(float x, float y) {
		return x+y;
	}

}