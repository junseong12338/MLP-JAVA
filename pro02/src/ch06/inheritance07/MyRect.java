package ch06.inheritance07;

import java.util.Scanner;

public class MyRect extends MyPoint{
	private int w;
	private int h;
	
	public void input() {
		sc = new Scanner(System.in);
		
		
		System.out.println("x");
		x = sc.nextInt();
		
		System.out.println("y");
		y = sc.nextInt();
		
		System.out.println("w");
		w = sc.nextInt();
		
		System.out.println("h");
		h = sc.nextInt();
	}
	
	public void output() {
		System.out.println(x+"\t"+y+"\t"+w+"\t"+h);
	}
	
	
}
