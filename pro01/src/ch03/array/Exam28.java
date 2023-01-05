package ch03.array;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 동일한 자료형 모음 index값을 갖는다.
 * 				   
 * 
 */
public class Exam28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[] {55,77,88,99,1205,152};
		
		int sum = 0;
		for(int i = 0; i < array.length;i++) {
			sum += array[i];
		}
		
		System.out.println(sum+"\n");
		
		int num[] = new int[5];
		
		for(int i = 0; i < num.length;i++) {
			
			num[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < num.length;i++) {
			if(num[i] > 10) {
				System.out.println(++num[i]);
			}
		}
		
		
		
		
		sc.close();
		
	
		
		
		
		
		
		
		
		
		
		
	}
}