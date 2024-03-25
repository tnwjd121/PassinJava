package chapter19;

public class Exercise9_4 {
	
	public static boolean contains(String src, String target) {
		
		if(src.indexOf(target)!= -1) {
			return true;
		}
		
		return false;
	
	
	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
		
	}

}
