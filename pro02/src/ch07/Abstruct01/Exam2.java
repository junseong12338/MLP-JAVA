package ch07.Abstruct01;

public class Exam2 {
	
	public static void main(String[] args) {
		
		// Collection으로 바뀐다.
		Robot[] robotArray = new Robot[3];
		robotArray[0] = new SuperRobot("SuperRobot");
		robotArray[1] = new StandardRobot("StandardRobot");
		robotArray[2] = new LowRobot("LowRobot");
		
		for(int i=0; i<robotArray.length;i++) {
			robotArray[i].shape();
			robotArray[i].actionWalk();
			robotArray[i].actionRun();
			robotArray[i].actionFly();
			robotArray[i].actionMisail();
			robotArray[i].actionKife();
			System.out.println();
		}
	}
	
}
