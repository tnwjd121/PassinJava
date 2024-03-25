package chapter07;

public class QuizNumberGS {
	private String name;
	private String number;
	private String email;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	

	@Override
	public String toString() {
		return "QuizNumberGS [name=" + name + ", number=" + number + ", email=" + email + "]";
	}


	public static void main(String[] args) {
		QuizNumberGS numberGS1 = new QuizNumberGS();
		numberGS1.setName("백수정");
		numberGS1.setNumber("010-1234-5678");
		numberGS1.setEmail("tnwjd@dkd.com");
		System.out.println(numberGS1.toString());
		QuizNumberGS numberGS2 = new QuizNumberGS();
		numberGS2.setName("홍길동");
		numberGS2.setNumber("010-4556-7856");
		numberGS2.setEmail("gildong@dkd.com");
		System.out.println(numberGS2.toString());
		QuizNumberGS numberGS3 = new QuizNumberGS();
		numberGS3.setName("김자바");
		numberGS3.setNumber("010-4533-2121");
		numberGS3.setEmail("java@dkd.com");
		System.out.println(numberGS3.toString());
	}

}
