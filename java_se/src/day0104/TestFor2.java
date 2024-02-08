package day0104;

/**
 * 다중for : 인덱스를 두개 사용하여 반복해야할 때.<br>
 * 문법)<br>
 * for(초기값 ; 조건식 ; 증.감소식){<br>
 * 반복수행문장 // 단일 for의 영역<br>
 * for(초기값 ; 조건식 ; 증.감소식){<br>
 * 반복수행문장 // 다중 for의 영역 <br>
 * }<br>
 * * 반복수행문장 // 단일 for의 영역<br>
 * }<br>
 */
public class TestFor2 {

	public static void main(String[] args) {

		// 다중 for의 동작 : 바깥 for가 한번 반복할 때, 안쪽 for는 몇 번 반복하는가?
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i : " + i + ", j : " + j);
			} // end for
			System.out.println("--------------------------------");
		} // end for

		// 구구단
		for (int i = 2; i < 10; i++) {

			for (int j = 1; j < 10; j++) {

				System.out.println(i + " * " + j + " = " + (i * j));
			} // end for
			System.out.println("-----------");
		} // end for

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(i + " " + j + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		//안쪽 for의 시작이 바깥 for의 현재보다 1큰 지점에서 반복
		
		for (int i = 0; i <= 4; i++) {
			for (int j = i+1; j <=5 ; j++) {
				System.out.print(i + " " + j + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		
		
		//1
		//23
		//456
		//78910
		int sum = 0;
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j < i; j++) {
				sum++;
				System.out.print(sum + " ");
				
			}
			System.out.println();
		}
		
		

	}// main

}// class
