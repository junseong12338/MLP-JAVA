package ch08.EX02;

/**
 * @Date : 2023. 1. 10.
 * @Author :이준성
 * @Description : 객체 활용 멤버 변수 (필드,object), 매개변수(object) 지역변수(object)
 * 
 */
public class Exam {

	public static void main(String[] args) {
		
		
		// view
		BoarderDto dto = new BoarderDto();
		dto.setNum(1);
		dto.setName("LJS");
		dto.setSubject("화요일 입니다.");
		dto.setContent("계속~");
		
		BoarderDao dao = new BoarderDao(dto);
		dao.insert();
		
		
	}
	
}
