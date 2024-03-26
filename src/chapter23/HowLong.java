package chapter23;

// 매개변수가 있고 반환하는 람다식2
public interface HowLong {
	int len(String s);
	
	public static void main(String[] args) {
		HowLong h1 = s-> s.length(); // return s.length()
		System.out.println(h1.len("I am so happy"));
		
	}

}
