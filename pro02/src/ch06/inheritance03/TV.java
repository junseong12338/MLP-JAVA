package ch06.inheritance03;

public class TV {
	
	protected boolean power; //전원 상태
	protected int channel; // 채널
	
	public void power(boolean power) {
		this.power = power;
	}
	
	public void channerUp() {
		++channel;
	}
	
	public void channerDown() {
		--channel;
	}
}
