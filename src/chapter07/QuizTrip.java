package chapter07;

// 3박 4일 여행 리스트
public class QuizTrip {
	
	private String country;
	private String area;
	private int money;
	private int flyingTime;
	
	public void setTrip (String c, String a, int m, int t) {
		country = c;
		area = a;
		money = m;
		flyingTime = t;
	}
	public void getTrip () {
		System.out.println("나라명: " + country);
		System.out.println("지역명: " + area);
		System.out.println("여행경비: " + money +"만원");
		System.out.println("비행시간: " + flyingTime + "분");
	}

	public static void main(String[] args) {
		QuizTrip trip1 = new QuizTrip();
		trip1.setTrip("일본", "오사카", 140, 90);
		trip1.getTrip();
		QuizTrip trip2 = new QuizTrip();
		trip2.setTrip("대만", "타이베이", 90, 120);
		trip2.getTrip();
	}

}
