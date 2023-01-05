package ch04.function;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 5.
 * @Author :이준성
 * @Description : 함수 - Call by value ~ return
 * 				   
 * 
 */
public class Exam37_1 {
	public static void main(String[] args) {	
	

		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어");
		int kor = sc.nextInt();
		
		System.out.println("영어");
		int eng = sc.nextInt();
		
		System.out.println("수학");
		int mat = sc.nextInt();
		
		int tot = total(kor,eng,mat);
		System.out.println(total(kor,eng,mat));
		
		float avg = average(tot);
		
		
		
		String credit = Credit(avg);
		System.out.println(tot);
		System.out.println(avg);
		System.out.println(credit);
		sc.close();
		
	}
	
	public static int total (int x, int y, int z) {
		
		return (x + y+ z);
	}
	
	public static float average(int avg) {
		return avg /3;
	}
	
	public static String Credit(float avg) {
		
		String credit = "";
		
		if(avg >= 90) {
			credit = "A학점";
		}else if(avg >= 80) {
			credit = "B학점";
		}else if(avg >= 70) {
			credit =  "C학점";
		}else if(avg >= 60) {
			credit =  "D학점";
		}
		return credit;
	}
	
	
}