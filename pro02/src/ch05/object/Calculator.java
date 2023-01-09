package ch05.object;

import java.util.Scanner;

public class Calculator { // 사칙 연산 계산기
	
	
	private int num1;
	private int num2;
	
	private char sign;
	int number = 0;

	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자1 입력 정수형 ");
		num1= sc.nextInt();
		
		System.out.println("연산자 입력");
		String str = sc.next();
		sign = str.charAt(0);
		
		System.out.println("숫자2 입력 정수형 ");
		num2= sc.nextInt();
		
		
		while(sign !='+' && sign !='-' && sign !='*' && sign !='/') {
			
		}
		sc.close();
	}
	public void result() {
		if (sign == '+') {
			number = num1 + num2;
			System.out.println(number);
		}
		if (sign == '-') {
			number = num1 - num2;
			System.out.println(number);
		}
		if (sign == '*') {
			number = num1 * num2;
			System.out.println(number);
		}
		if (sign == '/') {
			number = num1 / num2;
			System.out.println(number);
		}
	}

	
	
	
}
