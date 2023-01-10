package ch07.interface02;


public class Audio implements RemoteControl{
	private int volum;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolum(int volum) {
		if(volum > MAX_VOLUME) {
			volum = MAX_VOLUME;
		}else if(volum < MIN_VOLUME) {
			volum = MIN_VOLUME;
		}
		
		this.volum = volum;
	}
	
	public void output() {
		System.out.println(volum);
	}


}
