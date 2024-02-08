package day0109;

/**
 * MakerPen 클래스에서 제공하는 기능(일)을 사용하기 위한 클래스<br>
 */
public class UseMakerPen {

	public static void main(String[] args) {
		// 마카펜 클래스를 객체화
		MakerPen black = new MakerPen();

		System.out.println("주소 : " + black);
		// 변수에 값을 직접 할당 => 입력값을 체크하는 코드를 중복해서 만들어야 한다.
		black.setCap(10);
		black.setBody(10);
		black.setColor("그레이");
		System.out.printf("뚜껑의 수 %d개, 몸체의 수 %d개, 색 %s색\n", black.getCap(), black.getBody(),black.getColor());

		
		//클래스가 제공하는 기능 사용.
		String result = black.write("오늘은 눈 내리는 화요일!!");

		System.out.println(result);

	}// main

}// class
