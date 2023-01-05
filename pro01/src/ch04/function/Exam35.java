package ch04.function;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 함수 - Call by value
 * 				   
 * 
 */
public class Exam35 {
	public static void main(String[] args) {	
		sub(10,22.5f,"JSL" ,'가');
	}
	

	public static void sub(int a, float b,String c, char d) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}