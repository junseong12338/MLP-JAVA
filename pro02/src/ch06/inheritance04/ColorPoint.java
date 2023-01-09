package ch06.inheritance04;

public class ColorPoint extends Point{
	private String color;
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
	public ColorPoint(int x ,int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public ColorPoint() {
		super(77,88);
		this.color = "green";
	}
	
	public ColorPoint(int x, String color) {
		super(x);
		this.color = color;
	}

}
