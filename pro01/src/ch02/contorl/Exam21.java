package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 반복문 (do ~ while)
 * 
 */
public class Exam21 {

	public static void main(String[] args) {
		
		
		
		int count = 1;
		do {
			System.out.println(count);
			count++;
		}while(count <=10);
		
		System.out.println();
		int dsum = 0;
		int j = 1;
		do {
			dsum +=j;
			j++;
			
		}while(j <=10);
		System.out.println(dsum);
		
	}
}

