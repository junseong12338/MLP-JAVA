package ch06.inheritance02;

public class BusinessMan extends Man {
	
	private String company;
	private String poiton;
	
	
	public BusinessMan(String name, String company,String poiton) {
		super.name = name;
		this.company = company;
		this.poiton = poiton;
	}
	
	public void info() {
		super.empName();
		this.empName();
		empName();
		
		
		System.out.println("회사이름 : " + company);
		System.out.println("직급 : " + poiton);
		
	}
	
	
}

