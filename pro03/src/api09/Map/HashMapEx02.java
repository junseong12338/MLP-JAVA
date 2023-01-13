package api09.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("id","abcd");
		map.put("pwd",1234);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디");
			String id = sc.next();
			
			System.out.println("비밀 번호 ");
			int pwd = sc.nextInt();
			
			String mapid = (String) map.get("id");
			int mappwd = (Integer) map.get("pwd");
			
			if(mapid.equals(id)) {
				if(mappwd == pwd) {
					System.out.println("로그인 성공");
					sc.close();
					break;
				}else {
					System.out.println("비밀번호 확인");
				}
			}else {
				System.out.println("아이디 확인");
			}
		}
		
	}

}
