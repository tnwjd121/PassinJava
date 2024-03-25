package chapter05;

public class ArrayCreate002 {

	public static void main(String[] args) {

		// new 연산자로 배열 생성
		// 타입[] 변수 = new 타입[길이];
		// 길이 - 배열이 저장 할 수 있는 값의 개수
		// 길이가 5인 int[] 배열을 생성
		
		int[] intArray = new int[5];
		int[] intArr = {0,0,0,0,0};
		// new 연산자로 배열을 처음 생성할 경우
		// 0이라는 기본값으로 초기화됩니다.
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		//타입별로 배열의 초기값
		// int[] / 0
		// double[] / 0.0
		// boolean[] / false
		// String[] / null
		String[] strArr = new String[3];
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		// 클래스와 인터페이스 타입만 null을 사용 가능
		// 기본 데이터 타입에서는 null 사용이 불가능하다
		String str = null;
//		int n1 = null; 불가능
		int[] intArr1 = null;
		intArr1 = new int[5];
		
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		String[] arr2 = new String[3];
		arr2[0] ="1월";
		arr2[1] ="2월";
		arr2[2] ="3월";
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
