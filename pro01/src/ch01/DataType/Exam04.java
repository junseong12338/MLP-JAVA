package ch01.DataType;

/**
 * @Date : 2023. 1. 2.
 * @Author :이준성
 * @Description :산술 연산자
 * 
 */
public class Exam04 {
	public static void main(String[] args) {
		
	int x = 10;
	int y = 20;
	int sum = x + y;
	int sub = x - y;
	int mul = x * y;
	float div = (float)x/y;
	int rest = x%3;
	
	System.out.println("sum : " + sum ); // 30
	System.out.println("sub : " + sub ); // -10
	System.out.println("mul : " + mul ); // 200
	System.out.println("div : " + div ); // 0.5
	System.out.println("rest : " + rest ); // 1
	
	
	
	}

}
