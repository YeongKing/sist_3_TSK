package day0202_HomeWork;

//public class TabaccoException extends RuntimeException{//RuntimeException으로 만들 때
@SuppressWarnings("serial")
public class GugudanException extends Exception {// CompileException으로 만들 때

	public GugudanException() {

		super("2~9사이 숫자만 가능");

	}

	public GugudanException(String msg) {

		System.out.println(msg + "의 범위 혹은 데이터형식을 확인해주세요");

	}
	

	public GugudanException(int num) {

		System.out.println(num + "는 2~9 사이값이 아닙니다.");

	}

}
