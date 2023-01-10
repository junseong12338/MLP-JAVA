package ch08.EX01;

public class Apple {
	private int num;
	private int value;
	
	public void setData(int num,int value) {
		this.num = num;
		this.value = value;
	}
	
	public int getData() {
		return num+value;
	}
}
