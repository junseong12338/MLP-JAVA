package api02.String;

public class StringEx01 {
	public static void main(String[] args) {
		String str="apple";      // int, float, char 기본 자료형이 아님
		String a=new String("apple");
		
		String subject="자바프로그래밍";
		char at=subject.charAt(5);
		System.out.println("해당 문자 추출:" + at);
		
		int len=subject.length();
		System.out.println("문자열 길이:" + len);     
		
		int index=subject.indexOf("프로그래밍");
		System.out.println("해당문자열의 위치:" + index + "\n");
	
		// 남, 녀  - 19 : 1, 2  / 20 : 3, 4  / 재외국민 5, 6
		String juminBunho="123456-1234567";
		if(juminBunho.length() == 14) {
			int loc=juminBunho.indexOf("-");
			// System.out.println(loc);
			
			if(loc != -1) {
				char gender=juminBunho.charAt(loc+1);
				
				switch(gender) {
				case '1' : case '3' : case '5':       // gender=='1' || ~~~
					System.out.println("남자입니다.");
					break;
					
				case '2' : case '4' : case '6':
					System.out.println("여자입니다.");
					break;
				
				default:
					System.out.println("잘못입력하셨습니다.");
				}
				
			}else {
				System.out.println("해당 문자가 존재하지 않습니다.");
			}
			
			
		}else {
			System.out.println("주민번호 자리가 틀립니다.");
		}
		
		
	}


		
		
}
