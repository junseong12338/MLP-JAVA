package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 제어문 반복문 (break, continue)
 * 
 */
public class Exam24 {

	public static void main(String[] args) {
		// 맛있는 예제 continue의 흐름을 이해해보자
		int x=1;
		while(x<10){
			if(x==5) break;
			System.out.println("x:" + x);
			x++;
		}
		System.out.println();
		
		int y=0;
		do{
			y++;
			if(y==5) continue;			
			System.out.println("y:" + y);
		}while(y<10);
			
	}
	
}


