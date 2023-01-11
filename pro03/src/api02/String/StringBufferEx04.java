package api02.String;

public class StringBufferEx04 {
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("** Java"); // 7 + 16 = 23
		System.out.println(str);
		
		str.insert(3, "Good");
		System.out.println("문자열 삽입 "+str);
		
		str.setCharAt(1, '#');
		System.out.println("문자 치환 "+str);
		
		str.replace(3, 7, "Love");
		System.out.println("문자열 치환 "+str);
		
		str.delete(7, 11);
		System.out.println("문자열 삭제 "+str);
		
		str.deleteCharAt(1);
		System.out.println("문자 삭제 "+str);
		
		str.reverse();
		System.out.println("역순 출력 "+str);
		
	}
}
