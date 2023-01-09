package ch06.inheritance03;

public class CaptionTV extends TV {
	private boolean caption;

	public CaptionTV(boolean power,int channel, boolean caption) {
		super.power = power;
		super.channel= channel;
		this.caption = caption;
	}
	
	
	public void dispaly(String text) {
		if(power && caption) {
			System.out.println(channel + "\n" + text);
		}else {
			System.out.println("캡션하실려면 파워나 캡션을 켜세요");
		}
	}
	

}
