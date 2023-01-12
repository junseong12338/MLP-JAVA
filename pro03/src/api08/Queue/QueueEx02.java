package api08.Queue;

import java.util.LinkedList;

public class QueueEx02 {
	
	public static void main(String[] args) {
		
		LinkedList<Message> message = new LinkedList<>();
		
		message.offer(new Message("sendMail","홍길동"));
		message.offer(new Message("sendSMS","김자바"));
		Message kakao = new Message("sendKakaotalk","이오라클");
		message.offer(kakao);
		
		while(!message.isEmpty()) {
			Message msg = message.poll();
			System.out.println(msg.toString());
		}
	}

}
