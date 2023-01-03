package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 반복문 while
 * 
 */
public class Exam20 {

	public static void main(String[] args) {
		
		
		int x = 1;
		while (x<=10) {
			System.out.println(x);
			x++;
		}
		
		int sum = 0;
		int cnt = 1;
		while(cnt <=10) {
			sum +=cnt;
			cnt++;
		}
		System.out.println(sum);
		
	}
}
