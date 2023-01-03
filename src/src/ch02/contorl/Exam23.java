package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 제어문 반복문 (break, continue)
 * 
 */
public class Exam23 {

	public static void main(String[] args) {
		
		int count = 10;		
		for(int i=1; i<=10; i++) {
			
			// 가장 가까운 블럭 밖으로 빠져나간다 - 종료  if문 제외 
			if(i==5) {
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println();
		// 가장 가까운 블럭 밖으로 빠져나간다 (if문 제외)
		for(int i=1; i<=10; i++) {
			
			// 가장 가까운 블럭 밖으로 빠져나간다 - 스킵 if문 제외
			if(i==5) {
				continue;
			}
			
			System.out.println(i);
		}
	}
}

