package chapter07;

public class QuizTripCons {
	
	private String country;
	private String area;
	private int money;
	private int flyingTime;

	
	public QuizTripCons(String country, String area, int money, int flyingTime) {
		super();
		this.country = country;
		this.area = area;
		this.money = money;
		this.flyingTime = flyingTime;
	}


	@Override
	public String toString() {
		return "QuizTripCons [country=" + country + ", area=" + area + ", money=" + money + ", flyingTime=" + flyingTime
				+ "]";
	}


	public static void main(String[] args) {
		QuizTripCons tripCons1 = new QuizTripCons("일본", "오사카", 140, 90);
		System.out.println(tripCons1.toString());
		QuizTripCons tripCons2 = new QuizTripCons("대만", "타이베이", 90, 120);
		System.out.println(tripCons2.toString());
	}

}
