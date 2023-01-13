package api11.Exception;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x:");
		
		int x =sc.nextInt();
		
		System.out.println("y:");
		int y =sc.nextInt();
		
		
		try {
			int z =  x/y;
			System.out.println(z);
		}catch (Exception e) {
			
		}
	
		
		
		
		sc.close();
	}

}
