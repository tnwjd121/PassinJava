package chapter07;

// 오늘 할일 만들기
public class QuizToDolist {
	
	private String title;
	private String content;
	
	public void setQuizToDoList(String t, String c) {
		title = t;
		content = c;
	}
	
	public void getQuizToDoList() {
		System.out.println(title + "-" + content);
	}

	public static void main(String[] args) {
		QuizToDolist toDolist1 = new QuizToDolist();
		toDolist1.setQuizToDoList("여행 계획", "엑셀로 시간별 여행일정 잡기");
		toDolist1.getQuizToDoList();
		QuizToDolist toDolist2 = new QuizToDolist();
		toDolist2.setQuizToDoList("신발 사기", "10만원대 스니커즈 구매");
		toDolist2.getQuizToDoList();
	}

}
