package api04.Math;

import java.util.Arrays;

public class RandomEx {

	public static void main(String[] args) {
		
		System.out.println("11 절대값 : "+ Math.abs(-11));
		System.out.println("최대값 : "+ Math.max(10,30));
		System.out.println("절소값 : "+ Math.min(1.5,1.3));
		System.out.println("2의3승 : "+ (int)Math.pow(2,3));
		
		// 랜덤 출력 0~1사이의 랜덤한 값 출력 
		// double 형태 반환
		System.out.println(Math.random());
		
		
		int num = (int)(Math.random() *10);
		System.out.println("0~9 : "+num);
		
		int dice = (int)(Math.random() *6)+1;
		System.out.println("1~6 : "+dice);
		
		// 1~45, 6
		int[] lotter = new int [6];
		
		for(int i = 0 ; i<lotter.length;i++) {
			lotter[i] = (int)(Math.random() *45)+1;
		}
		
		Arrays.sort(lotter);
		System.out.println(Arrays.toString(lotter));
	}

}
