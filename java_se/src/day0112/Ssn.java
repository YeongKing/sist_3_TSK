package day0112;

import day0103.Zodiac;

/**
 * 숙제<br>
 * -아래의 작업을 instance method로 만들어 사용하는 class를 작성하고, 사용해보세요 . (getter method,
 * setter method 도 작성할 것 ) 주민번호의 형식은 xxxxxx-xxxxxxx
 * (예)950111-1234567,240111-5456789)입니다. 1900년대생 외국인(남자,여자) (-5 ,-6 ) o1. 주민번호를
 * 입력받아 instance 변수에 저장하는 생성자를 생성하세요. 2000년대생 외국인(남자,여자) (-7,-8)
 * 
 * o2. 인스턴스 변수에 저장된 주민번호의 글자수가 14자리인지를 체크하여 boolean으로 반환하는 일을 하는 method를 작성하세요.
 * 
 * o3.인스턴스 변수에 저장된 주민번호의 7번째 인덱스에 -가 있는지 체크하여 boolean으로 반환하는 일을 하는 method를 작성하세요
 * 
 * o 4.인스턴스 변수에 저장된 주민번호에서 생년월일을 연산하여 문자열로 반환하는 일을하는 method를 작성하세요. 반환예) 입력된
 * 주민번호가 950102-123456이라면 1995년 01월 02일로 반환되어야 합니다. 판단기준 ) -뒤의 문자가 1,2,5,6이라면
 * 1900년대생 , 3,4,7,8이라면 2000년 대생, 9,0이라면 1800년 대생
 * 
 * 5.입력된 주민번호에서 나이를 구해서 정수로 반환하는 method를 작성하세요
 * 
 * 6.입력된 주민번호에서 성별을 구해 문자열로 반환하는 method를 작성하세요. 판단기준 ) -뒤의 문자가 1,3,5,7,9 - 남자
 * //2,4,6,8,0 - 여자
 * 
 * 7.입력된 주민번호에서 띠를 구하여 문자열로 반환하는 method를 작성하세요.
 * 
 * 호출 예) 요구사항을 준수하여 method가 작성되면 아래의 형태로 method String ssn = "950101-1234567"
 * 클래스명 객체명 = new 클래스명(ssn); if(객체명.2번메소드()){ if(객체명.3번메소드(){ S.o.p(객체명.4번메소드()
 * } }
 */
public class Ssn {
	private String ssnNumber;
	private int year;
	private int month;
	private int day;

	public Ssn() {
	}// 기본 생성자

	public Ssn(String ssnNumber) {
		setSsnNumber(ssnNumber);
	}

	public void setSsnNumber(String ssn) { // 주민번호 설정

		this.ssnNumber = ssn;
		char checkSex = ssnNumber.charAt(7);
		String halfYear = ssnNumber.substring(0, 2);

		if (checkSex == '1' || checkSex == '2' || checkSex == '5' || checkSex == '6') {
			this.year = Integer.parseInt("19" + halfYear);

		} else if (checkSex == '3' || checkSex == '4' || checkSex == '7' || checkSex == '8') {
			this.year = Integer.parseInt("20" + halfYear);

		} else if (checkSex == '9' || checkSex == '0') {
			this.year = Integer.parseInt("18" + halfYear);

		}
		this.month = Integer.parseInt(ssnNumber.substring(2, 4));
		this.day = Integer.parseInt(ssnNumber.substring(4, 6));

	}// setSsnNumber

	public String getSsnNumber() { // 주민번호 호출
		return ssnNumber;
	}// getSsnNumber

	public boolean lengthCheck() { // 주민번호의 길이 확인
		boolean flag = false;
		if (ssnNumber.length() == 14) {
			flag = true;
		}
		return flag;
	}// lengthCheck

	public boolean deshCheck() { // 주민번호 사이의 '-' 확인
		boolean flag = false;
		if (ssnNumber.charAt(6) == '-') {
			flag = true;
		}
		return flag;

	}// deshCheck

	public String changeBirth() {// 주민등록번호를 @@@@년 @@월 @@일로 변환

		// 생년월일을 ~~년 ~~월 ~~ 일 로 변환
		return this.year + "년 " + this.month + "월 " + this.day + "일";

	}

	public int age() { // 나이 반환

		// 주민번호에서 나이를 구해서 정수로 반환

		return 2024 - year + 1;

	}

	public String checkSex() { // 성별 확인
		char checkSex = ssnNumber.charAt(7);
		String gender = "여자";
		if (checkSex == '1' || checkSex == '3' || checkSex == '5' || checkSex == '7' || checkSex == '9') {
			gender = "남자";
		}
		return gender;

	}

	public String checkZodiac() {
		String result = "";
		if (year % 12 == Zodiac.MONKEY) {
			result = "원숭이띠";
		} else if (year % 12 == Zodiac.ROOSTER) {
			result = "닭띠";
		} else if (year % 12 == Zodiac.DOG) {
			result = "개띠";
		} else if (year % 12 == Zodiac.PIG) {
			result = "돼지띠";
		} else if (year % 12 == Zodiac.RAT) {
			result = "쥐띠";
		} else if (year % 12 == Zodiac.OX) {
			result = "소띠";
		} else if (year % 12 == Zodiac.TIGER) {
			result = "호랑이띠";
		} else if (year % 12 == Zodiac.RABBIT) {
			result = "토끼띠";
		} else if (year % 12 == Zodiac.DRAGON) {
			result = "용띠";
		} else if (year % 12 == Zodiac.SNAKE) {
			result = "뱀띠";
		} else if (year % 12 == Zodiac.HORSE) {
			result = "말띠";
		} else if (year % 12 == Zodiac.LAMB) {
			result = "양띠";
		}

		return result;

	}
}// class
