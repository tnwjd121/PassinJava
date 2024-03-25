package chapter07;

public class AttendanceGS {

	private String student;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getEnterRoomTime() {
		return enterRoomTime;
	}
	public void setEnterRoomTime(String enterRoomTime) {
		this.enterRoomTime = enterRoomTime;
	}
	public String getLeavingRoomTime() {
		return leavingRoomTime;
	}
	public void setLeavingRoomTime(String leavingRoomTime) {
		this.leavingRoomTime = leavingRoomTime;
	}

	@Override
	public String toString() {
		return "AttendanceGS [student=" + student + ", enterRoomTime=" + enterRoomTime + ", leavingRoomTime="
				+ leavingRoomTime + "]";
	}
	public static void main(String[] args) {
		//2. getter setter 사용
		AttendanceGS ags = new AttendanceGS();
		ags.setStudent("김자바");
		ags.setEnterRoomTime("08:50");
		ags.setLeavingRoomTime("16:50");
		System.out.println(ags.toString());
		
		
	}

}
