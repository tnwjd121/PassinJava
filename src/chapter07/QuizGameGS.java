package chapter07;

public class QuizGameGS {
	
	private String gameName;
	private int price;
	private String console;
	
	

	public String getGameName() {
		return gameName;
	}



	public void setGameName(String gameName) {
		this.gameName = gameName;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getConsole() {
		return console;
	}



	public void setConsole(String console) {
		this.console = console;
	}



	@Override
	public String toString() {
		return "QuizGameGS [gameName=" + gameName + ", price=" + price + ", console=" + console + ", getGameName()="
				+ getGameName() + ", getPrice()=" + getPrice() + ", getConsole()=" + getConsole() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	public static void main(String[] args) {
		QuizGameGS game1 = new QuizGameGS();
		game1.setGameName("마리오디스커버리");
		game1.setPrice(64800);
		game1.setConsole("닌텐도스위치");
		System.out.println(game1.toString());
		QuizGameGS game2 = new QuizGameGS();
		game2.setGameName("호그와트레거시");
		game2.setPrice(79800);
		game2.setConsole("플레이스테이션4");
		System.out.println(game2.toString());

	}

}
