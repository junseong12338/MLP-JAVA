package ch02.contorl;

// shfit alt j
/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
* @Description : 제어문 - 조건문 (if ~ else)
 * 
 */
public class Exam10 {

	public static void main(String[] args) {
		
		int a = -25;
		if (a > 0) {
			System.out.println("양수 입니다.");
		}
		else {
			System.out.println("음수 입니다.");
		}
		
		System.out.println();
		
		if(a%2==0) {
			System.out.println(a + "는 짝수 입니다.");
		}else {
			System.out.println(a + "는 홀수 입니다.");
		}
		
		
		int score = 70;
		if(score >= 70) {
			System.out.println("점수는 합격 입니다.");
		}else {
			System.out.println("점수는 불합격 입니다.");
		}
	}

}
