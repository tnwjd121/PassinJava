package chapter07;

//연락처 관리 프로그램
public class QuizNumber {
	
	private String name;
	private String number;
	private String email;
	
	public void setNumber(String n, String b, String e) {
		name = n;
		number = b;
		email = e;
	}
	
	public void getNumber() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + number);
		System.out.println("이메일: " + email);
	}

	public static void main(String[] args) {
		QuizNumber number1 = new QuizNumber();
		number1.setNumber("백수정", "010-1234-5678", "tnwjd@dkd.com");
		number1.getNumber();
		QuizNumber number2 = new QuizNumber();
		number2.setNumber("홍길동", "010-4556-7856", "gildong@dkd.com");
		number2.getNumber();
		QuizNumber number3 = new QuizNumber();
		number3.setNumber("김자바", "010-4533-2121", "java@dkd.com");
		number3.getNumber();
	}

}
