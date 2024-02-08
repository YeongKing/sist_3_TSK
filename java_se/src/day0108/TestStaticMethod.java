package day0108;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * static method 작성.<br>
 */
public class TestStaticMethod {

	public static void plus(int num, int num2) {

		int result = 0;

		result = num + num2;

		System.out.println(result);

	}// plus

	//////////////////////////////////////////////////////////////////
	// 구구단을 입력받아 구구단의 범위 였을 때 출력하는 method를 작성하고, 호출하세요.
	
	public static void gugudan(int num) {
		
		if (num >= 2 && num <=9) {
			System.out.println("----------------"+num+"단의 구구단-----------------");
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
			
			System.out.println("-------------------------------------------");

		} else {
			System.out.println(num + "단은 구구단에 없습니다(2~9)");
		}//end else

	}// end gugudan

	public static void main(String[] args) {
		
		
		
	//	TestStaticMethod.plus(1, 9);
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("출력하고싶은 구구단의 단을 입력하세요.:");

		
		
	try {
		int number = scanner.nextInt();
		TestStaticMethod.gugudan(number);
	} catch (InputMismatchException e) {
		System.out.println("잘못된 입력입니다.");
	}

		

	
	

	
	
	

	
	
	
	
	scanner.close();

	}// main

}// class
