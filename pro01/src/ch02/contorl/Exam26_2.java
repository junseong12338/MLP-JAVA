package ch02.contorl;
import java.util.Scanner;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 수 2개 입력받는다.
 * 부호입력
 * 
 */
public class Exam26_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char sign = 0;
		int num1 = 0;
		int num2 = 0;
		int val = 0;
		
		do {
			System.out.println("숫자 계산기");
			System.out.print("num1 입력:");
			num1 = sc.nextInt();

			System.out.print("부호 입력 : ");
			String str = sc.next();
			
			System.out.print("num1 입력:");
			num2 = sc.nextInt();
			
			sign= str.charAt(0);

			// 연산
			
			if(sign =='+') {
				val = num1 + num2;
				System.out.println(val);
			}else if(sign =='-') {
				val = num1 - num2;
				System.out.println(val);
			}
			else if(sign =='*') {
				val = num1 * num2;
				System.out.println(val);
			}
			else if(sign =='/') {
				val = num1 / num2;
				System.out.println((float)val);
			}
			else {
				System.out.println("옮바른 부호가 아닙니다. 다시입력하세요");
				System.out.println();
			}
		}while(sign !='+' && sign !='-'&& sign !='*' && sign !='/');
			
			
			
	
		
		
	}
	
}


