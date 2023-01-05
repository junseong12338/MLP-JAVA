package ch05.object;

public class Grade {

	public String name;
	public int kor;
	public int eng;
	public int mat;
	
	public int tot;
	public float avg;
	
	public void total() {
		tot= kor + eng + mat;
	}
	
	
	public void avgerage() {
		avg = (float) tot/3;
	}
	
	public void disp() {
		System.out.println(name +"\t" +tot+"\t"+avg);
	}
	
	public void input(String n , int k,int e,int m) {
	    name = n;
		kor = k;
		eng = e;
		mat = m;
	}
	
}
