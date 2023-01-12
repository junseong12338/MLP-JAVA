package api08.Queue;

import java.util.LinkedList;

public class QueueEx01 {
	// Queue인터페이스 
	// 그래서 Queue랑 동일한 LinkedList를 사용
	// 내부적으로 내용은 똑같음
	public static void main(String[] args) {
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
	
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll() +"\t"+queue.size());
		}
		
	}

}
