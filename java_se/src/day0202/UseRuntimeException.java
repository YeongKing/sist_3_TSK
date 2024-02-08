package day0202;

public class UseRuntimeException {

	public static void main(String[] args) {

		// main method의 arguments를 두개 입력받아 나눈 연산을 수행한 후
		// 결과를 보여주는 일.
//		
//		try {
//			int num;
//			int num2;
//			int result;
//			try {
//				num = Integer.parseInt(args[0]);
//				num2 = Integer.parseInt(args[1]);
//
//				try {
//					result = num / num2;
//					System.out.println(num + " / " + num2 + " = " + result);
//
//				} catch (ArithmeticException ae) {
//
//					System.out.println("나누는 값이 0이될 수 없음.");
//
//				}
//
//			} catch (NumberFormatException nfe) {
//
//				System.out.println("인자값의 형식이 잘못되었음");
//			}
//		} catch (ArrayIndexOutOfBoundsException aioobe) {
//			System.out.println("아무것도 입력되지 않았습니다.");
//
//		}
//

		int num;
		int num2;
		int result;

		try {

			num = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);

			result = num / num2;
			System.out.println(num + " / " + num2 + " = " + result);

		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.err.println("실행법)java UseRuntimeException 값 값");
			System.err.println("간단한 메시지 : " + aioobe.getMessage());
			System.err.println("예외클래스와 메시지 : " + aioobe);
			aioobe.printStackTrace();//자세한 메시지

		}
		 catch (NumberFormatException nfe) {
				System.err.println("값은 숫자이어야 합니다.");
				System.err.println("간단한 메시지 : " + nfe.getMessage());
				System.err.println("예외클래스와 메시지 : " + nfe);
				nfe.printStackTrace();//자세한 메시지

		 }
		 catch (ArithmeticException ae) {
				System.err.println("0으로 나눌 수 없습니다.");
				System.err.println("간단한 메시지 : " + ae.getMessage());
				System.err.println("예외클래스와 메시지 : " + ae);
				ae.printStackTrace();//자세한 메시지

		 }catch(Exception e) {//부모는 모든 예외를 잡아 줄 수 있다.
			 e.printStackTrace();
			 
		 }finally {
			 System.out.println("반드시 실행될 코드정의");
			 
		 }//end finally
			
	}// main

}// class
