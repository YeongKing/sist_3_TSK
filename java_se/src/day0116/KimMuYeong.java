package day0116;

/**
 * 사람의 공통 특징은 부모클래스인 Person에 정의되어 있고, 자식 클래스인 <br>
 * Clark은 자신의 특별한 기능만 정의<br>
 * 힘의 레벨은 1~10까지 존재,
 */
public class KimMuYeong extends Person {

	public int hungry;

	/**
	 * 김무영의 기본 생성자, 눈 2개, 코 1개, 입 1개인 사람이 태어남<br>
	 * 김무영은 잘먹는다
	 */
	public KimMuYeong() {
		super();
		hungry = 50;
	}// KimMuYeong

	/**
	 * 먹는 음식에 따라 배고픔이 달라진다
	 * 
	 * @param stone 음식의 종류
	 * @return 결과
	 */
	public String eat(String food) {
		String result = "";
		if (food.equals("맛있는음식")) {
			result = "정말 맛있습니다.";
			if (hungry<=90) {
				hungry +=10;
			}

		} else if (food.equals("맛없는음식")) {
			result = "우웩";
			if (hungry>=10) {
				hungry -= 10;
			}

		} else {
			result = "보통이에요";


		} // end else

		return result;

	}
}
