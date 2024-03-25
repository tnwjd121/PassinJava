package chapter04;

public class BreakExample002 {

	public static void main(String[] args) {

		//break 키워드, 예약어, 문
		for(int i=0; i<10; i++) {
			System.err.println("java1");
			if(i==3) {
				System.out.println(i);
				break;
			}
			System.err.println("java2");
		}
		// while문을 이용해서 주사위 번호 중 하나를
		// 반복적으로 무작위로 뽑고, 6이 나오면 while문을 종료
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		
	}

}
