package chapter12;

public class Parent2 {
	protected int x=10;
	protected int y=30;
	
	public void  printY() {
		System.out.println("y="+y);
		System.out.println("this.y="+this.y);
//		System.out.println("super.y="+super.y);
	}
	
	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.method();
		child2.printY();
	}

}
