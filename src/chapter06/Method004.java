package chapter06;

public class Method004 {

	public static void main(String[] args) {
		// 값을 반환하는 메소드
		// return : 값의 반환을 명령
		// 리턴타입 : 반환 되는 값의 데이터 타입
		// boolean, int, double, String
		adder(); 
		System.out.println(adder());
		int n1 = adder();
		System.out.println(n1);
		System.out.println(adder2(15, 20));
		int result = adder2(1,1);
		System.out.println(result);
		
	}
	public static int adder3(int num1, int num2) {
		return num1 +  num2;
	}
	public static int adder2(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
//		return 3.14; //(x)
//		return "문자열"; //(x)
	}
	 public static double adder4(double num) {
		 String str = "문자열";
		 return num*num;
	 }
	public static int adder() {
		
		return 0;
	}
}
