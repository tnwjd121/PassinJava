package chapter07;

public class QuizFoodGS {

	private String restaurantName;
	private String category;
	private String address; 
	
	  
	public String getRestaurantName() {
		return restaurantName;
	}


	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "QuizFoodGS [restaurantName=" + restaurantName + ", category=" + category + ", address=" + address + "]";
	}


	public static void main(String[] args) {

		QuizFoodGS foodGS1 = new QuizFoodGS();
		foodGS1.setRestaurantName("초필살돼지구이");
		foodGS1.setCategory("한식");
		foodGS1.setAddress("부산 수영구 광안동");
		System.out.println(foodGS1.toString());
		QuizFoodGS foodGS2 = new QuizFoodGS();
		foodGS2.setRestaurantName("이재모피자 서면점");
		foodGS2.setCategory("양식");
		foodGS2.setAddress("부산 진구 전포동");
		System.out.println(foodGS2.toString());
		QuizFoodGS foodGS3 = new QuizFoodGS();
		foodGS3.setRestaurantName("부엉이식당");
		foodGS3.setCategory("한식");
		foodGS3.setAddress("부산 남구 용호동");
		System.out.println(foodGS3.toString());
		
	}

}
