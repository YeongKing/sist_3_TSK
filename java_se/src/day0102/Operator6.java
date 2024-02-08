package day0102;

/*
삼항( 조건 ) 연산자
전항? 항1 : 항2
*/


class  Operator6{
	public static void main(String[] args) {



	int num = 12;

	System.out.println(num + "은(는) " + (num >= 0 ? "양수" : "음수"));


	//num이 홀수인지 짝수인지 판단하여 출력하는 코드를 만들어 보세요.

	System.out.println(num + "은(는) " + ((num % 2) == 0 ? "짝수" : "홀수"));


	//점수를 저장하는 변수를 선언하고, 임의의 값을 할당 합니다.
	//할당된 값이 0~100사이라면 "유효점수"를 출력하고
	//그렇지 않다면 "무효점수"를 출력하는 코드를 작성.

	int score = 101; // -1 , 0 ~ 100 , 101 : 경계값 테스트


	System.out.println(score + "은(는) " + ((score >= 0 && score <= 100) ? "유효점수" : " 무효점수" )); //연산을 한번하냐 두번하냐는 실행횟수가 증가하면 증가할수록 차이가 난다(연산처리속도)


	System.out.println(score + "은(는) " + ((score > -1 && score < 101) ? "유효점수" : " 무효점수" )); //연산을 한번하냐 두번하냐는 실행횟수가 증가하면 증가할수록 차이가 난다(연산처리속도)




	} //main
}//class
