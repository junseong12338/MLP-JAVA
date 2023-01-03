package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 제어문 - 중첩 (for)
 * 
 */
public class Exam18 {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++){
			if(i%2==0)
				System.out.println("i=" + i);
		}
		System.out.println();
		
		int sum=0;
		for(int i=1;i<=10;i++){
			sum=sum+i; 		
		}
		System.out.println("sum:" + sum);
		
		sum=0;
		for(int i=100;i<=200;i++){
			if(i>150 && i <200)
				sum+=i;		
		}
		System.out.println("sum:" + sum);
		
		
	}
}
