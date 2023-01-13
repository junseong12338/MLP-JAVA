package api11.Exception;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("x : ");
			int x = sc.nextInt();
			
			System.out.print("y : ");
			int y = sc.nextInt();
			
			
			int z = x + y;
			System.out.println(z);
		}catch (Exception e) {
			System.out.println("에러 발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			if(sc !=null)sc.close();
		}
		

	
	}
		
	
}

