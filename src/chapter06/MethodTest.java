package chapter06;

public class MethodTest {

	public static void main(String[] args) {
		System.out.println(result1(5, 7));
		System.out.println(result2(12, 8));
		System.out.println(result3(3, 4));
		System.out.println(result4(10, 5));
		System.out.println(result5(10, 5));
		System.out.println(squarePremeter(12, 20));
		System.out.println(squareArea(10, 20));
		System.out.println(triangleArea(15, 9));
		System.out.println(sircleArea(5));
		System.out.println(squareArea2(10));

	}
	// 두 수를 입력 받아 더한 값을 리턴 해주는 함수 만들기
		public static int result1(int n1, int n2) {
			System.out.println();
			return n1 + n2;
		}
	// 두 수를 입력 받아 뺀 값을 리턴 해주는 함수 만들기
		public static int result2 (int n1, int n2) {
			return n1 - n2;
		}
		// 두 수를 입력 받아 곱한 값을 리턴 해주는 함수 만들기
		public static int result3 (int n1, int n2) {
			return n1 * n2;
		}
		// 두 수를 입력 받아 나눈 값을 리턴 해주는 함수 만들기
		public static int result4 (int n1, int n2) {
			return n1 / n2;
		}
		// 두 수를 입력 받아 나머지 값을 리턴 해주는 함수 만들기
		public static int result5 (int n1, int n2) {
			return n1 % n2;
		}
		
		// 직사각형의 두변을 입력 받아 둘레는 리턴 해주는 함수
		public static int squarePremeter (int weight, int height) {
			return weight*2+height*2;			
		}
		// 직사각형의 두변을 입력 받아 넓이를 리턴 해주는 함수
		public static int squareArea (int weight, int height) {
			return weight*height;			
		}
		// 삼각형의 가로와 높이를 입력 받아 넓이를 리턴 해주는 함수
		public static int triangleArea (int weight, int height) {
			return (weight*height)/2;
		}
		// 원의 반지름을 입력 받아 넓이는 리턴 해주는 함수
		public static double sircleArea (int n1) {
			return n1*2*3.14;
		}
		// 정사각형의 한변을 입력 받아 넓이는 리턴 해주는 함수
		public static int squareArea2 (int n1) {
			return n1*4;
		}
}
