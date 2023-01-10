package ch08.EX01;

public class Temporary {

	public void input() {}
	
	// 접근 제한자, 지정예악어 (abstract final), 반환형, 함수명(매개변수)
	
	public final void aa() {  // 상속가능하지만 상속 재정의 불가
		
		System.out.println("Final 함수 입니다.");
	} 
	
	public static void bb () {
		System.out.println("bb Function");
	}
	
	public void cc() {
		input();		//this
		aa();			// this
		Temporary.bb(); // 클래스명으로 접근 생략가능
		bb(); 
	}
	
	public static void dd() { // static함수는 static함수만 불러올 수 있음	
//		input();		
//		aa();	
		
		bb();
		
	}

}
