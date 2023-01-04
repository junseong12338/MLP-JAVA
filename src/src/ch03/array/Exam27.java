package ch03.array;

/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 배열 동일한 자료형 모음 index값을 갖는다.
 * 				   
 * 
 */
public class Exam27 {

	public static void main(String[] args) {
		
		int[] arry = new int[] {1,2,3,4,5};
		
		for(int i=0; i<arry.length; i++) {
			System.out.print(arry[i]+" ");
		}
		System.out.println();
		
		char arr[] = new char[] {'A','%','가','B'}; // char 2byte *4 8byte
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		String[] str = new String[] {"이준성","가준성","나준성"};
		
		for(int i =0; i<str.length; i++) {
			System.out.print(str[i]+" ");
		}
		
		System.out.println();
	}
	
}


