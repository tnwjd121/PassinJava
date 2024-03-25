package chapter07;

public class QuizFoodCons {
	
	private String restaurantName;
	private String category;
	private String address; 
	
	

	public QuizFoodCons(String restaurantName, String category, String address) {
		super();
		this.restaurantName = restaurantName;
		this.category = category;
		this.address = address;
	}


	@Override
	public String toString() {
		return "QuizFoodCons [restaurantName=" + restaurantName + ", category=" + category + ", address=" + address
				+ "]";
	}



	public static void main(String[] args) {
		QuizFoodCons foodCons1 = new QuizFoodCons("초필살돼지구이", "한식","부산 수영구 광안동");
		System.out.println(foodCons1.toString());
		QuizFoodCons foodCons2 = new QuizFoodCons("이재모피자 서면점", "양식", "부산 진구 전포동");
		System.out.println(foodCons2.toString());
		QuizFoodCons foodCons3 = new QuizFoodCons("부엉이식당", "한식", "부산 남구 용호동");
		System.out.println(foodCons3.toString());
	}

}
