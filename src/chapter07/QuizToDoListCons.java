package chapter07;

public class QuizToDoListCons {
	private String title;
	private String content;
	
	

	public QuizToDoListCons(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}



	@Override
	public String toString() {
		return "QuizToDoListCons [title=" + title + ", content=" + content + "]";
	}



	public static void main(String[] args) {

		QuizToDoListCons toDoListCons1 = new QuizToDoListCons("여행 계획", "엑셀로 시간별 여행일정 잡기");
		System.out.println(toDoListCons1.toString());
		QuizToDoListCons toDoListCons2 = new QuizToDoListCons("신발 사기", "10만원대 스니커즈 구매");
		System.out.println(toDoListCons2.toString());
	}

}
