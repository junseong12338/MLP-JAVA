package ch06.inheritance07;

import java.util.Scanner;

public class MyCricle extends MyPoint{
	
	private int r;
	public void input() { // 함수 재정의
		sc = new Scanner(System.in);
		
		System.out.println("x");
		x = sc.nextInt();
		
		System.out.println("y");
		y = sc.nextInt();
		
		System.out.println("r");
		r = sc.nextInt();
		
	}
	
	public void output() {
		System.out.println(x+"\t"+y+"\t"+r);
	}

	
}
