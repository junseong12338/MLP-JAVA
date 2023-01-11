package api02.String;

import java.util.Scanner;

public class StringEx02 {
	public static void main(String[] args) {
		
		
		// M V C
		System.out.println("문자열을 기본타입으로 변환");
		String x = "10"; 			// View
		Scanner sc = new Scanner(x);
		int num = sc.nextInt(); 	// 10 들어감
		System.out.println(++num);  // 11 나옴
		int value = Integer.parseInt(x);
		System.out.println(value); // 정수형으로 변환함
		
		
		String y = "55.5";
		Scanner s = new Scanner(y);
		
		float f = s.nextFloat();
		System.out.println(f);
		
		float ff = Float.parseFloat(y);
		System.out.println(ff);
		

		// M C V
		
		System.out.println("기본타입 문자열로 변환");
		
		int aa = 77;
		String ivar = String.valueOf(aa);
		String fvar = String.valueOf(10.5f);
		String bvar = String.valueOf(true);
		
		System.out.println(ivar);
		System.out.println(fvar);
		System.out.println(bvar);
		
		sc.close();
		s.close();
		
	}

}
