package chapter07;

//맛집 리스트 추가하기
public class QuizFood {
	
	private String restaurantName;
	private String category;
	private String address; 
	
	public void setfood(String r, String c, String a) {
		restaurantName = r;
		category = c;
		address = a;
	}
	
	public void getfood() {
		System.out.println("음식점명: " + restaurantName);
		System.out.println("음식분류: " + category);
		System.out.println("음식점주소: " + address);
	}

	public static void main(String[] args) {

		QuizFood food1 = new QuizFood();
		food1.setfood("초필살돼지구이", "한식", "부산 수영구 광안동");
		food1.getfood();
		QuizFood food2 = new QuizFood();
		food2.setfood("이재모피자 서면점", "양식", "부산 진구 전포동");
		food2.getfood();
		QuizFood food3 = new QuizFood();
		food3.setfood("부엉이식당", "한식", "부산 남구 용호동");
		food3.getfood();

	}

}
