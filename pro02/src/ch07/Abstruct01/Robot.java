package ch07.Abstruct01;

public  abstract class Robot { // 추상클래스 자기자신 객체 발생 불가
protected String kind;
	
	public void shape() {
		System.out.println(kind +"는 팔, 다리, 몸통, 머리가 있습니다.");
	}
	
	
	public void actionWalk() {
		System.out.println("걸을 수 있습니다.");
	}
	
	public void actionRun() {
		System.out.println("달릴 수 있습니다.");
	}
	
	public abstract void actionFly();
	
	public abstract void actionKife();
	
	public abstract void actionMisail();
	
}
