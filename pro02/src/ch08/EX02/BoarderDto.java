package ch08.EX02;

public class BoarderDto {
	
	private int num;
	private String name;
	private String subject;
	private String content;
	
	public BoarderDto() {}
	
	public BoarderDto(int num, String name, String subject, String content) {
		this.num = num;
		this.name = name;
		this.subject = subject;
		this.content = content;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BoarderDto [num=" + num + ", name=" + name + ", subject=" + subject + ", content=" + content + "]";
	}
	
	
	
	
}
