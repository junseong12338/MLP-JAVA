package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
* @Description : 제어문 - 조건문 (if ~ else)
 * 
 */
public class Exam11 {

	public static void main(String[] args) {
		
		int num = 50;
		int value = 25;
		
		if (num > value) {
			System.out.println("num가 value보다 크다");
		}else if(num == value) {
			System.out.println("num가 value와 같다");
		}else if(num < value) {
			System.out.println("num가 value와 작다");
		}
		
	}

}
