package chapter19;

public class Exercise9_5 {
	
	public static String delChar(String src, String delCh) {
		
		for(int i=0; i<delCh.length();i++) {
			src.indexOf(delCh.charAt(i));

		}
		
		return "";
	}
	
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+ " -> "
				+delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)"+ " -> "
				+delChar("(1 2 3 4\t5)", " \t"));
	}

}
