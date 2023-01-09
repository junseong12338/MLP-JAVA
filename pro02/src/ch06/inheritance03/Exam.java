package ch06.inheritance03;

public class Exam {

	public static void main(String[] args) {
		CaptionTV ct = new CaptionTV(true, 3, true);
		
		ct.channerUp();
		ct.dispaly("캡션을 보여줍니다.");
		
		CaptionTV cts = new CaptionTV(true, 10, false);
		cts.channerDown();
		cts.dispaly("캡션을 보여줍니다.");
	}

}
