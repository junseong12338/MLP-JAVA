package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 제어문 - 중첩 (switch ~ case)
 * 
 */
public class Exam16 {

	public static void main(String[] args) {
		
		char a = 'B';
		switch (a) {
		case 'W':
			System.out.println("White");
			break;

		case 'w':	
			System.out.println("White");
			break;
			
		case 'B':
			System.out.println("Blue");
			break;

		case 'b':	
			System.out.println("blue");
			break;			
			
		default:
			break;
		}
	}


}
