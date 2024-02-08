package day0108;

/**
 * 시작과 끝을 모를 때 사용하는 반복문.<br>
 * 최소 1번 수행 최대 조건까지 수행<br>
 * 문법)<br>
 * do{ 반복수행문장들..<br>
 * }while( 조건식 );
 */
public class TestDoWhile {

	public static void main(String[] args) {

		int i = 0;

		do {
			System.out.println(i);
			i++;

		} while (i < 10);

		System.out.println("탈출된 i 값 : " + i);

		System.out.println("----------------------------------------------");

		// 1~100까지의 합을 출력해주세요
		int sum = 0;
		i = 0;
		do {
			sum += i;

			i++;
		} while (i <= 100);

		System.out.println("1 ~ 100까지의 합 : " + sum);

	}// main

}// class
