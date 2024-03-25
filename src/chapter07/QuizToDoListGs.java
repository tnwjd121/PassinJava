package chapter07;

public class QuizToDoListGs {
	private String title;
	private String content;
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "QuizToDoListGs [title=" + title + ", content=" + content + "]";
	}


	public static void main(String[] args) {

		QuizToDoListGs toDoListGs1 = new QuizToDoListGs();
		toDoListGs1.setTitle("여행 계획");
		toDoListGs1.setTitle("엑셀로 시간별 여행일정 잡기");
		System.out.println(toDoListGs1.toString());
		QuizToDoListGs toDoListGs2 = new QuizToDoListGs();
		toDoListGs2.setTitle("신발 사기");
		toDoListGs2.setTitle("10만원대 스니커즈 구매");
		System.out.println(toDoListGs2.toString());
	}

}
