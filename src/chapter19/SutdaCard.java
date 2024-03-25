package chapter19;

public class SutdaCard {
	
	int num;
	boolean  isKwang;
	
	SutdaCard() {
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		boolean result1 = this.num == num;
		boolean result2 = this.isKwang == isKwang;
		
		if(result1==true&& result2 ==true) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
	
	

}
