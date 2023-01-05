package ch05.object;

public class Exam46 {

	public static void main(String[] args) {
		Human lee = new Human();
// 		private : 데이터는 외부접근 ㄴㄴ
// 		캡슐화 은닉화
// 		외부에서 데이터를 접근할때 마음대로 수정 접근 불가능 하는걸 은닉화 라고함
		
		
//		lee.name = "이준성";
//		lee.address = "인천시";
//		lee.ph = "010-1234-1234";
//		lee.rsnum ="123456-1234567";
//		lee.age = 27;
		
		
		Human kim = new Human();
		
		kim.setData("김", "서울", "010-4567-4567", "132465-132456789", 19);
		
		kim.disp();
		
	}

}
