package api01.System;

import java.util.Date;

public class TimeEx extends Exception {
	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		System.out.println("현재시간을 초단위로 출력:" + time);
		
		long timeNano=System.nanoTime();
		System.out.println("현재시간을 나노초단위로:" + timeNano);
		
		Date date=new Date(time);
		System.out.println("현재시간:" + date);
		
		String osName=System.getProperty("os.name");
		String userName=System.getProperty("user.name");
		String userHome=System.getProperty("user.home");
		String javaVersion=System.getProperty("java.version");
		
		System.out.println("운영체제:" + osName);
		System.out.println("사용자 이름:" + userName);
		System.out.println("사용자 홈디렉토리:" + userHome);
		System.out.println("자바버전:" + javaVersion);
		
		// 4시 15분 시작입니다.
	}
}
