package ch07.interface02;


public class Exam {

	public static void main(String[] args) {
	  Audio audio = new Audio();
	  audio.turnOn();
	  audio.setVolum(20);
	  audio.output();
	  audio.turnOff();
	 
	  System.out.println();
	  
	  Television tv = new Television();
	  tv.turnOn();
	  tv.setVolum(-1);
	  tv.disp();
	  tv.turnOff();
	  
	  System.out.println();
		
	}
}
