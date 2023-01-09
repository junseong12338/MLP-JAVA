package ch06.inheritance06;

public class Parents{
	
	protected int x;
	protected int y;
	
	
	public Parents() {
		this.x =0;
		this.y =0;
	}
	public Parents(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	public void cal() {
		System.out.println("sum : "+(x+y));
	}
}
