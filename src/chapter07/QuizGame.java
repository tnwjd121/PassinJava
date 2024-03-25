package chapter07;

// 게임 고르기
public class QuizGame {
	
	private String gameName;
	private int price;
	private String console;
	
	public void setQuizGame(String n, int p, String c) {
		gameName = n;
		price = p;
		console = c;
	}
	
	public void getQuizGame() {
		System.out.println("게임명 : " + gameName);
		System.out.println("가격 : " + price);
		System.out.println("콘솔종류 : " + console);
	}

	public static void main(String[] args) {
		QuizGame game1 = new QuizGame();
		game1.setQuizGame("마리오디스커버리", 64800, "닌텐도스위치");
		game1.getQuizGame();
		QuizGame game2 = new QuizGame();
		game2.setQuizGame("호그와트레거시", 79800, "플레이스테이션4");
		game2.getQuizGame();

	}

}
