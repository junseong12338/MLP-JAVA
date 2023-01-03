package ch01.quiz;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 다음 문장에 맞는 수식을 작성하시오.
//		(1) 변수 no는 4보다 크거나 같다. no >=4;
//		(2) 변수 kimchi는 2와 8사이의 수이다. kimchi >=2 && kimchi <= 8
//		(3) 변수 book는 -2와 0사이 또는 5와 8사이의 수이다 book >-2 && book < =0 || book >=5 && book <= 8
	
//		2. 변수 city에 최종적으로 저장되는 수는 얼마인가?
//				int city=7; 7 
//				city+=7;  14
//				city-=2; 12
//				city*=5; 60
//				city%=8; 4	
//		3. 다음 수식은 참(true)인가 거짓(false)인가?
//				(1) ‘a’==’b’ false
//				(2) 100>=99 || 4==4 true
//				(3) !(3>6) && 4<6 true
		
//		 boolean x=a<b;
//		 boolean y=a==b;
//		 boolean z=a!=b;
//		 System.out.println("x:" + x);
//		 System.out.println("y:" + y);
//		 System.out.println("z:" + z);

		 int a=10; // 10
		 int b=20; // 20
		 int c=++a + ++b; // 32
		 int d=a++ + b++; // 32
		 int e=++a + b++; // 35
		 int f= a-- + --b; // 35  12 22
		 System.out.println("c:" + c);
		 System.out.println("d:" + d);
		 System.out.println("e:" + e);
		 System.out.println("f:" + f);
		 
//		 6. 자동 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?
//		 byte byteValue=10;
//		 char charValue=20;


//		 ① int intValue=byteValue;
//		 ② int intValue=charValue;
//		 ③ short shortValue=charValue;
//		 ④ double doubleValu=byteValue;
		 
//		 7. 다음 문장을 수행한 후 z값은? 4
//		 int x=2, y=10, z=0;
//		 z=x++*2+x*(y%2);
//		 System.out.println(z);

//		 8. 다음 문장을 실행하면 출력되는 값은? 10
//		 int opr=10;
//		 System.out.println(opr++);
		 
//		 9. 다음 실행 결과는 에러입니다. 에러가 나는 부분을 찾아서 수정하세요. 
//		 short su=10;
//		 byte value=(byte)su;
//		 System.out.println("su:" + su);
		 
//		 10. 다음 프로그램의 결과 값은?
//		 int su=10;
//		 System.out.println(su> 0 ? "양수": "음수"); 양수
		 
//		 11. 다음 프로그램의 결과 값은?		 
//		 boolean play=true;
//		 play=!play;
//		 System.out.println("play값은:" + play); false

//		 12. 다음 프로그램의 결과 값은?	 B
//		 int score=85;
//		 char grade=(score > 90) ? 'A' : ((score > 80) ? 'B':'C');
//		 System.out.println(score + "점은" + grade + "등급입니다."); 
		 
//		 13. 다음 코드를 실행했을 때 출력 결과는 무엇입니까?	가
//		 int score=85;
//		 String result=(!(score>90)) ? "가":"나";
//		 System.out.println(result); 
		 
//		 14. 다음 코드는 비교 연산자와 논리 연산자의 복합연산입니다. 연산식의 출력 결과를 괄호
//		 속에 넣으세요		  true false
		 int x=100;
		 int y=5;
		 System.out.println((x>7) && (y<=5));
		 System.out.println((x%3==2) || (y%2 !=1));
		 
	
	}

}
