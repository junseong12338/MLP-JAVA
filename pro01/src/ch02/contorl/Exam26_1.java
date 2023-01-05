package ch02.contorl;
import java.util.Scanner;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 입력 (키보드 System.in)/문자열 -- 자바 소스 
 * 				    자바소스 작성 -- 출력 (모니터 System)/문자열
 * 
 */
public class Exam26_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 0;
		do {
			System.out.println("구구단");
			int num = sc.nextInt();
			for(int i=1; i<=9; i++) {
				System.out.println(num +" * "+i+"="+num*i);
			}
			System.out.println("다시?(y/n)");
			String str = sc.next();
			ch = str.charAt(0);
		} while(ch =='Y' || ch == 'y');
			
		System.out.println("구구단 종료");
		
		sc.close();
		
		
		
	}
	
}


