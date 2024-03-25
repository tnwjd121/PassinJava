package chapter11;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student() {
	}

	public int getTotal() {
		int sum = kor + eng + math;
		return sum;
	}
	
	public float getAverage() {
		
		return (int) (getTotal() / 3f * 10 + 0.5f)/10f;
	}

	
	public String info() {
		String infohong = name+ ","+ban+ "," +no+ "," +kor+ "," + eng+ "," + math
				+ ((int) (kor + eng + math)/3);
		return infohong;
	}

	
	

}

