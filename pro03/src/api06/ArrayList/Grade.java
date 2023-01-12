package api06.ArrayList;

public class Grade {

	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private float avg;
	
	
	public Grade(int num, String name, int kor, int eng, int mat) {
	
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}
	
	
	public void total() {
		sum = kor+eng+mat;
	}
	public void average() {
		avg = (float)sum/3;
	}


	@Override
	public String toString() {
		return "Grade [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", sum="
				+ sum + ", avg=" + avg + "]";
	}
	
	
	
	
	
}
