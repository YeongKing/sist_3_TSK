package day0109;

public class Ramen {

	private int pulp; // 건더기 개수
	private int soup; // 스프 개수
	private String hot; // "순한맛","보통맛","매운맛",
	private String name;// "너구리","신라면","안성탕면"
	private String noodleStyle; // "유탕면", "건면"

	/**
	 * 건더기 개수 설정 메서드
	 * 
	 * @param pulp
	 */
	public void setPulp(int pulp) {

		this.pulp = pulp;

	}

	/**
	 * 건더기 개수 리턴
	 * 
	 * @return
	 */
	public int getPulp() {
		return this.pulp;
	}

	/**
	 * 스프 개수 설정 메서드 0개일 경우 1개 설정
	 * 
	 * @param soup 스프개수
	 */
	public void setSoup(int soup) {
		if (soup != 0) {
			this.soup = soup;

		} else {
			this.soup = 1;
		}
	}

	/**
	 * 스프 개수 리턴
	 * 
	 * @return
	 */
	public int getSoup() {
		return this.soup;
	}

	/**
	 * 맵기 설정
	 * 
	 * @param hot "순한맛","보통맛","매운맛"중 택 ,// 그외의 경우 보통맛 기본설정
	 */
	public void setHot(String hot) {
		if (!(hot.equals("순한맛") || hot.equals("보통맛") || hot.equals("매운맛"))) {
			this.hot = "보통맛";
		}
		this.hot = hot;

	}

	/**
	 * 맵기 반환
	 * 
	 * @return
	 */
	public String getHot() {
		return this.hot;
	}

	/**
	 * 이름 설정 "너구리","신라면","안성탕면" 그외라면 "너구리"설정
	 * 
	 * @param name "너구리","신라면","안성탕면"
	 */
	public void setName(String name) {
		if (!(name.equals("너구리") || name.equals("신라면") || name.equals("안성탕면"))) {
			this.name = "너구리";

		}
		this.name = name;
	}

	/**
	 * 이름 반환
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 면스타일 설정 "유탕면","건면" 그외 입력시 기본 "유탕면"
	 * 
	 * @param noodleStyle "유탕면","건면"
	 */
	public void setNoodleStyle(String noodleStyle) {
		if (!(noodleStyle.equals("유탕면") || noodleStyle.equals("건면"))) {
			this.noodleStyle = "유탕면";
			
		}
		this.noodleStyle = noodleStyle;
	}

	/**
	 * 면 스타일 반환
	 * 
	 * @return
	 */
	public String getNoodleStyle() {
		return this.noodleStyle;
	}

	public String eatPlace(String msg) {
		return "\"" + msg + "\"에서 " + this.name + "을(를) 먹습니다.";
	}

}
