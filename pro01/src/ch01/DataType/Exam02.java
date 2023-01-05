package ch01.DataType;

/**
 * @Date : 2023. 1. 2.
 * @Author :이준성
 * @Description :  연산자 우선순위
 *                         1. 최우선 연산자 : . 클래스,  [ ] 배열, ( )
 *                         2. 단항 연산자 : !(부정), ~(이진부정 ), +/-, ++(전위형), cast 또는 (자료형)
 */

public class Exam02 {
	public static void main(String[] args) {
		
		boolean a=false;
		boolean b=!a;
		System.out.println(a + "\t" + b);
		
		int x=100;
		int y=-200;
		System.out.println(x + "\t" + y);       //   100     -200
		System.out.println(-x  + "\t" + -y);    //  -100      200
		System.out.println(x + "\t" + y);       //   100     -200 원본데이터 영향 안준다.
	}
}
