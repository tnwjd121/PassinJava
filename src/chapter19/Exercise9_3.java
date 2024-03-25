package chapter19;

public class Exercise9_3 {
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		
		for(int i=0; i<src.length(); i++ ) {
			if(src.indexOf(target)!=-1) {
				count += 1;
				pos += target.length();
			}else if(src.indexOf(target)==-1){
				break;
			}
		}
		return count;
		
		// 결과가 3이 아니라 16이 나옴
		
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
		
		
	}

}
