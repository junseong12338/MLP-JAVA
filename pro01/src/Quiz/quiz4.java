package Quiz;

public class quiz4 {

	public static void main(String[] args) {
		
/*
	1. 조건문과 반복문을 설명한 것 중 틀린 것은 무엇입니까? 2 
		① if문은 조건식의 결과에 따라 실행 흐름을 달리 할 수 있다.
		② switch문에서 사용할 수 있는 변수의 타입은 int, double이 될 수 있다.
		③ for문은 카운터 변수로 지정한 횟수만큼 반복시킬 때 사용 할 수 있다.
		④ break문은 switch문, for문, while문을 종료할 때 사용할 수 있다.
	 	
	 	
	 	
	2. 괄호 안에 알맞게 작성하세요.
		① 자바의 반복문은 for문, while문, (do while ) 문의 3가지 이다.
		② ( continue)문은 반복문을 빠져나가지 않고 다음 반복으로 진행한다.
		③ ( break)문은 하나의 반복문을 빠져나갈 때 사용한다. 	
	 	
	 	
	 3. while문을 가진 다음 프로그램에 실행 결과는?  30
			int i=0, sum=0;
			
			while(i<10){
				i=i+2;   2 4 6  8  10 
				sum +=i; 2 6 12 20 30
			}
			System.out.println(sum);

	 	4. 다음 코드의 실행 결과는 무엇인가?  1 2 4 5 7 8 
		int num=0;
		while(true){
			num++;
			if(num>=10) break;
			if(num%3==0) continue;
			System.out.print(num + "\t");
		}
	 	
	 	
	 	5. 출력값을 10, 9, 8..... 1 순으로 정수를 출력하는 프로그램을 만들려고 합니다. 괄호 안에 알맞은 식을 작성하세요.
	 	
	 		for(int i = 10; i>0; i-- ){
				System.out.println(i);
			}
	 	
	 	6. 다음 프로그램 코드에 대한 결과값은? 1
			int balance=10;
			while(true){
				if(balance < 5) break;
				balance=balance-9;
			}
			System.out.println("balance:" + balance)
		
		7. 다음 반복문에서 break outer문이 실행된 후에 어느 문장(줄 번호)이 실행 되는가? 1줄
			1줄: outer: for(int i=1;i<=10;i++){
			2줄: for(int j=1;j<10;j++){
			3줄: if(i*j > 50) break outer;
			4줄: System.out.print(i*j + "\t");
			5줄: };
			6줄: System.out.println();
			}
		
 */	
		
//		8. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 프로그램을  작성하세요. [출력화면] sum:1683
		
//		int sum = 0;
//		for(int i = 1;i<=100;i++) {
//			if(i % 3== 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
//		9. 방정식 2x+4y=10의 모든 해를 구하시오. 단 x와y는 정수이고 각각의 범위는 (단 0<=x<=10, 0<=y<=10이다)
		
//		for(int x = 0; x < 10; x++) {
//			for (int y = 0; y < 10; y++) {
//				
//				if((2*x) + (4*y) == 10) {
//					System.out.println("x="+x+","+"y="+y);
//				}
//				
//			}
//		}
		
//		10. for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성하세요. 삼각형
		
//		for(int i=5; i > 0; i--) {
//			for(int j=i ; j<=5; j++) {
//				System.out.print("*");
//				}
//				System.out.println();
//		}	
		
//		11. 1~20까지의 정수 중에서 2의 배수 또는 3의 배수가 아닌 수의 총합을 구하시오. [출력화면] sum:174
//		int sum = 0;
//		for(int i = 1; i <= 20; i++) {
//			
//			if(i%2 != 0 && i%3!=0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
//		12. 0.01 ~ 1 까지 0.01씩 증가하여 연속적인 수를 더하는 프로그램을 작성하세요. [출력화면] sum:50.499985
		
//		float sum = 0;
//		for(float i = 0; i<=1; i+=0.01 ) {
//			sum+=i;
//		}
//		System.out.println(sum);

		 
//		13. 1~100까지 계속 더해 나갔을 때, 총합이 500이 넘을 때 반복문에서 빠져 나오세요. [출력화면] sum : 528
		
//		int sum = 0;
//		int i = 1;
//		while(sum < 500) {
//			sum +=i;
//			i++;
//		}
//		System.out.println(sum);
//		
		
//		14. 다음과 같이 출력하세요. (for문)
//		for(int i=1; i <=5 ; i++){
//			for(int j=1 ; j<=i; j++){
//				System.out.print(j);
//			}
//				System.out.println();
//		}
		
		
//		15. 두 개의 주사위을 던졌을 때, 눈의 합이 6이 되는 경우 수를 출력하는 프로그램을 작성하세요. 

//		for(int i = 1; i<=6; i++) {
//			for(int j = 1; j<=6; j++) {
//				if( i+j==6) {
//					System.out.println(i+"+"+j+"="+6);
//				}
//			}
//		}
//		16. 10부터 20까지의 합을 구하여 프로그램을 작성하시오.
//		(for문, while문, do-while문을 이용하여 3가지 프로그램 하시오.)
		
//		int sum = 0;
//		int i = 10;
//		for( i = 10; i <=20; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		sum = 0;
//		i = 10;
//		while(i<=20) {
//			
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
//		
//		sum = 0;
//		i = 10;
//		do {
//			sum += i;
//			i++;
//		}while(i<=20);
//		System.out.println(sum);
		
	}

}
