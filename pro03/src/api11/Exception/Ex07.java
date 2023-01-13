package api11.Exception;

public class Ex07 {
	public static void main(String[] args) {
		try {
			String num = args[0];
			String value = args[1];
			
			System.out.println(num + "\t"+ value);
			
			int inum = Integer.parseInt(num);
			int ivalue = Integer.parseInt(value);
			
			System.out.println(inum +ivalue);
		} catch (Exception e) {
			System.out.println("에러발생");
		}
	}
}
