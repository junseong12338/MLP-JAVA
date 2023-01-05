package ch04.function;

import java.util.Scanner;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 함수 - Call by name
 * 				   
 * 
 */
public class Exam34 {
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1글쓰기 2.글읽기 3. 글수정 4.글삭제");
		
		int num = sc.nextInt();
		
		if(num == 1) {
			insert() ;
		}else if(num == 2) {
			read();
		}else if(num == 3) {
			update();
		}else if(num == 4) {
			update();
			
		}else if(num == 5) {
			delete();
		}
		
		
		sc.close();
	}
	
	
	
	
	public static void insert() {
		System.out.println("글쓰기");
	}
	public static void read() {
		System.out.println("글읽기");
	}
	public static void update() {
		System.out.println("글수정");
	}
	public static void delete() {
		System.out.println("글삭제");
	}
	
}