package ch08.EX02;

public class BoarderDao { // 외부 -> Dto -> Dao -> DB
	
	public BoarderDao (BoarderDto boarderDto) {
		this.boarderDto= boarderDto;
	}
	
	private BoarderDto boarderDto;
	
	

	public void insert() {
		System.out.println(boarderDto.toString());
	}
	
	
	public BoarderDto select(int num) {
		// 글번호 ~~ 해당 데이터 가져오기 (작성자, 제목, 글내용)
		
		return boarderDto;
	}
	
}
