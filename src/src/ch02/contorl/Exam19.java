package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 제어문 - 중첩 switch ~ case
 * 
 */
public class Exam19 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=3;i++){
			for(int j=1;j<=5;j++){
				System.out.println(i + "\t" + j);
			}
			System.out.println();
		}
		
		System.out.println();	
		
		for(char i='A';i<='Z';i++){		
			for(char j=i;j<='Z';j++){  
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
}
