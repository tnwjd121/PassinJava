package chapter24;

import java.util.Arrays;
import java.util.List;

public class Quiz_stream {
	// 스트림에 있는 유용한 메서드들이 어떤것이 있는지 조사
	public static void main(String[] args) {
		// distinct() - 중복 제거 메서드
		
		List<String>names = Arrays.asList("홍길동", "신용권", "김자바", "신용권","신민철");
		names.stream()
			.distinct()
			.forEach(s -> System.out.println(s));
		
		// allMatch(), anyMatch(), noneMatch()- 매칭
		int[] intArr = {2, 4, 6};
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2 == 0);
		System.out.println("모두 2의 배수인가?" + result);
		
		result = Arrays.stream(intArr)
					.anyMatch(a -> a%3 == 0);
		System.out.println("하나라도 3의 배수가 있는가? " + result);
		
		result = Arrays.stream(intArr)
				.noneMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 없는가? " + result);
		
		// sum(), count(), average(), max(), min() - 기본 집계
		Long count = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n -> n % 2 == 0)
				.count();
		System.out.println("2의 배수 개수: "+ count);
		
		int sum = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n -> n % 2 == 0)
				.sum();
		System.out.println("2의 배수 합: "+ sum);
		
		double avg = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n -> n % 2 == 0)
				.average()
				.getAsDouble();
		System.out.println("2의 배수의 평균: "+ avg);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n -> n % 2 == 0)
				.max()
				.getAsInt();
		System.out.println("2의 배수의 최대 값: "+ max);
				
		int min = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n -> n % 2 == 0)
				.min()
				.getAsInt();
		System.out.println("2의 배수의 최소 값: "+ min);
		
		int first = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n -> n % 3 == 0)
				.findFirst()
				.getAsInt();
		System.out.println("첫번재 3의 배수: "+ first);
		
	}
	
	

}
