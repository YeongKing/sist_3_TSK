package day1227;

/*
강제형변환 : 개발자가 필요한 데이터 형으로 일시적 변환을 하는 것.
 -원본 값은 유지되지만, 상황에 따라 값 손실이 발생할 수 있다.
 -기본형에서 참조형으로 , 참조형에서 기본형으로는 casting 될 수 없다.
 -boolean은 동일형으로만 casting 될 수 있다.
*/




class Casting {

	//System.out.println("sadasdsda");

	public static void main(String[] args) {

	
	double d = 2023.12;
	
	
	//int i = d; // 크기와 값의 종류가 다르므로 error 발생
	//casting 문법 : (변환할데이터형)값;
	int i=(int)d; //실수가 정수로 변환되니 값손실이 발생하게 된다.(.12 손실)
	System.out.println("원본 값 "+d+" , casting한 값 : " + i);

	float f = (float)1.23456789; //리터럴의 값을 4byte로 변환하여 할당
	System.out.println(f);
	

	byte num1 = 10;
	byte num2 = 20;
	byte result = 0;

	result = (byte)(num1 + num2);//casting을 통해서 연산결과를 result 변수에 할당
	System.out.println(num1 + " + " + num2 + " = "  + result);

	char c = '0';//문자 0
	System.out.println(c + " 의 unicode는 " + (int)c);

	//boolean은 boolean으로만 casting이 가능하다.
	boolean b = true;
	boolean b1 = (boolean)b;//아무 의미없음.

	System.out.println(b + " , " + b1 );

	//int ii  = (int)b; //다른 형으로는 casting 불가능.

	//기본형 참조형으로 , 참조형을 기본형으로는 casting 불가능.
	
	/* error
	int today = 27; // int : 기본형 데이터형
	String strToday = today;//String : 참조형 데이터형
	*/


	/* error
 	String strToday="27";//참조형

	int intToday = strToday;//기본형
	*/

	





	


	}
}
