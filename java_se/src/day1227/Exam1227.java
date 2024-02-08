package day1227;


class Exam1227 {
	public static void main(String[] args) {

	//출력 1. 
	//내 이름은 홍길동 이고 이니셜은 H, G, D입니다.
	//태어난 해는 xxxx년으로
	//나이는 xx살입니다.

	char initial1 = 'K';
	char initial2 = 'M';
	char initial3 = 'Y';
	
	int birthYear = 1996;
	int thisYear  = 2023;

	System.out.println("내 이름은 김무영 이고 이니셜은 " + initial1 + ", " + initial2 + ", " + initial3 + "입니다." );
	System.out.println("태어난 해는 " + birthYear + "년으로" );
	System.out.println("나이는 " + (thisYear - birthYear) + "살입니다.");
	System.out.println();
	System.out.println();



	//출력 2.
	//왼 눈 시력 xx.x 오른 눈 시력 xx.x 이고, 양안 시력 xx.x입니다.

	double leftVision = 1.0d;
	double rightVision = 1.0d;

	System.out.println("왼눈 시력 " + leftVision + " 오른 눈 시력 " + rightVision + " 이고 양안 시력 " + (((leftVision + rightVision)/2.0)) + "입니다." );
	System.out.println();
	System.out.println();
	





	//출력 3.
	//편도차비는 xx원, 왕복차비는 xx원, 한달 20일 출근하면 월 교통비는 총 xx원 입니다.

	int oneWayFee = 1400;

	System.out.println("편도차비는 " + oneWayFee + "원, 왕복차비는 " + (oneWayFee*2) + "원, 한달 20일 출근하면 월 교통비는 총 " + (oneWayFee*2*20) + "원 입니다.");
	System.out.println();
	System.out.println();




	//출력 4.
	//대문자 'A'의 Unicode 값은 65입니다. A에 32를 더하면 소문자 'a'를 만들 수 있다. 
	//    (char)

	char character = 'A';
	
	System.out.println("대문자 '" + character + "' 의 Unicode 값은 " + (int)character + "입니다. A에 32 더하면 소문자 '" + (char)((int)character + 32) + "'를 만들 수 있다.");


	//각 항목에 부합되는 데이터 형을 사용하여 변수를 선언하고, 연산하여 출력해 보세요.














	}//main
}//class
