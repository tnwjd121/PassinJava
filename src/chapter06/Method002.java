package chapter06;

public class Method002 {

	public static void main(String[] args) {
		byEveryone();
//		hiEveryone(12);(x)
//		hiEveryone("문자열", 12.5);(x)
		double myHight = 13.5;
		hiEveryone(12, myHight);
		
		// 함수 호출시에는 매개변수의 타입과 수를 맞추어야 함
	}
	
	// 매개변수(입력)가 없는 메소드의 정의
	//void - 반환(출력)이 없다
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
	
	// 매개변수가 둘인 메소드의 정의
	public static void hiEveryone(int age, double height) {
		//int age
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("제 키는 " + height + "cm 입니다.");
	}
}
