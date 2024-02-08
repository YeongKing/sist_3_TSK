package day0116;

/**
 * 숙제 1번. day.0116.Person를 상속받는 자신 이름의 클래스를 생성하고, 자신이 가장 잘하는 일 또는 잘하고싶은일을
 * method로 정의한 후 객체를 생성하여 사용해보세요.
 * 
 * 2. 아래의 데이터를 저장할 수 있는 객체를 만들고 ,값을 입력한다.
 * 
 * 고한별, 서울시 강남구 역삼동, 25 김동수, 경기도 수원시 영통구 영통동, 20 김동섭, 서울시 강남구 서초동, 28 정명호, 마계서울시
 * 부평구 부평동, 25 양수민, 경기도 부천시 부천동, 25 진수현, 서울시 동대문구 동대문동, 27 수연, 서울시 구로구 구로동, 26
 * //마계서울시는 서울시가 아님
 * 
 * 
 * 3. 값을 출력 이름 주소 나이
 * 
 * 4. 이름에 "수"가 들어가는 사람의 수를 출력하세요 : 4명
 * 
 * 5. 서울시에 살고 있는 사람을 출력해보세요. : 4명
 * 
 * 6. 나이의 합산을 출력.
 * 
 * 
 */
public class UsePersonInfoVO {

	/**
	 * 기본 생성자
	 */
	public UsePersonInfoVO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 이름에 "수"가 있는 사람의 수 반환 메서드
	 * 
	 * @param infoArr PersonInfoVO의 객체가 저장되어있는 배열
	 */
	public void printInfo(PersonInfoVO[] infoArr) {
		for (int i = 0; i < infoArr.length; i++) {
			System.out.println(infoArr[i].getName() + ",  " + infoArr[i].getAddress() + ",  " + infoArr[i].getAge());
		} // end for
	}// end printInfo

	/**
	 * 이름에 "수"가 있는 사람의 수 반환 메서드
	 * 
	 * @param infoArr PersonInfoVO의 객체가 저장되어있는 배열
	 * @return 이름에 "수"가 들어있는 사람의 수 (int)
	 */
	public int nameCheck(PersonInfoVO[] infoArr) {
		int count = 0;
		for (int i = 0; i < infoArr.length; i++) {
			if (infoArr[i].getName().contains("수")) {

				count++;
			} // end if

		} // end for

		return count;
	}// nameCheck

	/**
	 * 서울시에 살고있는 사람의 수 반환 메서드
	 * 
	 * @param infoArr PersonInfo의 객체가 저장되어있는 배열
	 * @return 서울에 살고있는 사람의 수 (int)
	 */
	public int seoulCount(PersonInfoVO[] infoArr) {
		int count = 0;
		for (int i = 0; i < infoArr.length; i++) {
			if (infoArr[i].getAddress().indexOf("서울시") == 0) {
				count++;
			} // end if

		} // end for

		return count;
	}// seoulCount

	/**
	 * PersonInfo배열에 존재하는 객체들의 나이의 합 반환 메서드
	 * 
	 * @param infoArr PersonInfoVO의 객체가 저장되어있는 배열
	 * @return 배열에 존재하는 객체들의 나이의 합 (int)
	 */
	public int ageSum(PersonInfoVO[] infoArr) {
		int sum = 0;
		for (int i = 0; i < infoArr.length; i++) {
			sum += infoArr[i].getAge();
		}

		return sum;
	}// ageSum

	public static void main(String[] args) {

		UsePersonInfoVO upifVO = new UsePersonInfoVO();

		PersonInfoVO[] piVOArr = new PersonInfoVO[] { new PersonInfoVO("고한별", "서울시 강남구 역삼동", 25),
				new PersonInfoVO("김동수", "경기도 수원시 영통구 영통동", 20), //
				new PersonInfoVO("김동섭", "서울시 강남구 서초동", 28), //
				new PersonInfoVO("정명호", "마계서울시 부평구 부평동", 25), //
				new PersonInfoVO("양수민", "경기도 부천시 부천동", 25), //
				new PersonInfoVO("진수현", "서울시 동대문구 동대문동", 27), //
				new PersonInfoVO("수연", "서울시 구로구 구로동", 26), };// end
																// PersonInfoVO[]

		upifVO.printInfo(piVOArr);
		System.out.println("-------------------------------------");
		System.out.println("이름에 \"수\"가 있는 사람의 수 : " + upifVO.nameCheck(piVOArr));
		System.out.println("서울시에 살고있는 사람의 수 : " + upifVO.seoulCount(piVOArr));
		System.out.println("나이의 합산 : " + upifVO.ageSum(piVOArr));

	}// main

}// class
