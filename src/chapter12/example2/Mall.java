package chapter12.example2;

public class Mall {
	
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		buyer.buy(new Tv());
		buyer.summary();
	}

}
