package chapter07;

public class QuizTripGS {
	private String country;
	private String area;
	private int money;
	private int flyingTime;
	
	
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public int getFlyingTime() {
		return flyingTime;
	}


	public void setFlyingTime(int flyingTime) {
		this.flyingTime = flyingTime;
	}

	

	@Override
	public String toString() {
		return "QuizTripGS [country=" + country + ", area=" + area + ", money=" + money + ", flyingTime=" + flyingTime
				+ "]";
	}


	public static void main(String[] args) {

		QuizTripGS tripGS1 = new QuizTripGS();
		tripGS1.setCountry("일본");
		tripGS1.setArea("오사카");
		tripGS1.setMoney(140);
		tripGS1.setFlyingTime(90);
		System.out.println(tripGS1.toString());
		QuizTripGS tripGS2 = new QuizTripGS();
		tripGS2.setCountry("대만");
		tripGS2.setArea("타이베이");
		tripGS2.setMoney(90);
		tripGS2.setFlyingTime(120);
		System.out.println(tripGS2.toString());
	}

}
