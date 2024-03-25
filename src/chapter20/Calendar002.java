package chapter20;

import java.util.Calendar;

public class Calendar002 {
	public static void main(String[] args) {
		// 특정 날짜 설정하기
		// 2019년 4월 29일로 날짜를 설정한다
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		//month의 경우 0부터 시작하기 때문에 4월인 경우, 3로 지정해야 한다
//		date1.set(2019, 3, 29);
		date1.set(2019, Calendar.APRIL, 29);
		
		String[] DAY_OF_WEEK = {"일","월","화","수","목","금","토"};
		
		System.out.println("date1은 " + toString(date1)
				+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이다");
		
		// 두 날짜간의 차이를 얻으려면, getTimeMillis() 천분의 일초 단위로 변환해야 한다
		long diffrence = (date2.getTimeInMillis())
				-(date1.getTimeInMillis())/1000;
		//1초=1000밀리초
		System.out.println("date2-date1 " + diffrence+"초가 지났습니다.");
		//1일=24*60*60
		System.out.println("일(day)로 계산하면 " + diffrence/(24*60*60)+"일 입니다.");
		
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월"
				+date.get(Calendar.DATE)+"일 ";
	}

}
