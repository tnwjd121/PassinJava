package chapterQuiz;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Ex14_11 {
	
	public static void main(String[] args) {
		Student3[] stuArr = {
				new Student3("나자바", true, 1, 1, 300),
				new Student3("김지비", false, 1, 1, 250),
				new Student3("김자바", true, 1, 1, 200),
				new Student3("이지미", false, 1, 2, 150),
				new Student3("남자바", true, 1, 2, 100),
				new Student3("안지미", false, 1, 3, 50),
				new Student3("황지미", false, 1, 2, 100),
				new Student3("강지미", false, 1, 3, 150),
				new Student3("이자바", true, 1, 03, 200),
				new Student3("나자바", true, 2, 1, 300),
				new Student3("김지비", false, 2, 1, 250),
				new Student3("김자바", true, 2, 1, 200),
				new Student3("이지미", false, 2, 2, 150),
				new Student3("남자바", true, 2, 2, 100),
				new Student3("안지미", false, 2, 3, 50),
				new Student3("황지미", false, 2, 2, 100),
				new Student3("강지미", false, 2, 3, 150),
				new Student3("이자바", true, 2, 03, 200)
		};
		
		System.out.printf("1. 단순그룹화(반별로 그룹화)%n");
		Map<Integer, List<Student3>> stuByBan = Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student3::getBan));
		
		for(List<Student3> ban : stuByBan.values()) {
			for(Student3 s : ban) {
				System.out.println(s);
			}
		}
		System.out.printf("%n2. 단순그룹화(성적별로 그룹화)&n");
		Map<Student3.Level, List<Student3>> stuByLevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s -> {
					if(s.getScore() >= 200) return Student3.Level.HIGH;
					else if(s.getScore() >= 100) return Student3.Level.MID;
					else						 return Student3.Level.LOW;
				}));
		TreeSet<Student3.Level> keyset = new TreeSet<>(stuByLevel.keySet());
		
		for(Student3.Level key : keyset) {
			System.out.print("["+key+"]");
			
			for(Student3 s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}
		System.out.printf("%n3. 단순그룹화 + 통계(성적별 학생수)%n");
		Map<Student3.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s -> {
					if(s.getScore() >= 200) return Student3.Level.HIGH;
					else if(s.getScore() >= 100) return Student3.Level.MID;
					else						 return Student3.Level.LOW;
				}, Collectors.counting()));
		
		for(Student3.Level key : stuCntByLevel.keySet()) {
			System.out.printf("[%s] -%d명, ", key, stuCntByLevel.get(key));
			System.out.println();

			}
		System.out.printf("%n4. 다중그룹화(학년별, 반별)");
		Map<Integer, Map<Integer, List<Student3>>> stuByHakAndBan = 
			Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student3::getHak,
						Collectors.groupingBy(Student3::getBan)
				));
			
		for(Map<Integer, List<Student3>> hak : stuByHakAndBan.values()) {
			for(List<Student3> ban : hak.values()) {
				System.out.println();
				for(Student3 s: ban)
					System.out.println(s);
				}
			}
			System.out.printf("%n5. 다중그룹화 + 통계(학년별, 반별 1등)&n");
			Map<Integer, Map<Integer, Student3>> TopStuByHakAndBan = 
				Stream.of(stuArr)
					.collect(Collectors.groupingBy(Student3::getHak,
						Collectors.groupingBy(Student3::getBan,
							Collectors.collectingAndThen(
								Collectors.maxBy(Comparator.comparingInt(Student3::getScore))
								, Optional::get
								)
							)
						));
			
			for(Map<Integer, Student3> ban : TopStuByHakAndBan.values())
				for(Student3 s : ban.values())
					System.out.println(s);
			
		System.out.printf("%n6. 다중그룹화 + 통계(학년별, 반별 성적그룹)&n");
		Map<String, Set<Student3.Level>> StuByScoreGroup = Stream.of(stuArr)
			.collect(Collectors.groupingBy(s -> s.getHak() + "-" + s.getBan(),
				Collectors.mapping(s-> {
					if(s.getScore() >= 200) return Student3.Level.HIGH;
					else if(s.getScore() >= 100) return Student3.Level.MID;
					else						 return Student3.Level.LOW;
				}, Collectors.toSet())
			));
		Set<String> keySet2 = StuByScoreGroup.keySet();	
		
		for(String key : keySet2) {
			System.out.println("["+key+"]" + StuByScoreGroup.get(key));
		}
		
	}
		
}

