package chapter02;

public class IntroduceMySelf {
	public static void main(String[] args) {
		// 변수 ⭐⭐⭐⭐⭐
		// 자기 소개 및 좋아하는 것 5개를 다양한 변수 선언을 통해
		// 콘솔에 출력하세요
		// 목적 : 변수를 선언하고 사용
		// boolean, int, double, String
		
		// 자기 소개
		String name = "백수정";
		int age = 25;
		boolean gender1 = true;
		boolean gender2 = false;
		double tall = 155.5;
		int footSize = 225;
		
//		System.out.print("저의 이름은 ");
//		System.out.print(name);
//		System.out.print("입니다.");
//		System.out.println();
//		System.out.print("저의 키는");
		
		//System.out.println(); 개행(enter)
		//System.out.print(); 개행이 없음
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : 남성(" + gender2 +"), 여성(" + gender1 + ")");
		System.out.println("키 : " + tall + "cm");
		System.out.println("발사이즈 : " + footSize + "mm");
		System.out.println();
		
		// 좋아하는 것 5개
		// 취미
		int hobbyCount = 3; 
		String hobby1 = "게임";
		String hobby2 = "영상(TV프로그램, 애니, 영화)";
		String hobby3 = "맛집 찾기";
		
		
		String book = "추리";
		String novelist = "히가시노 게이고";
		int likeAge = 13;
		
		String likeCountry = "런던";
		String drama = "셜록홈즈";
		int visitCountryCount = 2;
		int visitCount = 4;
		String visitCountry1 = "일본";
		String visitCountry2 = "대만";
		
		String foodCategory1 = "일식";
		String foodCategory2 = "중식";
		
		String samsung = "삼성";
		String apple = "애플";
		String lg = "엘지";
		String etc = "기타";
		
		
		int moiveCount = 3;
		boolean yes = true;
		boolean no = false;
		
		System.out.println("저의 취미는 " + hobbyCount + "개 입니다.");	
		System.out.println("취미는 " + hobby1 + ", " + hobby2 + ", " + hobby3 + "입니다.");
		System.out.println();
		System.out.println("좋아하는 책 장르는 " + book + "이며, 작가는 " + novelist + "입니다.");
		System.out.println(likeAge + "살 때부터 추리에 빠져서 책 뿐만 아니라 드라마 등도 좋아합니다.");
		System.out.println();
		System.out.println("여행 가고 싶은 나라는 " + likeCountry + "입니다.");
		System.out.println("이유는 " + drama + "를 보고 직접 눈으로 담고 싶어서 입니다.");
		System.out.println("제가 방문했던 나라는 " + visitCountryCount + "곳 이고, " + visitCountry1 + "과 " + visitCountry2 + "입니다.");
		System.out.println("특히 " + visitCountry1 + "은 원래 가고 싶던 나라여서 " + visitCount + "번이나 방문하였습니다.");
		System.out.println();
		System.out.println("좋아하는 음식 장르는 " + foodCategory1 + "과 " + foodCategory2 + "입니다.");
		System.out.println("일식은 라멘(" + yes + "), 스시(" + yes + "), 도미덮밥(" + no + "), 히츠마부시(" + yes + ")");
		System.out.println("중식은 훠궈(" + yes + "), 양꼬치(" + yes + "), 취두부(" + no + "), 산라탕(" + no + ")");
		System.out.println();
		System.out.println("좋아하는 영화 장르는 " + moiveCount + "개 입니다.");
		System.out.println("스릴러(" + yes + "), 로맨스(" + yes + "), 공포(" + yes + "), 액션(" + yes + ")");
		System.out.println();
		System.out.println("좋아하는 전자기기 회사는 삼성(" + yes + ") 애플(" + no + "), 엘지(" + no +")" );
		System.out.println("현재 가지고 있는 전자기기 회사는? " );
		System.out.print("스마트폰("+ samsung + "), 워치(" + samsung + "), 패드(" + samsung + "), ");
		System.out.print("TV("+ samsung + "), 노트북(" + etc + "), 이어폰(" + samsung + ")");
		
		
	}

}
