package day0110;

/**
 * polymorphism <br>
 * method overloading : 하나의 클래스 안에서 같은 이름의 method를 여러개 정의 하는 것.<br/>
 * 편의성
 */
public class TestOverloading {
	// 별 하나 출력

	
//  private int star(){// 접근제어자랑 반환형은 달라도 된다.
	public void star() {
		System.out.println("★");
	}

	// 입력되는 수만큼 별을 옆으로 출력하는 일
	public void star(int i) {

		for (int j = 0; j < i; j++) {
			System.out.print("★");

		}
		System.out.println();

	}

	public static void main(String[] args) {

		TestOverloading to = new TestOverloading();
		to.star();//overload된 메서드 호출
		to.star(10);//overload된 메서드 호출

	}// main

}// class
