package day1227;

/*
기본형 데이터 형 : 변수에 상수값을 저장하는 데이터 형 
*/




class PrimitiveDataType {
	public static void main(String[] args) {
	///////////정수상수를 저장할 수 있는 데이터형/////////
	byte a = 10;//byte는 -128 ~ +127
	//byte b = 128;//데이터 형은 저장할 수 있는 범위를 초과하면 error 발생
	short b = 10;
	int c = 10;
	long d =10L;

	System.out.println("byte : "+a + ", short : "+ b + ", int : " + c + ", long : " + d);
	//////////////////////////////////////////////////////////


	char e = 65;//'A';
	char f = 48;//'0';
	char g = 44032;//'가';
	char h = '\u0000';// unicode 0
	System.out.println("char : " + e + ", " + f + ", " + g + ", " + h);
	System.out.println("asdfjklal;jksdjal;fa;djlfdjl;k");
	
	//////////////////////////////////////////////////////////

	//float i = 12.27;//실수 리터럴은 기본 8byte 이고 float 형은 4byte이기 때문에
					//크기가 같지 않아서 값이 할당 될 수 없다.
	float i = 12.27f;// 8byte의 리터럴이 4byte로 축소되어 할당된다.
	float j = 12.28F;
	double k = 2023.12d;//기본 8byte이기 때문에 D,d 생략 가능

	System.out.println("float :" + i +" , " + j);
	System.out.println("double :" + k );

	///////////////////boolean////////////////////
	boolean l = true;
	boolean m = false;
	
	System.out.println("boolean : "+ l +" , " +  m);
	

	}//main
}//class
