package day0117;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UseAnnotation {

	@Deprecated
	public void test() {

		System.out.println("오늘은 수요일 입니다.");
		Date date = new Date();
		System.out.println(date.getYear() + 1900);

	}// test

	@SuppressWarnings({ "unused", "rawtypes" }) // 중괄호를 쳐서 배열화 가능하다.
	public void test2() {
//		new SimpleDateFormat("E요일")
		int day;
		int j;
		int k;

		// @SuppressWarnings("rawtypes")
		List list = new ArrayList();
	}

	// Override는 부모클래스가 가지고 있는 method를 자식 클래스에서 그대로 정의하는 것.
	@Override// 컴파일러에게 문법체크하도록 알림
	public String toString() {

		return "생성된 객체의 주소가 아닌 메시지";
	}

	public static void main(String[] args) {
		UseAnnotation ua = new UseAnnotation();
		ua.test();

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일");

		System.out.println(ua); // 내 객체 : 주소 > toString을 Override하면 내가 원하는 메세지가 나옴
		System.out.println(d); // 자바 제공 객체 : 메세지
		System.out.println(sdf); // 자바 제공 객체 : 주소
	}// main

}// class
