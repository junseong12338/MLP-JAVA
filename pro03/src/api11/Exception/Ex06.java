package api11.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// try 에러가 나는 지점을 묶는다.
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("수 입력");
		int num = sc.nextInt();
	
		System.out.println("수 입력");
		int value = sc.nextInt();
		

		int div = num / value;
		System.out.println("div: "+div);
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch (InputMismatchException e) {
			System.out.println("정수만 입력하시오");
		} finally {// 에러발생, 정상 처리도 무조건 finally을 찾는다.
			// finally 쓰는 이유
			// 네트워크 통신 : 채팅 프로그램 작성 , 소켓   close() 
			// DB 연동 : 오라클 close()
			// 에러가 발생하면 다음 줄로 가지않고 바로 에러 처리 구문 
			// catch로 들어가고 네트워크 DB문을 빠져나갔을 때 
			// 메모리 누수를 방지하기위해서 close()해야하는데 에러 발생시  catch 빠지면
			// 처리할 수 없는데 그때
			// finally 에서 close()해준다.
		}
		
		sc.close();
	}
}
