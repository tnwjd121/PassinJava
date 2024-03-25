package chapter20;

import java.util.Calendar;
import java.util.Scanner;


public class Quiz_calendar {
	
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2020, 01, 12);
		System.out.println(cal1.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal1.get(Calendar.DAY_OF_WEEK));
		System.out.println(toString(cal1));
		
		Calendar cal2 = Calendar.getInstance();
		cal1.set(2017, 05, 11);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 yyyy/MM/dd 형태로 입력해주세요.(입력예: 2017/05/11");
		String date1 = sc.next();
		for(int i=0; i<date1.length(); i++) {
			
		}
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH))+"월"
				+date.get(Calendar.DATE)+"일 ";
	}

}
