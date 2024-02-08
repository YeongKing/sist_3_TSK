package day1227;

class Exam1227_1 {

	public static final int ALLOWANCE = 1000000;
	public static final int BASE_DAY = 20;


	public static void main(String[] args) 	{





	/*
	출력.
	1. 한달 용돈은 xxxx(constant)원 하루 용돈은 20(constant)일 기준으로 xxx(연산)원 입니다.
	하루 지출은 편도 교통비 xxx(변수)원 왕복교통비 xxxx(연산)원 점심 식대 xxx(변수)원으로
	총 xxx(연산)이 지출됩니다.

	한달이 지나면 잔액은 xxxx(연산)원 입니다.

	*/
		int oneWayFee = 1400;
		int foodCosts = 7500;

	


		System.out.println("한달 용돈은 " + Exam1227_1.ALLOWANCE + "원 하루 용돈은 " + Exam1227_1.BASE_DAY + "일 기준으로 " + (Exam1227_1.ALLOWANCE/Exam1227_1.BASE_DAY)+"원 입니다.");
		System.out.println("하루 지출은 편도 교통비 " + oneWayFee + "원 왕복교통비 " + (oneWayFee*2) + "원 점심 식대 " + foodCosts + "원으로 총 "+ ((oneWayFee*2)+ foodCosts) +"이 지출됩니다.");
		System.out.println("한달이 지나면 잔액은 " + (Exam1227_1.ALLOWANCE - ((oneWayFee*2)+ foodCosts)*Exam1227_1.BASE_DAY) + "원 입니다.");

		System.out.println();


	/*

	2.API에서 wrapper class를 찾아보고, 최대 값과 최소 값을 가지고 있는 Constant가
	  존재하는지 확인 한 후, Constant가 존재한다면 아래와 같이 출력해 보세요.

	  출력 예)
	  byte 최소값 -128 최대값 127
	  short
	  int
	  long
	  float
	  double
	  char

	*/

	System.out.println("Byte의 최고값 : "+ Byte.MAX_VALUE + ", 최저값 : " + Byte.MIN_VALUE);
	System.out.println("Short의 최고값 : "+ Short.MAX_VALUE + ", 최저값 : " + Short.MIN_VALUE);
	System.out.println("Integer의 최고값 : "+ Integer.MAX_VALUE + ", 최저값 : " + Integer.MIN_VALUE);
	System.out.println("Long의 최고값 : "+ Long.MAX_VALUE + ", 최저값 : " + Long.MIN_VALUE);
	System.out.println("Float의 최고값 : "+ Float.MAX_VALUE + ", 최저값 : " + Float.MIN_VALUE);
	System.out.println("Double의 최고값 : "+ Double.MAX_VALUE + ", 최저값 : " + Double.MIN_VALUE);
	System.out.println("Character의 최고값 : "+ (int)(Character.MAX_VALUE) + ", 최저값 : " + (int)(Character.MIN_VALUE));

	




	}//main
}//class
