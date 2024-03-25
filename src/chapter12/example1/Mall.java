package chapter12.example1;

public class Mall {
	
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		buyer.summary();
	}

}
