package api03.Warper;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class WarpperEx01 {
	public static void main(String[] args) {
		
		
		int a = 10;
		Integer b = new Integer(20);
		Integer c = 20;
		
		String d = new String("apple");
		String e = "apple";
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int bytenum = Integer.BYTES;
		int size = Integer.SIZE;
		System.out.println(max);
		System.out.println(min);
		System.out.println(bytenum);
		System.out.println(size);
		
		int num = 10;
		String binary = Integer.toBinaryString(num);
		String octal = Integer.toOctalString(num);
		String hex = Integer.toHexString(num); // 10 ~ A
		
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hex);
		
		// 문자를 각각 자료 변환 가능
		System.out.println();
		String str = "10";
		int value1 = Integer.parseInt(str);
		int value2 = Integer.valueOf(str);
		System.out.println(value1);
		System.out.println(value2);
		
		// 정수형 문자열 변환
		String value5 = String.valueOf(10);
		System.out.println("문자열 "+value5);
		
		
	}

}
