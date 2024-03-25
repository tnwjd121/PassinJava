package chapter19;

public class Point3D {
	
	int x, y, z;

	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Point3D() {
		this(0,0,0);
	}
	
	public boolean equals(Object obj) {
		boolean rx = this.x == x;
		boolean ry = this.y == y;
		boolean rz = this.z == z;
		
		if(rx==true && ry==true&&rz==true) {
			return true;
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		
	
		return "["+x+","+ y +","+z+"]";
	}
	
	

}
