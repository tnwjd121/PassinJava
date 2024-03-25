package chapter12.example1;

public class Buyer {
	
	private int money = 1000;
	private int bounsPoint;
	
	Product[] cart = new Product[100];
	private int cnt = 0;
	
	public void buy(Product p) {
		if(money < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.getPrice();
		bounsPoint += p.getBonusPoint();
		cart[cnt++] = p;
		System.out.println(p.toString()+"을/를 구입하셨습니다.");
	}
	public void summary() {
		int sum = 0;
		String itemList = "";
		if(cnt==0) {
			System.out.println("구입한 물건이 없습니다.");
		}else {
			for(int i=0; i<cnt;i++) {
				sum+= cart[i].getPrice();
				itemList += cart[i].toString()+",";
			}
			System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
			System.out.println("구입하신 제품은 " + itemList + "입니다.");
		}
	}

}
