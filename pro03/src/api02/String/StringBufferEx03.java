package api02.String;

public class StringBufferEx03 {
	public static void main(String[] args) {
		String s1 ="차별없는";
		String s2 ="대한민국";
		String s3 =s1;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("s1 hash code" + s1.hashCode());
		System.out.println("s2 hash code" + s2.hashCode());
		System.out.println("s3 hash code" + s3.hashCode());
		
		
		s1 += s2;
		System.out.println("s1 hash code" + s1.hashCode());
		String s4 ="배고파요";
		s3 +=s4;
		System.out.println(s3);
		System.out.println("s3 hash code" + s3.hashCode());
		
		System.out.println();System.out.println();
		
		StringBuffer sb1 =new StringBuffer("우리나라");
		StringBuffer sb2 =new StringBuffer("대한민국");
		System.out.println("sb1 hash code" + sb1.hashCode());
		System.out.println("sb2 hash code" + sb2.hashCode());
		
		sb1.append(sb2);
		sb1.append("좋은나라");
		System.out.println(sb1);
		System.out.println("sb1 hash code" + sb1.hashCode());
		System.out.println();
		
		StringBuffer sb3 =new StringBuffer("apple");
		System.out.println("문자열 길이 "+sb3.length());
		System.out.println("문자열 용량 " +sb3.capacity()); // 5+16 (byte)
		
		String a = "apple"; // 5 X001
		// 버퍼쓰면 원본 데이터 영향 받음 쓸때 조심해야함
		
	}
}
