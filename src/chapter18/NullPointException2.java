package chapter18;

public class NullPointException2 {
	private NullPointException npe;
	
	public NullPointException getNpe() {
		return npe;
	}

	public void setNpe(NullPointException npe) {
		this.npe = npe;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		NullPointException2 npe2=new NullPointException2();
		npe2.sayHello();
		npe2.getNpe().toString();
	}
}













