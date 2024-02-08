package day0115;

public class SocialSecurityNumber {
	private String ssn;

	/**
	 * 주민등록번호를 입력받아 instance 변수에 저장하는 생성자.
	 * @param ssn 주민등록번호
	 */
	public SocialSecurityNumber(String ssn) {
		this.ssn = ssn;
	}// SocialSecurityNumber

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}// setSsn

	public String getSsn() {
		return ssn;
	}// getSsn

	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민등록번호의(member 변수, instance 변수)
	 * 자릿수가 14자리인지 체크
	 *  
	 * @return 14자리인지의 결과
	 */
	public boolean checkDigit() {
		
		return ssn.length() == 14;
	}// checkDigit

	public boolean checkDash() {
		int index = ssn.indexOf("-");
		if (index == 6) {
			return true;
		}
		return false;
	}// checkDash

	public String birthDays() {
		String birthday = ssn.substring(0, 6);
		if (ssn.charAt(7) == '1' || ssn.charAt(7) == '2' || ssn.charAt(7) == '5' || ssn.charAt(7) == '6') {
			String year = "19";
			// 19940728/ \\d{4}년\\d{2}월\\d{2}일 //$1년$2월$일
			String yearBirth = year.concat(birthday);
			String result = yearBirth.replaceAll("(\\d{4})(\\d{2})(\\d{2})", "$1년$2월$3일");
			return result;

		} else if (ssn.charAt(7) == '3' || ssn.charAt(7) == '4' || ssn.charAt(7) == '7' || ssn.charAt(7) == '8') {
			String year1 = "20";
			String yearBirth1 = year1.concat(birthday);
			String result1 = yearBirth1.replaceAll("(\\d{4})(\\d{2})(\\d{2})", "$1년$2월$3일");
			return result1;

		} else {
			String year2 = "18";
			String yearBirth2 = year2.concat(birthday);
			String result2 = yearBirth2.replaceAll("(\\d{4})(\\d{2})(\\d{2})", "$1년$2월$3일");
			return result2;
		}
	}// birthDays

	public int age() {
		String birthday = ssn.substring(0, 2);
		if (ssn.charAt(7) == '1' || ssn.charAt(7) == '2' || ssn.charAt(7) == '5' || ssn.charAt(7) == '6') {
			String year = "19";
			// 19940728/ \\d{4}년\\d{2}월//d{2}일 //$1년$2월$일
			String yearBirth = year.concat(birthday);
			int numBirth = Integer.parseInt(yearBirth);
			return 2024 - numBirth + 1;

		} else if (ssn.charAt(7) == '3' || ssn.charAt(7) == '4' || ssn.charAt(7) == '7' || ssn.charAt(7) == '8') {
			String year1 = "20";
			String yearBirth1 = year1.concat(birthday);
			int numBirth1 = Integer.parseInt(yearBirth1);
			return 2024 - numBirth1 + 1;

		} else {
			String year2 = "18";
			String yearBirth2 = year2.concat(birthday);
			int numBirth2 = Integer.parseInt(yearBirth2);
			return 2024 - numBirth2 + 1;
		}
	}// age

	public String gender() {
		if (ssn.charAt(7) == '1' || ssn.charAt(7) == '3' || ssn.charAt(7) == '5' || ssn.charAt(7) == '7'
				|| ssn.charAt(7) == '9') {
			return "남자";
		} else {
			return "여자";
		}
	}// gender
//  7. 입력된 주민번호에서 띠를 구하여 문자열로 반환하는 method를 작성하세요.

	public String zodiac() {
		String birthday = ssn.substring(0, 2);
		if (ssn.charAt(7) == '1' || ssn.charAt(7) == '2' || ssn.charAt(7) == '5' || ssn.charAt(7) == '6') {
			String year = "19";
			// 19940728/ \\d{4}년\\d{2}월//d{2}일 //$1년$2월$일
			String yearBirth = year.concat(birthday);
			int numBirth = Integer.parseInt(yearBirth);
			if (numBirth % 12 == 1) {
				return "닭띠";
			} else if (numBirth % 12 == 2) {
				return "개띠";
			} else if (numBirth % 12 == 3) {
				return "돼지 띠";
			} else if (numBirth % 12 == 4) {
				return "쥐 띠";
			} else if (numBirth % 12 == 5) {
				return "소 띠";
			} else if (numBirth % 12 == 6) {
				return "호랑이 띠";
			} else if (numBirth % 12 == 7) {
				return "토끼 띠";
			} else if (numBirth % 12 == 8) {
				return "용 띠";
			} else if (numBirth % 12 == 9) {
				return "뱀 띠";
			} else if (numBirth % 12 == 10) {
				return "말 띠";
			} else if (numBirth % 12 == 11) {
				return "양 띠";
			} else {
				return "원숭이 띠";

			}
		} else if (ssn.charAt(7) == '3' || ssn.charAt(7) == '4' || ssn.charAt(7) == '7' || ssn.charAt(7) == '8') {
			String year1 = "20";
			String yearBirth1 = year1.concat(birthday);
			int numBirth1 = Integer.parseInt(yearBirth1);
			if (numBirth1 % 12 == 1) {
				return "닭띠";
			} else if (numBirth1 % 12 == 2) {
				return "개띠";
			} else if (numBirth1 % 12 == 3) {
				return "돼지 띠";
			} else if (numBirth1 % 12 == 4) {
				return "쥐 띠";
			} else if (numBirth1 % 12 == 5) {
				return "소 띠";
			} else if (numBirth1 % 12 == 6) {
				return "호랑이 띠";
			} else if (numBirth1 % 12 == 7) {
				return "토끼 띠";
			} else if (numBirth1 % 12 == 8) {
				return "용 띠";
			} else if (numBirth1 % 12 == 9) {
				return "뱀 띠";
			} else if (numBirth1 % 12 == 10) {
				return "말 띠";
			} else if (numBirth1 % 12 == 11) {
				return "양 띠";
			} else {
				return "원숭이 띠";
			}
		} else {
			String year2 = "18";
			String yearBirth2 = year2.concat(birthday);
			int numBirth2 = Integer.parseInt(yearBirth2);
			if (numBirth2 % 12 == 1) {
				return "닭띠";
			} else if (numBirth2 % 12 == 2) {
				return "개띠";
			} else if (numBirth2 % 12 == 3) {
				return "돼지 띠";
			} else if (numBirth2 % 12 == 4) {
				return "쥐 띠";
			} else if (numBirth2 % 12 == 5) {
				return "소 띠";
			} else if (numBirth2 % 12 == 6) {
				return "호랑이 띠";
			} else if (numBirth2 % 12 == 7) {
				return "토끼 띠";
			} else if (numBirth2 % 12 == 8) {
				return "용 띠";
			} else if (numBirth2 % 12 == 9) {
				return "뱀 띠";
			} else if (numBirth2 % 12 == 10) {
				return "말 띠";
			} else if (numBirth2 % 12 == 11) {
				return "양 띠";
			} else {
				return "원숭이 띠";
			}
		} // if
	}// zodiac

}// end class
