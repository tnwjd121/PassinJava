package chapter11;

public class Exercise6_4 {
	
	// 두점 (x, y)와 (x1, y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		double result1 = (x - x1)* (x - x1);
		double result2 = (y - y1)* (y - y1);
		
		double result3 = Math.sqrt(result1 + result2);
		return result3;
	}

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}

}
