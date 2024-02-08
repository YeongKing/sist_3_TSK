package day0118;


/**
 * java.lang.Math 클래스의 사용<br>
 * 객체생성을 하지 않고, 제공되는 기능을 사용하는 클래스<br>
 */
public class UseMath {
	public UseMath() {
//		Math m = new Math(); //생성자가 존재하지 않으므로 객체화 할 수 없다.
		
		double d = Math.abs(-2024.1);
		int i = Math.abs(-2024);
		
		System.out.println(d+", " + i);
		
		d=10.6;
		long l = Math.round(d);
		System.out.println(d + ", "+ l);
		
		d = 10.01;
		System.out.println(Math.ceil(d));
		
		d = 10.9;
		System.out.println(Math.floor(d));
		
		d = 12.3456;
		System.out.println((int)d);
		
		double num = Math.random();
		System.out.println("발생한 난수 : " + num);
		System.out.println("범위의 난수 : " + num * 10);// 0~9RKwl 10개의 난수
		System.out.println("범위의 난수 : " + (int)(num * 10));// 0~9 까지의 10개의 난수
		System.out.println("범위의 난수 : " + (int)(num * 10+1));// 1~10 까지의 10개의 난수
		
		
		char[] randomUpperCase = new char[8];		
		//위의 배열에 무작위의 알파벳 대문자를 입력해보세요
		//24개
		for (int j = 0; j < randomUpperCase.length; j++) {
			
			randomUpperCase[j] = (char)(Math.random()*26+65);
		}
		
		for (int j = 0; j < randomUpperCase.length; j++) {
			
			System.out.print(randomUpperCase[j] + " ");
			//char[]은 주소가 아닌 문자열이 나옴
		}
		
		
	}//기본 생성자
	
	public static void main(String[] args) {

		new UseMath();
		
	}//main

}//class
