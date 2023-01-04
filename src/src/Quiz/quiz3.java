package Quiz;

public class quiz3 {

	public static void main(String[] args) {
/*
	1. 다음 괄호안에 알맞은 답을 적으세요.
		① 자바의 조건문에는 단순 if문, (if~else ), 다중 if~else문, switch문이 있다.
		② switch문의 case에 ( break)이 생략되면 다음 break문을 만날 때까지 아래로 계속 실행된다

	2. 다음 리터럴 중에서 case문의 값으로 사용할 수 없는 것은? 4
		① 10 ② "A" ③ 'A' ④ 5.4

	3. 다음 조건문을 삼항 조건 연산자를 이용하여 한 줄로 작성하라 i = (j%2? 10:20)
		if(j%2==0){
		 i=10;
		}else{
		 i=20;
		}
		
		
 
	4. 다음 프로그램 코드에 대한 결과값은?  2
		int x=2, y=3;
		if(x>2){
		 if(y>2){
		 int z=x+y;
		 System.out.println("z is : " + z);
		 }
		}else{
		 System.out.println("x is:" + x); 
		}
 	
 	5. 다음 switch문이 실행된 후 y값은 무엇인가? 11
		int x=3, y=10
		switch(x+3){
		 case 6 :
		 y+=1; break;
		 default :
		 y*=2; break;
		}

	6. 다음 switch문에서 변수 a의 값은?  19
		int a=3
		switch(a){
		 case 1 : a+=5; break;
		 case 2 : a+=10; break;
		 case 3 : a+=16; break;
		 case 4 : a+=34; break;
		}
		
	7. 다음 if~else문을 switch문으로 바꾸세요.

	
 	 if(i==1){
		 System.out.println("!");
		}else if(i==2){
		 System.out.println("@");
		}else if(i==3){
		 System.out.println("#");
		}else{
		 System.out.println("*");
		}
		
	switch(i){
	 case 1 : System.out.println("!"); break;
	 case 2 : System.out.println("@"); break;
	 case 3 : System.out.println("#"); break;
	default : System.out.println("*"); break;
			  
	}
 	 
 	 8. 다음 프로그램을 보시고 결과값을 작성하세요. 45
		int num=32;
		int value=45;
		int max=0;
		if(num > value){
		
			max=num;
			
		}else{
			max=value;
		}
		System.out.println("max:" + max);
 	 
 	 
 	 9. 다음의 프로그램을 실행하면 어떤 결과가 출력 될까요? coin (K)
		char coin='K';
		switch(coin){
		case 'A':case 'a':
			System.out.println("사과");
		break;
		case 'P':case 'p':
			System.out.println("배");
		break;
		case 'G':case 'g':
			System.out.println("포도");
		break;
		default:
			System.out.println(coin);
		break;
 	 
 	 10. 다음 예제에서는 두 개의 if문을 사용하고 있다. 이를 하나의 if문만 사용하는 방식으로 변경해보자
 	 
		 	int num=120;
			if(num >0)
			if(num%2==0)
			System.out.println("양수이면서 짝수");
			
 	 		================================================
 	 		
 	 		int num=120;
			if(num >0 && num%2==0)
			System.out.println("양수이면서 짝수");
 	 		================================================

			11. 다음 예제의 프로그램을 완성하세요. visitCount == 0 
			[결과]: 처음 오셨군요. 방문해 주셔서 감사합니다.
 	 
		 	int visitCount=0;
			if(visitCount == 0 ){
				System.out.println("처음 오셨군요. 방문해 주셔서 감사합니다.");
			}else if(visitCount > 0){
				System.out.println("또 오셨군요!! 방문해 주셔서 감사합니다.");
			}
		}
 	 
 	 12. 다음 예제의 프로그램을 완성하세요. (조건식 : num 120은 0보다 크면 200보다 작다)
		[결과]: 200보다 작은수

	 	int num=120;
		if( num < 0 ){
			System.out.println("0미만");
		}else{
		if(num < 200 ){
			System.out.println("200보다 작은수");
		}else{
			System.out.println("200보다 큰수");
		}
	}
 	 
 	 13. 다음 프로그램의 결과 값을 작성하세요.
		int su=2;
		switch(su){
		case 1:
			System.out.println("Simple java");
		case 2:
			System.out.println("Funny java");
		case 3:
			System.out.println("Fantastic java");
		}
 	 
 	 	결과 : Funny java Fantastic java
 	 
 	 
 	 14. 다음 예제의 프로그램을 완성하세요.
 	 	[결과] 20이상 30미만의 수
 	 	
		int value=24;
		
		switch(value/10){
		case 0:System.out.println("0이상 10미만의 수");break;
		case 1:System.out.println("10이상 20미만의 수");break;
		case 2:System.out.println("20이상 30미만의 수");break;
		}
		
		
	15. 다음 예제 프로그램을 조건연산자(삼항연산자)를 사용하지 않고, if~else를 사용하여 프로그램을 변경하세요.
		int su=50;
		int value=100;
		int big=0, diff=0;
		
		big=(su > value) ? su : value;
		System.out.println("big:" + big);
		
		diff=(su < value) ? su-value : value-su;
		System.out.println("diff:" + diff);
		
		================================================
		if(su > value) {
			big = su;
			System.out.println("big:" + big);
		}
		else {
			big = value;
			System.out.println("big:" + big);
			
		}
		
		
		if(su < value) {
			diff = su-value
			System.out.println("diff:" + diff);
		}
		else {
			diff = value-su;
			System.out.println("diff:" + diff);
			
		}
		
		
		16. 다음 표를 보고 프로그램을 작성하세요. (switch ~ case 문) **별도 그림 참조
		
		String position="과장";
		
		// 프로그램 작성
		switch(position){
		case "부장":System.out.println("700만원");break;
		case "과장":System.out.println("500만원");break;
		case "대리":System.out.println("300만원");break;
		case "사원":System.out.println("200만원");break;
		}
		
		
		
		
		17. 다음 표를 보고 프로그램을 작성하세요. (다중 if ~ else 문)
		char gread='B';
		// 프로그램 작성
		
		if(gread == 'A' || gread =='a') {
			System.out.println("우수회원입니다.");
		}
		
		else if (gread == 'B' || gread =='b') 
			System.out.println("정회원입니다.");

		else if (gread == 'C' || gread =='c') 
		System.out.println("일반회원입니다.");
 	 	
 	 	else System.out.println("손님 입니다.");
 	 
  */	


	
	}
}
