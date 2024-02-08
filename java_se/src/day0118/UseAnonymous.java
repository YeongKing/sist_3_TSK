package day0118;

import day0117.Clark;

/**
 * 
 */
public class UseAnonymous {

	public void testFly(Fly fly) {
		// fly(객체다형성)는 어느때에는 FlyImpl되고, 어느때에는 Clark이 될 수 있다.
		System.out.println("추력 : " + fly.drivingForce());
		System.out.println("양력 : " + fly.lift());
	}// testFly

	public static void main(String[] args) {

		// testFly method를 호출
		UseAnonymous ua = new UseAnonymous();
		ua.testFly(new FlyImpl());
		System.out.println("-------------------");
		new UseAnonymous().testFly(new FlyImpl());
		
		System.out.println("-------------------");
		new UseAnonymous().testFly(new Clark());
		
		System.out.println("-------------------");

		ua.testFly(new Fly() {// {} : 이름없는 클래스
			//클래스 파일(소스코드)를 별도로 만들지 않고, 객체를 생성하여 arguments값을 할당할 때.
			//딱 한번만 클래스가 불릴때는 좋은 방법이지만
			//여러번 불리게 된다면 class 파일을 생성해서 사용하는게 좋다.
			@Override
			public String drivingForce() {

				return "추추추추추추추력";
			}

			@Override
			public String lift() {
				return "야아아아아앙력";
			}

		});

	}// main

}// class
