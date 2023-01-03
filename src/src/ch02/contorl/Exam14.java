package ch02.contorl;

/**
 * @Date : 2023. 1. 3.
 * @Author :이준성
 * @Description : 제어문 - 조건문 (중첩 if ~ else)
 * 
 */
public class Exam14 {

	public static void main(String[] args) {
		
		int score = 83;
		
		String grade = "";
		// A > = 90 / A+ 100 ~ 97, A0 96~94, A- 93~90 
		if(score >= 90) {
			
			if(score >= 97) {
				grade = "A+";
			}else if (score <=96 && score >=94) {
				grade = "A0";
			}else if (score <93) {
				grade = "A-";
			}
			
		}else if (score >= 80) {
			grade = "B";
		}else if (score >= 70) {
			grade = "C";
		}else if (score >= 60) {
			grade = "D";
		}else if (score < 60) {
			grade = "F";
		}else {
			System.out.println("잘못된 입력 입니다.");
		}
	
		System.out.println(grade);
	
	}


}
