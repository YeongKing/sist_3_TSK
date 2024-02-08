package day0108;

/**
 * method의 형태:
 */
public class MethodType {

	// 고정 일 : 반환형 없고(void). 매개 변수 없는 형
	public void typeA() {
		System.out.println("고정 일");
	}// typeA

	public void typeB(int i) {
		System.out.println("가변 일 : " + i);
	}// typeB

	// 고정 값 : 반환형 있고, 매개변수 없는 형
	// 반드시 method의 가장 마지막줄에 return이 나와야한다.
	public  int typeC() {
		int i = 2024;
	
		return i;
	}// typeC
	
	//가변 값 : 반환형 있고, 매개 변수 있는 형
	public  int typeD(double d) {
	
		return (int)d;
	}// typeD

	public static void main(String[] args) {

		// 객체화 : 인스턴스 변수나 인스턴스 method를 사용하기 위해서
		// 클래스명 객체명 = new 클래스명();
		MethodType A = new MethodType();
		// 고정 일 method 호출 =>여러번 호출해도 같은 일 한다.
		A.typeA();
//		A.typeA();
//		A.typeA();
//		A.typeA();
//		A.typeA();

		// 가변 일 method호출 =>외부 인자(arguments)에 대해 다른 일을 수행

		A.typeB(0);
		A.typeB(1);
		A.typeB(2);
		A.typeB(3);
		A.typeB(4);
		
		// 고정 값 : 반환형에 일치하는 데이터형으로 변수를 만들고, 반환 값을 저장하여 사용한다.
		
		
		
		System.out.println(A.typeC());
		
		
		// 가변 값 : 반환형에 일치하는 데이터형으로 변수를 만들고, 반환 값을 저장하여 사용한다.
		
		int i = A.typeD(2024.01);
		System.out.println("가변 값 : " + i);
		 i = A.typeD(1.08);
		System.out.println("가변 값 : " + i);
		 i = A.typeD(5.8);
		System.out.println("가변 값 : " + i);
	}// main

}// class
