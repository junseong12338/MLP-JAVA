package ch03.array;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 다차원 배열(2차원,3차원....)
 * 				   
 * 
 */
public class Exam31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int [2][3];
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				System.out.println(i+"행"+j+"열"+"수 입력 : ");
				array[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
				
			}System.out.println();
		}
		
		sc.close();
	}
}