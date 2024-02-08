package day0202;

import java.util.Random;

public class TestThrows {

	/**
	 * method에서 throws로 예외를 던지면, 호출한 곳에서 예외를 잡아 처리를 하게 된다. 예외 발생 예상 코드를 가진
	 * method안에서는 try~catch로 처리할 필요가 없다.
	 * 
	 * @throws ClassNotFoundException
	 */
	public void loadClass() throws ClassNotFoundException {

		String clsName = "java.lang.String";

		if (new Random().nextBoolean()) {
			clsName = "java.lang.String2";

		} // end if

		Class cls = Class.forName(clsName);
		System.out.println(cls + "클래스를 로딩하였습니다.");

	}// loadClass

	public static void main(String[] args) {

		TestThrows tt = new TestThrows();

		try {
			tt.loadClass();

		} catch (ClassNotFoundException e) {
			//비정상적일때의 코드
			e.printStackTrace();

		}//end catch
		

	}// main

}// class
