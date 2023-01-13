package api11.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
//		try 에러가 나는 지점을 묶는다.
		Scanner sc = new Scanner(System.in);
		
		
		try {

		System.out.println("수 입력");
		int num = sc.nextInt();		
			if(num ==5) {
				NumberFormatException ex =new NumberFormatException();
				throw ex;
			}
		}catch (Exception e) {
			System.out.println("숫자5는 커스텀에러가 발생합니다.");
		}
		finally {
			sc.close();
		}
		
	}
		
	
}
