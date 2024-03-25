package chapter02;

public class UseVariable3 {
	public static void main(String[] args) {
		//정사각형의 둘레를 구하는 코드 작성
		//한변 * 4
		//한변의 길이는 마음데로 정하세요
		//한변의 길이가 7
		
		System.out.println(7*4); //80점
		int squareSide=7;
		System.out.println(squareSide*4); //100점
		
		//모든 문제의 변의 수치는 스스로 정하세요.
		//1. 직사격형의 넓이를 구하는 코드 작성
		int squareSideA = 7;
		int squareSideB = 8;
		System.out.println(squareSideA*squareSideB);
		
		//2. 직사각형의 둘레를 구하는 코드 작성
		int squareSideC = 4;
		int squareSideD = 9;
		System.out.println((squareSideC*2)+(squareSideD*2));
		//3. 반지름을 이용하여 원의 둘레를 구하는 코드 작성
		int circleRadius = 5;
		double pie = 3.14;
		System.out.println(2*circleRadius*pie);
				
		//4.삼각형의 넓이를 구하는 코드 작성
		int triangleWidth= 4;
		int trinagleHeight= 5;
		System.out.println((trinagleHeight*triangleWidth)/2);
		
		//5.삼각형의 길이를 구하는 코드 작성
		int triangleSideA = 6;
		int triangleSideB = 4;
		int triangleSideC = 6;
		System.out.println(triangleSideA+triangleSideB+triangleSideC);
		
		//6. 정사각형의 넓이를 구하는 코드 작성
		int squareSide1 = 5;
		System.out.println(squareSide1*squareSide1);
		//7. 정오각형의 둘레를 구하는 코드 작성
		int pentagonSide = 4;
		System.out.println(pentagonSide*5);
		//8. 정칠각형의 둘레를 구하는 코드 작성
		int hexagonSide = 7;
		System.out.println(hexagonSide*7);
		//9. 정팔각형의 둘레는 구하는 코드 작성
		int octagonSide = 9;
		System.out.println(octagonSide*8);
		//10. 오늘 지급받은 3권의 교재의 총 페이지수를 구하는 코드 작성
		int book1 = 70;
		int book2 = 74;
		int book3 = 83;
		System.out.println(book1+book2+book3);
				
	}

}
