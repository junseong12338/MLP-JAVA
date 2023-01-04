package ch03.array;



/**
 * @Date : 2023. 1. 4.
 * @Author :이준성
 * @Description : 다차원 배열(2차원,3차원....)
 * 				   
 * 
 */
public class Exam30 {

	public static void main(String[] args) {
		
			int[][] array = new int[][] {{1,2,3},
										 {55,66,77}};
										
			for(int i=0; i<2; i++) {
				for(int j =0; j<3;j++){
					System.out.print(array[i][j]+" ");
				}System.out.println();
			}
			System.out.println();
			System.out.println("배열의 행수 : " + array.length);
			System.out.println("배열의 0행의 열수 : " + array[0].length);
			System.out.println("배열의 1행의 열수 : " + array[1].length);
			
		
	}
}