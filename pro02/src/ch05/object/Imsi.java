package ch05.object;

public class Imsi {
	
	// 이클래스를 제외한 다른곳에서는 쓸수있다.
	// 아무리 퍼블릭 되어있다고 해도 지역안에 서  선언된건 불가능
	
	private int num; 	// 멤버 변수
	private int value;
	// 함수 안에서 쓰이는걸 지역 변수라고한다.
	public void apple(int a, int b/*매개변수*/) {
		// 지역 변수  : 특정 블럭안에서 사용되는 변수 
		// 기준 함수 안에서 사용하는 변수 
		int num = 77;
		++a;
		
		{
			int temp = 50;
		}
		
		// System.out.println(temp);EROR
		
		for(int i=0; i <3; i++) {
			System.out.println(i);
		}
	}
	
	
	public void banana() {
		
		
		apple(1,2);
		
		// System.out.println(a); EROR
		
	}
}
