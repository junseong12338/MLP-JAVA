package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 제어문 - 조건문 (switch ~ case)
 */

public class Exam15 {
	 public static void main(String[] ar){
			int su=4;
			
			switch(su){                // 정수형, 문자형 가능
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default : 
				System.out.println("1~5까지만 나옵니다.");
				break;
			}
		}
}