package ch05.object;

import java.io.PrintStream;

/**
 * @Date : 2023. 1. 6.
 * @Author :이준성
 * @Description : 변수
 * 				    static 변수 
 */
public class Exam52_3 {

	public static void main(String[] args) {
		PrintStream ps = System.out;
		ps.print("d");
		
		
		int a= Byte.BYTES;
		int max = Byte.MAX_VALUE;
		int min = Byte.MIN_VALUE;
		int size = Byte.SIZE;
		
		System.out.println(a);
		System.out.println(max);
		System.out.println(min);
		System.out.println(size);
		
	
	}

}
