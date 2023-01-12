package api06.ArrayList;

public class DataEx03 {
	
	private int x;
	private int y;
	private int z;
	public DataEx03() {
		
	}
	
	public DataEx03(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void sum () {
		z= x+y;
	}
	public void disp() {
		System.out.println(x+"\t"+y+"\t"+z);
	}

	@Override
	public String toString() {
		return "DataEx03 [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
}
