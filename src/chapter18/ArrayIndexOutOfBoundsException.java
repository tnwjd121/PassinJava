package chapter18;

//ArrayIndexOutOfBoundsException 예외
//배열의 인덱스 범위를 초과하면 발생되는 예외
public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int[] arr=new int[3];
		//arr 배열의 인덱스 값의 범위 0,1,2
//		arr[3]=42;
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
