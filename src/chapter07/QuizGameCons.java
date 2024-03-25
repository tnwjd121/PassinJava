package chapter07;

public class QuizGameCons {
	
	private String gameName;
	private int price;
	private String console;
	
	public QuizGameCons(String gameName, int price, String console) {
		super();
		this.gameName = gameName;
		this.price = price;
		this.console = console;
	}

	@Override
	public String toString() {
		return "QuizGameCons [gameName=" + gameName + ", price=" + price + ", console=" + console + "]";
	}



	public static void main(String[] args) {
		QuizGameCons gameCons1 = new QuizGameCons("마리오디스커버리", 64800, "닌텐도스위치");
		System.out.println(gameCons1.toString());
		QuizGameCons gameCons2 = new QuizGameCons("호그와트레거시", 79800, "플레이스테이션4");
		System.out.println(gameCons2.toString());
		
	}

}
