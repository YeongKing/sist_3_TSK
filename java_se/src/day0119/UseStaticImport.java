package day0119;

import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Integer.parseInt();//마지막에 method()에서 ()를 쓰면 error 발생
import static java.lang.Integer.parseInt;
//import static java.lang.Long.MAX_VALUE; // 같은 이름의 constant는 
//여러개 static import 할 수 있으나 아래의 코드에서 에러가 발생하게된다.
//자주자주 쓸 때에만 static import를 사용하고 그 외에는 지양한다.

import static java.lang.Math.random;
public class UseStaticImport {

	public static void main(String[] args) {

//		System.out.println(Integer.MAX_VALUE);
		System.out.println(MAX_VALUE);
		System.out.println(MAX_VALUE);

		
		String str = "2024";
		
//		System.out.println(Integer.parseInt(str));
		System.out.println(parseInt(str));
		System.out.println(parseInt(str));
		
		System.out.println(random());
		System.out.println(random());
		
	}//main

}//class
