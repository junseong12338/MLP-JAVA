package api05.Date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// 현재 시스템 날짜 가져오기
		
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"");
		System.out.println(month+"");
		System.out.println(day+"");
		
		
		
	}

}
