package ch06.inheritance07;

import java.util.Scanner;

public class MyPoint {
	
	protected Scanner sc; 
	protected int x;
	protected int y;
	
	public void input() {
		System.out.println("데이터 입력");
		this.x = sc.nextInt();
		
	}
	
	public void output() {
		System.out.println("데이터 출력");
	}
	
}
