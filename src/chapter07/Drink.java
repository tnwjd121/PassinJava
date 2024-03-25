package chapter07;

// 음료수 자판기 프로그램
// 어떤 음료수를 판매 할 건지 음료수 세부 사항
public class Drink {
	
	private String name;
	private double capacity;
	private int price;
	
	public void setDrink(String n, double c, int p) {
		name = n;
		capacity = c;
		price = p;
		
	}
	
	public void getDrink() {
		System.out.println(name);
		System.out.println(capacity + "ml");
		System.out.println(price);
	}

	public static void main(String[] args) {
		Drink drink1 = new Drink();
		drink1.setDrink("오로나민C", 120, 1200 );
		drink1.getDrink();
		Drink drink2 = new Drink();
		drink2.setDrink("데미소다", 250, 1400);
		drink2.getDrink();

	}

}
