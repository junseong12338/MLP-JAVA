package api11.Exception;

public class Ex03 {
	public static void main(String[] args) {
		
		try {
			String num = args[0];
			String value = args[1];
			
			System.out.println(num + "\t"+ value);
			
			int inum = Integer.parseInt(num);
			int ivalue = Integer.parseInt(value);
			
			System.out.println(inum +ivalue);
		} catch (Exception e) {
			System.out.println("배열의 수를 잘못 입력하셨습니다.");
		}
		
	}
}
