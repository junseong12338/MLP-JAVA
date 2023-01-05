package ch05.object;

public class Pay {

	public String name;
	public int salary;
	public int tex;
	public int wages;
	
	public void input(String n , int s) {
		name = n;
		salary = s;
	}
	
	public void annual_tax() {
		tex =(int) (salary*0.045 +0.5);
		wages = salary-tex;
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(salary);
	}

	
}
