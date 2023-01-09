package ch05.object;

public class Sum {
	
	private  static int sum;
	private int num;
	
	public void setSum(int sum) {
		Sum.sum = sum;
	}
	
	public void setData(int num) {
		this.num = num;
	}

	public void val() {
		sum = sum + num;
	}
	
	public void disp() {
		System.out.println(sum);
	}
}

