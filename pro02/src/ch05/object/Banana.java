package ch05.object;

 /**
 * @Date : 2023. 1. 6.
 * @Author :이준성
 * @Description : 생성자
 * 				    - 접근 제한자 private public
 * 					- this/ this.x this.hap()
 * 					- 생성자 (생성자 중복)
 */
public class Banana {
	
	private int x;
	private int y;
	private float z;
	
	
	public Banana() {
		
		x = 0;
		y = 0;
		z = 0.f;
	}
	
	public Banana(int x) {
		this.x = x;
		y= 20;
		z= 30.0f;

	}
	public Banana(int x, int y) {
		this.x = x;
		this.y= 20;
		z= 30.0f;

	}
	
	public Banana(int x, int y, float z) {
		this.x = x;
		this.y= 20;
		this.z= 30.0f;

	}
	
	


}

