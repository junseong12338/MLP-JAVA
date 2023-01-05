package ch05.object;

public class Exam44 {

	public static void main(String[] args) {
		
		Grade ljs = new Grade();
		ljs.input("이준성",70,60,55);
		ljs.total();
		ljs.avgerage();
		ljs.disp();
		
		
		
		
// 		객체를 통한 데이터 전달 
//		.(점) ljs .name = "이준성"
// 		멤버함수 input("이준성"..) --> 이런 데이터 전달 형태가 훨씬 많음
	}

}
