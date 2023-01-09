package ch05.object;

public class Test {
	
	private int x; 
	private int y;
	
	
	
	public Test(int x, int y) {
		this.x = x;
		this.y = y;	
		System.out.println(this.x + "\t"+this.y);
	}
	
	
	public Test() {
	
	}
	
	public void disp() {
		
		//this
		System.out.println(this.x + "\t"+this.y);
		
		
	}
}
