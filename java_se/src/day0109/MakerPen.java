package day0109;

/**
 * 마카펜을 대상으로하여 추상화한 후 작성하는 클래스 입니다<br>
 */
public class MakerPen {

	private int cap;
	private int body;
	private String color;// 검은, 파란 ,빨간

	/**
	 * 생성된 마카펜 객체 뚜껑의 개수를 설정하는 일.<br>
	 * 마카펜의 뚜껑은 1개만 설정된다.
	 * 
	 * @param cap 뚜껑의 개수
	 */
	public void setCap(int cap) {
		if (cap != 1) {
			System.out.println("뚜껑의 개수는 1개만 가능하므로, 1개로 설정되었습니다.");
			this.cap = 1;
		} // end if
	}// setCap

	/**
	 * 생성된 마카펜 객체 뚜껑의 개수를 반환 하는 일.
	 * 
	 * @return 마카펜 객체의 뚜껑개수
	 */
	public int getCap() {
		return cap;
	}// getCap

	/**
	 * 생성된 마카펜 객체의 몸체 개수를 설정하는 일.<br>
	 * 
	 * @param body
	 */
	public void setBody(int body) {

		this.body = body;

	}// setBody

	/**
	 * 생성된 마카펜 객체의 몸체 개수를 반환하는 일.
	 * 
	 * @return
	 */
	public int getBody() {
		return this.body;
	}// getBody

	/**
	 * 생성된 마카펜 객체의 색을 설정하는 일.<br>
	 * 색은 "검은","파란","빨간"만 설정할 수 있다. 그 이외의 색이 입력되면 "검은" 색으로 instance variable를 설정.
	 * 
	 * @param color 설정할 색
	 */
	public void setColor(String color) {
		if (color.equals("검은") || color.equals("파란") || color.equals("빨간")) {
			this.color = color;

		} else {
			this.color = "검은";
		}
	}// setColor

	/**
	 * 생성된 마카펜 객체의 색을 반환하는 일.<br>
	 * 
	 * @return
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * 마카펜 객체의 칠판에 쓰는 일을 (동사적인 특징)을 구현.
	 * @param msg 쓰고싶은 메세지
	 * @return 쓰는 일
	 */
	public String write(String msg) {

		return "\"" + msg + "\"를 " + color + "색 마카펜으로 칠판에 쓴다";
	}

}
