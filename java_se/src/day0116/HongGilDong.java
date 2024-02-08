package day0116;

/**
 *	사람의 공통 특징은 부모클래스인 Person에 정의되어 있고, 자식 클래스인 <br>
 *  HongGilDong은 자신의 특별한 기능만 정의<br>
 *  싸움 레벨은 1~10까지 존재,
 *  
 */
public class HongGilDong extends Person {

	private int level;
	
	/**
	 * 	홍길동의 기본 생성자, 눈 2개, 코 1개, 입 1개인 사람이 태어남<br>
	 *  홍길동은 싸움을 평민보다 잘함
	 */
	public HongGilDong(){
		super();
		this.level = 6;
	}
	
	/**
	 * 싸움을 하는 일
	 * @param yourLevel 상대방의 레벨
	 * @return 싸움의 결과
	 */
	public String fight(int enemyLevel) {
		String result = "";
		
		if (level < enemyLevel) {//싸움에서 진 경우
			result = "싸움에서 졌음.";
			level--;
			if (level < 1) {
				level = 1;
			}//end if
		}else if (level > enemyLevel) {//싸움에서 이긴 경우
			result = "싸움에서 이김.";
			level++;
			if (level > 10) {
				level = 10;
			}//end if	
		}else {//비기는 경우
			result = "싸움에서 비겼음.";
		}//end else
		
		
		return result;
	}//fight

	public int getLevel() {
		return level;
	}
	
	/**
	 * 식당에서 화폐단위가 원인 일에서 주막에서 화폐단위가 푼으로 변경되도록 Override.<br>
	 * 
	 * @return 밥을 먹는 행동
	 */
	@Override
	public String eat(String menu, int price) {
		return getName() + "이 주막에서 " + menu + " 인 음식을 " + price + "푼 내고 사먹는다." ;
	}// eat
	
//	public String toString() {
//		return "나는 홍길동이다";
//	}
//	
	
	
	
}//class
