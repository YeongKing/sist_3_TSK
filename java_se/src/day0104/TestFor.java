package day0104;



/**
 * for문 : 시작과 끝을 알 때 사용하는 반복문<br>
 * 문법) <br>
 * for(시작값 ; 조건식(끝값) ; 증가.감소식){<br>
 * 반복수행될 문장들...;<br>
 * }<br>
 * 
 */
public class TestFor {

	public static void main(String[] args) {

		// 안녕하세요를 10번 출력하는 코드를 만들어보자.
		for (int i = 0; i < 10; i++) {
			System.out.println("안녕하세요? " + i);
		} // end for

		// 1에서 부터 100까지 옆으로 출력하는 코드 작성 1 2 3 4 5 ....100

		for (int i = 1; i < 101; i++) {
			System.out.print((i) + " ");
		}

		System.out.println();

		// 1에서부터 100까지 홀수만 옆으로 출력하는 코드를 작성

		for (int i = 1; i < 101; i += 2) {// 증감식은 대상체의 값을 변화시키고 저장할 수 있는 모든 연산자를 사용할 수 있다.
			System.out.print((i) + " ");
		}

		System.out.println();
		// 100에서 부터 1까지 옆으로 출력하는 코드 작성 100 99 98 97.... 1

		for (int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1에서부터 9까지 1씩 증가하는 값을 출력해보세요
		for (int i = 1; i < 10; i++) {
			System.out.println("4 * " + i + " = " + (i * 4));
		} // end for

		System.out.println("------------------------------------");
		// main method에 처음 입력된 인수값이 구구단의 범위 였을 때 ( 2단 ~ 9단 )
		// 해당 단의 구구단을 출력하는 코드를 작성해보세요.

		int number = Integer.parseInt(args[0]);

		if (number > 1 && number < 10) {

			for (int i = 1; i < 10; i++) {
				System.out.println(number + " * " + i + " = " + (number * i));
			} // end for

		} else {
			System.out.println(number + "은(는) 2~9의 범위가 아님");
		} // end if
		
		System.out.println("---------------------------------------");
		//1에서 부터 100까지의 합을 출력.5050
		int sum = 0;
		
		for (int i = 1; i < 101; i++) {
			sum += i;

		} // end for
		System.out.println("1~100까지의 합은 " +sum);


		
		
		
		
		
		
		
	}// main

}// class
