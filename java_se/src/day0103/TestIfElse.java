package day0103;

/**
 * if~else : 둘 중 하나의 코드를 실행해야 할 때 사용.<br>
 * 문법 )<br>
 * if(조건식){<br>
 * 조건에 맞을 때 수행할 문장 들...<br>
 * }else{<br>
 * 조건에 맞지 않을 때 수행할 문장 들...<br>
 * }<br>
 */
public class TestIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 임의의 정수가 홀수 인지 짝수인지 판단하여 출력하는 코드.

		int i = 2023;

		System.out.print(i + " 는(은) ");
		if (i % 2 == 1) {
			System.out.println("홀수 ");
		} else {
			System.out.println("짝수 ");
		} // end if

		// 임의의 점수를 저장하는 변수를 만들고, main method의 arguments 첫번째를 받아서
		// 0~100사이면 "유효 점수" 출력하고, 그렇지 않다면 "무효점수"를 출력.

		int point = Integer.parseInt(args[0]);

		System.out.println("args[0] : " + args[0]);

		if (point > -1 && point < 101) {
			System.out.println("유효 점수");
		} else {
			System.out.println("무효 점수");
		} // end if
		
		
		
		
	}// main

}// class
