package api01.System;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SystemEx {
	public static void main(String[] args) throws IOException {
		PrintStream ps=System.out;     // 모니터 출력
		ps.println("API 시작입니다.");
		ps.println(10);
		ps.println(24.5f);
		
		System.out.println(55.5f);
		
		System.out.println("입력하세요:");
		InputStream is=System.in;    // 문자열(x), int(x),  float(x)
		char value=(char) is.read();
		is.read();    // \r
		is.read();    // \n
		System.out.println(value);
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("수입력:");
			int su=sc.nextInt();
			
			if(su==5) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);     // 프로그램 종료(0, 1) (-1)  break, return 
			}
		}
	}
}