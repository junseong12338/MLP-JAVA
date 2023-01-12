package api08.Queue;



public class Message {
	
	private String command;
	private String to;
	
	
	public Message() {};
	
	public Message(String command, String to) {
	
		this.command = command;
		this.to = to;
	}

	@Override
	public String toString() {
		return "Message [command=" + command + ", to=" + to + "]";
	}
	
	
	


}
