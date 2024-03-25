package chapter21;

public class Student2 {
	
	public int sno;
	public String name;
	
	public Student2(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student2) {
			Student2 student2 = (Student2)obj;
			return (sno==student2.sno)&&(name.equals(student2.name));
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}
	
	
	

}
