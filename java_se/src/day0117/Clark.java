package day0117;

import day0118.Fly;

/**
 * 사람의 공통 특징은 부모클래스인 Person에 정의되어 있고, 자식 클래스인 <br>
 * Clark은 자신의 특별한 기능만 정의<br>
 * 힘의 레벨은 1~10까지 존재,<br>
 * 01-18-2024년 Fly구현 추가
 */
public final class Clark extends Person implements Fly{

	public int power;

	/**
	 * 클락의 기본 생성자, 눈 2개, 코 1개, 입 1개인 사람이 태어남<br>
	 * 클락은 힘이 쎄다.
	 */
	public Clark() {
		super();
		power = 10;
	}// Clark

	/**
	 * 돌의 종류에 따라 힘의 강도가 달라진다.
	 * 
	 * @param stone 돌의 종류
	 * @return 결과
	 */
	public String power(String stone) {
		String result = "";
		if (stone.equals("다이아몬드")) {
			result = "감사합니다.";
			power = 10;
		} else if (stone.equals("크립토나이트")) {
			result = "힘빠짐....";
			power = 0;
		} else {
			result = "열받음";
			power = 12;

		} // end else

		return result;

	}
	
	/**
	 * 집에서 밥을 먹는 일에서 집에서 빵을 먹는 일로 Override.<br>
	 * 
	 * @return 밥을 먹는 행동
	 */
	@Override
	public String eat() {
		return getName() + "이 집에서 빵을 먹는다.";
	}// eat
	
	
	/**
	 * 식당에서 화폐단위가 '원'인 일에서 레스토랑에서 화폐단위가 달러로 변경되도록 Override.<br>
	 * 
	 * @return 밥을 먹는 행동
	 */
	@Override
	public String eat(String menu, int price) {
		return getName() + "가 레스토랑에서 " + menu + "를 " + price + "$ 내고 사먹는다." ;
	}// eat

	/**
	 * 슈퍼맨 객체가 날기위해 양력을 얻는 방법
	 */
	@Override
	public String drivingForce() {
		
		
		
		return "무릎을 꿇어서 ";
	}

	
	
	/**
	 * 슈퍼맨 객체가 날기위해 양력을 얻는 방법
	 */
	@Override
	public String lift() {
		
		
		return "망토를 사용하여";
	}
	
}//Class
