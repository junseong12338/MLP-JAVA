package ch04.function;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 함수 - 배열을 return value하기
 * 				   
 * 
 */
public class Exam38 {
	public static void main(String[] args) {	
		
		int[] array = new int[] {1,2,3,4};
		func1(array[0]);
		func2(array);
		
		
		String[] f= func4();
		for(int i = 0 ; i<f.length; i++) {
			System.out.println(f[i]);
		}
		
	}
	
	public static void func1(int num) {
		
		System.out.println(num);
	}
	
	public static void func2 (int[] array) {
		
		for(int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static String sub3() {
		return "A";
	}
	
	
	public static String[] func4() {
			String[] array = new String[] {"사과","바나나","딸기","메론"};
			return array;
	}
}