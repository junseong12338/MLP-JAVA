package ch06.inheritance01;

public class Son extends Parents {
	
	// x,y,sub(), z,input
	
	// super 부모를 슈퍼라고 부름
	// 슈퍼 개추 왜냐 구분하기 위해서
	private int z;
	
	
	public void input(int x, int y,int z) {
		super.x = x;
		super.y = y;
		this.z = z;
	}
	
	public void disp() {
		
		System.out.println(this.x);
		System.out.println(super.y);
		System.out.println(z);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
