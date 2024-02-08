package day0111;

/**
 * this를 사용한 클래스내 다른 생성자 호출.
 */
public class ThisConstructor {

	ThisConstructor() {
		//this(11);
		System.out.println("기본 생성자");
	}// ThisConstructor

	ThisConstructor(int i) {
		this();//생성자의 첫번째 줄에서만 사용할 수 있다.
		System.out.println("매개변수 있는 생성자 " + i);
	}// ThisConstructor

	public static void main(String[] args) {

		System.out.println(new ThisConstructor(2024));

		
		
		
	}// main
}// class
