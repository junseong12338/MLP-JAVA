package ch07.Abstruct01;

public class Exam {
	
	public static void main(String[] args) {
		SuperRobot s = new SuperRobot("SuperRobot");
		s.shape();
		s.actionWalk();
		s.actionRun();
		s.actionFly();
		s.actionMisail();
		s.actionKife();
		System.out.println();
		
		
		StandardRobot t = new StandardRobot("StandardRobot");
		t.shape();
		t.actionWalk();
		t.actionRun();
		t.actionFly();
		t.actionMisail();
		t.actionKife();
		System.out.println();
		
		
		LowRobot low = new LowRobot("LowRobot");
		low.shape();
		low.actionWalk();
		low.actionRun();
		low.actionFly();
		low.actionMisail();
		low.actionKife();
		System.out.println();
	}
	
}
