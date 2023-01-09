package ch06.inheritance04;

public class Main { // protected super/ super()/ Overriding(함수 재정의)

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
		System.out.println();
		
		
		ColorPoint c = new ColorPoint(10, "red");
		c.showColorPoint();
		System.out.println();
		
		
		ColorPoint d = new ColorPoint();
		d.showColorPoint();
		
		Point p = new Point(999);
		p.showPoint();
		
	}

}
