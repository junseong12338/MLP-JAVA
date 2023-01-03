package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 제어문 - 조건문 (중첩 if ~ else)
 * 
 */
public class Exam13 {

	public static void main(String[] args) {
		
		int num=150;
		
		if(num > 0){
			if(num >200){
				System.out.println("200보다 큰수 입니다.");
			}else{
				System.out.println("200보다 작은수 입니다.");
			}
		}else{
			System.out.println("음수입니다");
		}
		
		
		
		
//		int num = 4;
//		
//		switch(num) { // 정수형, 문자형 가능 , 간단한 정수형 수직만 가능
//			case 1 :
//				System.out.println("1번임");
//				break;
//			case 2 : 
//				System.out.println("2번임");
//				break;
//			case 3 : 
//				System.out.println("3번임");
//				break;
//			case 4 : 
//				System.out.println("4번임");
//				break;
//			default:
//				System.out.println(" 1~4 까지만 출력됩니다.");
//		}
		
	}


}
