package ch06.inheritance07;

import java.util.Scanner;

public class Exam { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		MyCricle a = new MyCricle();
//		a.input();
//		a.output();
//		
//		MyRect b = new MyRect();
//		b.input();
//		b.output();
		
									
		MyPoint[] array = new MyPoint[5]; //  MyPoint, MYcircle MyRect
		
		for(int i = 0; i <array.length; i++) {
			System.out.println("1.원 2.사각형 3.전체보기 4.종료");
			int x = sc.nextInt();
			
			if(x == 1) {
				array[i] = new MyCricle();
				array[i].input();
			}else if(x == 2) {
				array[i] = new MyRect();
				array[i].input();
			}else if(x == 3) {
				for(int j = 0; j<i; j++) {
					array[j].output();
				}
				--i;
			}else if(x == 4) {
				for(int j = 0; j<i; j++) {
					array[j].output();
				}
				return;
			}
			for(int j = 0; j<i; j++) {
				array[j].output();
			}
		}
		
	}

}
