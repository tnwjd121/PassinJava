package chapter07;

public class AttendanceCons {
	
	private String student;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	

	public AttendanceCons(String student, String enterRoomTime, String leavingRoomTime) {
		this.student = student;
		this.enterRoomTime = enterRoomTime;
		this.leavingRoomTime = leavingRoomTime;
	}


	@Override
	public String toString() {
		return "AttendanceCons [student=" + student + ", enterRoomTime=" + enterRoomTime + ", leavingRoomTime="
				+ leavingRoomTime + "]";
	}

	public static void main(String[] args) {
		//1. 생성자로 인스턴스 변수 값을 초기화
		AttendanceCons ac = new AttendanceCons("김자바", "08:50", "17:50");
		System.out.println(ac.toString());
		
	}

}
