package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description :  제어문 - 조건문 (다중 if ~ else)
 * 
 */
public class Exam12 {

	public static void main(String[] args) {
		
		String name = "LJS";
		int kor = 70;
		int eng = 80;
		int mat = 90;
		
		int total = kor + eng + mat;
		float avg = (float) total/3;
		
		String score ="";
		if(avg >=90) {
			score ="수 입니다.";
		}else if(avg >=80) {
			score ="우 입니다.";
		}else if(avg >=70) {
			score ="미 입니다.";
		}else if(avg >=60) {
			score ="양 입니다.";
		}else if(avg <60) {
			score ="가 입니다.";
		}
		
		System.out.println(name);
		System.out.println(avg + "\t" + score);
		
		
		
	}

}
