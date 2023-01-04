package ch04.function;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 함수 - Call by name
 * 				   
 * 
 */
public class Exam36 {
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수입력 ");
		int num1 = sc.nextInt();
		
		System.out.println("부호입력");
		String str = sc.next();
		char sign = str.charAt(0);
		
		System.out.println("수입력");
		int num2 = sc.nextInt();
		
		if(sign =='+') 
		{
			sum(num1,sign,num2);
		}
		else if(sign =='-') 
		{
			sub(num1,sign,num2);
		}
		else if(sign =='*') 
		{
			mul(num1,sign,num2);
		}
		else if(sign =='/') 
		{
			div(num1,sign,num2);
		}
		
		sc.close();
	}

	public static void sum(int num1, char sign, int num2) {
		
		int result = num1+num2;
		System.out.println(result);
	}
	
	public static void sub(int num1, char sign, int num2) {
		
		int result = num1-num2;
		System.out.println(result);
	}
	
	public static void mul(int num1, char sign, int num2) {
		
		int result = num1*num2;
		System.out.println(result);
	}
	
	public static void div(int num1, char sign, int num2) {
		
		float result = (float)num1/num2;
		System.out.println(result);
	}
}