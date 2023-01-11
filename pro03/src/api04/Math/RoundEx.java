package api04.Math;

public class RoundEx {

	public static void main(String[] args) {
		
		double x = 123.5567;
		double y = 456.4567;
		
		int a = (int) Math.round(x);
		System.out.println("반올림 : "+a);
		
		 int b = (int) Math.ceil(y);
		System.out.println("무조건 올림 : "+b);
		
		 int c = (int) Math.floor(x);
		System.out.println("무조건 내림 : "+c);
		
		// 소수 셋째짜리 올림 둘째짜리 출력 - 다른 클래스 사용 예정
	}

}
