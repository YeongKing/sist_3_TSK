package day0122;

/**
 * Enumeration : 열거형 - 값을 나열해서 사용하는 데이터형
 */
public enum Week {
	MON("월요일", 10),
	TUE("화요일", 20),
	WED("수요일", 30),
	THU("목요일", 40),
	FRI("금요일", 50),
	SAT("토요일", 60),
	SUN("일요일", 70);
	// 상수로 사용되므로 대문자로
																											

	private String name;
	private int value;

	private Week(String name, int value) {
		this.name = name;
		this.value = value;

	}
	
	//요소로 할당된 이넘 객체에 저장값의 이름을 얻는일
	//Week w=Week.MON
	//w.getName() -> 월요일
	public String getName() {
		return this.name;
	}
	
	//요소로 할당된 이넘 객체에 저장값의 값을 얻는 일
	//Week w = Week.MON
	//w.getValue() -> 10
	public int getValue() {
		return this.value;
	}

}// class
