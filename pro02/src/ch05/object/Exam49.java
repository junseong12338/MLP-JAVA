package ch05.object;

 /**
 * @Date : 2023. 1. 6.
 * @Author :이준성
 * @Description : 생성자
 * 				    데이터 전달 방법 3가지 (.(점) 연산자, 클래스 함수, 생성자)
 */
public class Exam49 {

	public static void main(String[] args) {
			
		Birthday lee = new Birthday(1995, 12, 25, "이준성");
		
		lee.disp();
	}

}
