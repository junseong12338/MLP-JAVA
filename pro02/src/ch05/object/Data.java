package ch05.object;

public class Data {

	
	private int x; 
	private int y;
	
	public void input(int x, int y) {
		this.x = x;
		this.y = y; 
		
	}
	public void output() {
		System.out.println(this.x + "\t" + this.y);
	}
	
}
