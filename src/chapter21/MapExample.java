package chapter21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0; // 최고 점수 저장
		int totalScore = 0; // 점수 합계 저장
		
		// 평균 점수
		Set<String> keyset = map.keySet();
		
		Iterator<String> kItr = keyset.iterator();
		while(kItr.hasNext()) {
			
			totalScore += map.get(kItr.next());
		}
		
		System.out.println("평균점수 :" + (totalScore/map.size()));
		// 최고 점수와 최고점수를 받은 아이디
		if(map.get("blue")> map.get("hong")&&map.get("blue")> map.get("white")) {
			name = "blue";
			maxScore = map.get("blue");
		}else if (map.get("hong")> map.get("blue")&&map.get("hong")> map.get("white")) {
			name = "hong";
			maxScore = map.get("hong");
		}else if (map.get("white")> map.get("hong")&&map.get("white")> map.get("blue")) {
			name = "white";
			maxScore = map.get("white");
		}else {
			System.err.println("오류");
		}
		
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
		
	}

}
