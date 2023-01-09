package ch05.object;

 /**
 * @Date : 2023. 1. 6.
 * @Author :이준성
 * @Description : 변수
 * 	 static 변수 
 * 	  해당변수에 접근시 클래스 명으로 접근해야한다.
 *   프로그램이 시작되고 끝날때까지 남아있기때문에 누적 가능하다.
 *   남용하면 시간이 매우 느려짐 
 *   
 *   
 *   
 */
public class Exam52_1 {

	public static void main(String[] args) {
			
		
		Sum a= new Sum();
		a.setSum(100);
		a.setData(10);
		a.val();
		a.disp();
		
		Sum b= new Sum();
		b.setData(20);
		b.val();
		b.disp();

		
		Sum c= new Sum();
		c.setData(30);
		c.val();
		c.disp();
		
	
		
	}

}
