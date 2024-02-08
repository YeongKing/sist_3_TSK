package day0117;
/**
 * 숙제
 * 1. 지난번 숙제로 작성한 강아지 클래스의 공통 특징을 추상 클래스로 만들고,<br>
 * 	강아지의 일 중 하나를 추상 method로 만들어서 정의하세요.<br>
 * 
 * 2. 1번클래스를 상속 받는 치와와 클래스와 말라뮤트 클래스를 만들어 보세요.
 * 
 * 3. 객체를 생성하고 사용해보세요.
 * 
 * 4. 클래스 다이어그램을 그려보세요.
 * 
 */

public abstract class Dog {
	private int eye;
	private int nose;
	private int mouth;
	private String size;
	private String kind;
	private String name;

	/**
	 * 기본 생성자 기본 생성자 사용시 눈2개,코1개,입1개,소형견인 치와와를 생성함
	 */
	public Dog() {// 생성자
		this(2, 1, 1, "소형견", "치와와");

	}

	/**
	 * 눈 n개 , 코 n개, 입 n개 , 사이즈 가 size, 종류가 kind인 강아지 생성
	 * 
	 * @param eye   눈의 수
	 * @param nose  코의 수
	 * @param mouth 입의 수
	 * @param size  크기
	 * @param kind  종류
	 */
	public Dog(int eye, int nose, int mouth, String size, String kind) {

		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
		this.size = size;
		this.kind = kind;

	}

	/**
	 * 생성된 강아지객체에 눈의 개수를 설정하는 일
	 * 
	 * @param eye 눈의 개수
	 */
	public void setEye(int eye) {// 가변일
		this.eye = eye;
	}// setEye

	/**
	 * 생성된 강아지객체가 가지고 있는 눈의 개수를 반환하는 일
	 * 
	 * @return 눈의 수
	 */
	public int getEye() {// 고정값
		return eye;

	}// getEye

	/**
	 * 생성된 강아지객체에 코의 개수를 설정하는 일
	 * 
	 * @param nose 코의 개수
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}// setNose

	/**
	 * 생성된 강아지객체가 가지고 있는 코의 개수를 반환하는 일
	 * 
	 * @return 코의 수
	 */
	public int getNose() {
		return nose;
	}// setNose

	/**
	 * 생성된 강아지객체에 입의 개수를 설정하는 일
	 * 
	 * @param mouth 입의 개수
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}// setMouse

	/**
	 * 생성된 강아지객체가 가지고 있는 입의 개수를 반환하는 일
	 * 
	 * @return 입의 수
	 */
	public int getMouth() {
		return mouth;
	}// getMouse

	/**
	 * 생성된 강아지객체에 이름을 설정하는 일
	 * 
	 * @param name 설정할 이름
	 */
	public void setName(String name) {
		this.name = name;
	}// setName

	/**
	 * 생성된 강아지객체가 가지고 있는 이름을 반환하는 일
	 * 
	 * @return 이름
	 */
	public String getName() {
		return name;
	}// getName

	/**
	 * 생성된 강아지객체에 크기를 설정하는 일 "소형견" , "중형견", "대형견"만 가능 기본값 = "소형견"
	 * 
	 * @param name 설정할 크기
	 */
	public void setSize(String size) {
		if (!(size.equals("소형견") || size.equals("중형견") || size.equals("대형견"))) {
			this.size = "소형견";
		}
		this.size = size;
	}// setSize

	/**
	 * 생성된 강아지객체가 가지고 있는 이름을 반환하는 일
	 * 
	 * @return 이름
	 */
	public String getSize() {
		return size;
	}// getSize

	/**
	 * 생성된 강아지객체에 종류를 설정하는 일 "치와와", "시베리안 허스키", "시바견" ,"말라뮤트" 기본값 = "치와와"
	 * 
	 * @param name 설정할 종류
	 */
	public void setKind(String kind) {
		if (!(kind.equals("치와와") || kind.equals("시베리안 허스키") || kind.equals("시바견")||kind.equals("말라뮤트"))) {
			this.kind = "치와와";
		}

		this.kind = kind;
	}// setKind

	/**
	 * 생성된 강아지객체가 가지고 있는 종류를 반환하는 일
	 * 
	 * @return 종류
	 */
	public String getKind() {
		return kind;
	}// getKind

	/**
	 * 강아지의 동사적인 특징중에 짖는 일을 구현한 method.<br>
	 * 추상 메서드
	 * @return 짖는 행동
	 */
	public abstract String bark();

	/**
	 * 강아지의 동사적인 특징중 집에서 밥을 먹는 일을 구현한 method.<br>
	 * 추상 메서드
	 * @param menu 음식종류
	 * @return 밥을 먹는 행동
	 */
	public abstract String eat(String menu);

}// class
