package chapter07;

public class QuizNumberCons {
	private String name;
	private String number;
	private String email;
	
	
	public QuizNumberCons(String name, String number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}


	@Override
	public String toString() {
		return "QuizNumberCons [name=" + name + ", number=" + number + ", email=" + email + "]";
	}


	public static void main(String[] args) {
		QuizNumberCons numberCons1 = new QuizNumberCons("백수정", "010-1234-5678", "tnwjd@dkd.com");
		System.out.println(numberCons1.toString());
		QuizNumberCons numberCons2 = new QuizNumberCons("홍길동", "010-4556-7856", "gildong@dkd.com");
		System.out.println(numberCons2.toString());
		QuizNumberCons numberCons3 = new QuizNumberCons("김자바", "010-4533-2121", "java@dkd.com");
		System.out.println(numberCons3.toString());
	}

}
