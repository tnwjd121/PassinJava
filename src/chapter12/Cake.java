package chapter12;

// Object 클래스 - 모든 클래스의 최상위 클래스
// extends Object - Object클래스를 상속 받는 문장이 생략되어 있음
public class Cake {
	private String name;

	@Override
	public String toString() {
		return "Cake [name=" + name + "]";
	}
	// tostring은 object클래스가 가지고 있는 메소드
	// 해당 메소드를 오버라이딩한 것
}


