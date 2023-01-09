package ch05.object;

 /**
 * @Date : 2023. 1. 6.
 * @Author :이준성
 * @Description : 생성자
 * 				    데이터 전달 방법 3가지 (.(점) 연산자, 클래스 함수, 생성자)
 * 				    클래스  : 변수 함수(중복자) 생성자로 이루어져 있다.
 */
public class Exam48 {

	public static void main(String[] args) {
			
		Test a  = new Test(1, 2);
		
		Test b  = new Test();
		b.disp();
		
		
	}

}
