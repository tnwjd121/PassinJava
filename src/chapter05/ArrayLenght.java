package chapter05;

import java.util.Random;

public class ArrayLenght {

	public static void main(String[] args) {

		// 배열 길이
		// 배열에 저장할 수 있는 전체 항목의 개수
		int[] intArray = {10, 20, 30};
		System.out.println(intArray.length);
		// 배열 객체(class) length 속성(field)
		// 배열 안에 있는 일종의 변수 length는 
		// 배열 길이를 담고 있다.
		// System.out.println();
		// Math.random();
		String[] fruits = {"사과", "바나나", "배"};
		System.out.println(fruits.length);
		// 배열변수.length
		// length 변수를 사용함으로써
		// 코드 수정이 발생 했을 때
		// 수정할 부분이 생기지 않으므로 훨씬 좋은 코드
		int[] scores = {83,90,87,93,70};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		double avg = sum / scores.length;
		System.out.println("평균 : " + avg);
		
		int[] intArr = new int[10];
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		while(true) {
		int first = (int)((Math.random()*6+1));
		int second = (int)((Math.random()*6+1));
		System.out.println("(" + first +"," + second + ")");
		
			if((first + second) == 5) {
				break;
			}
		}
		
	}

}
