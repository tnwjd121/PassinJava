package chapter21;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		Map<Student2, Integer> map = new HashMap<Student2, Integer>();
		
		map.put(new Student2(1, "홍길동"), 95);
		map.put(new Student2(1, "홍길동"), 95);
		
		System.out.println("총 Entry 수: " + map.size());
	}

}
