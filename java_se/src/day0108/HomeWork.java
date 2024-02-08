package day0108;

/**
 * 숙제<br>
 * -클래스 하나를 정의하고 아래의 일을 할 수 있는 instance method를 구현하고, 호출해보세요.<br>
 * 1. 자신의 이름을 출력하는 method<br>
 * -고정일 2. 자신의 이름중에 "성"을 반환하는 method<br>
 * - 고정값 3. 점수를 입력받아 점수의 판정을 출력하는 method 작성.<br>
 * - 가변일 점수는 0~100사이 일때만 판정을 하고 그렇지 않으면 "잘못된 점수"를 출력. 0~39 - 과락 출력, 40~59 - 다른
 * 과목을 참조,60~100 - 합격<br>
 * -
 * 
 * 
 * 4. 문자를 입력받아 해당 문자가 "대문자","소문자","숫자"인지를 판단하여 출력하는 method. A - 대문자 그 이외에는 <br>
 * $ -대문자, 소문자, 숫자가 아닙니다.를 출력<br>
 * - 가변일
 * 
 * 5. 태어난 해를 입력받아 나이를 반환하는 method를작성 <br>
 * - 가변값
 * 
 * 6. 3개의 수를 입력받아 가장 작은수를 반환하는 일 하는 method<br>
 * - 가변 값
 */
public class HomeWork {

	// 1.1. 자신의 이름을 출력하는 method

	public void showName() {// 고정 일
		System.out.println("제 이름은 김무영 입니다.");
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 2. 자신의 이름중에 "성"을 반환하는 method<br>

	public char showLastName() {// 고정 값

		return '김';
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 3. 점수를 입력받아 점수의 판정을 출력하는 method 작성.<br>
	// * 점수는 0~100사이 일때만 판정을 하고 그렇지 않으면 "잘못된 점수"를 출력.
	// * 0~39 - 과락 출력, 40~59 - 다른 과목을 참조, 60~100 - 합격

	public void printPoint(int point) {// 가변 일

		if (point >= 00 && point <= 100) {
			if (point >= 60 && point <= 100) {
				System.out.println("합격");
			} else if (point >= 40) {
				System.out.println("다른 과목을 참조");
			} else {
				System.out.println("과락");
			}

		} else {
			System.out.println("잘못된 점수");
		}

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// * 4. 문자를 입력받아 해당 문자가 "대문자","소문자","숫자"인지를 판단하여 출력하는 method. A - 대문자 그 이외에는 $ -
	// * 대문자, 소문자, 숫자가 아닙니다.를 출력

	public void check(char check) {// 가변 일
		if ((check >= 48 && check <= 57) || (check >= 65 && check <= 90) || (check >= 97 && check <= 122)) {
			if (check >= 97) {
				System.out.println(check + " - 소문자");
			} else if (check >= 65) {
				System.out.println(check + " - 대문자");
			} else {
				System.out.println(check + " - 숫자");
			}

		} else {
			System.out.println(check + " - 대문자, 소문자, 숫자가 아닙니다.");
		}

	}// end check
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// * 5. 태어난 해를 입력받아 나이를 반환하는 method를작성
	// */

	public int age(int year) {// 가변 값

		int age = 2024 - year + 1;
		return age;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// 6. 3개의 수를 입력받아 가장 작은수를 반환하는 일 하는 method
	public int minNum(int a, int b, int c) {// 가변 값

		//////////// 1번/////////
//		if (a < b) {
//			if (a < c) {
//				return a;
//			} else {
//				return c;
//			}
//		} else {
//			if (b < c) {
//				return b;
//			} else {
//				return c;
//			}
//		}
//	}
		////////////////////////

		//////////// 2번/////////
		int[] str = new int[3];
		str[0] = a;
		str[1] = b;
		str[2] = c;
		int min = str[0];
		for (int i = 0; i < str.length; i++) {
			if (min > str[i]) {
				min = str[i];
			}
		}
		return min;
		///////////////////////

	}

	public static void main(String[] args) {

		HomeWork ho = new HomeWork();

		ho.showName();
		System.out.println("제 성은 " + ho.showLastName() + " 입니다.");
		ho.printPoint(80);
		ho.check('G');
		System.out.println("올해" + ho.age(1996) + "");
		System.out.println("가장 작은 수  = " + ho.minNum(1, 6, 12));

	}// main

}// class
