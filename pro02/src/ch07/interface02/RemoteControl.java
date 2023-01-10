package ch07.interface02;

public interface RemoteControl { 
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolum(int volum);
}
