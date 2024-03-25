package chapter04;

public class WhileExample {

	public static void main(String[] args) {

		//while문
		/*
		 * while(조건식) {
		 * 실행문
		 * }
		 */
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		// while문은 무한루프에 빠질 위험이 많기 때문에 조심해야 한다.
		// 루프(loop) 무한 루프 - 무한 반복
		int check = 0;
		while(check<10) {
			System.out.println(check);
			check++;
		}
		// for문과 while문은 서로 변환이 가능하다
		// for문은 반복 횟수를 알고 있을 때 주로 사용
		// while문은 조건에 따라 반복할 때 주로 사용
		
		//1부터 100까지 합을 출력
		int sum = 0;
		int j=1;
		while(j<=100) {
			sum+=j;
			j++;
		}
		System.out.println("1~100합:"+sum);
		
		// do-while문
		// do ~하다
		/*
		 * do {
		 * 실행문
		 * }while(조건식);
		 */
		// 1. 실행문 실행
		// 2. 조건식 평가 
		do {
			System.out.println("무조건 처음에는 실행");
		}while(false);
		int x = 0;
		do {
			System.out.println(x);
			x++;
		}while(x<3);
		
		//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해 보세요
		System.out.println("----------------------------------");
		int sum3 = 0;
		for(int k=0; k<=100; k++) {
			if(k%3==0) {
				sum3 += k;
			}
		}
		System.out.println(sum3);
	}

}
