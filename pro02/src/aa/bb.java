package aa;

public class bb {
	public static void main(String[] args) {
		AA aa = new AA();
		
		//System.out.println(aa.x); // 동일 패키지 안에서 못쓰는거 private
		System.out.println(aa.y); // 동일 패키지 안에서  사용 가능
		System.out.println(aa.z);
		System.out.println(aa.num);
	}

}
