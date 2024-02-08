package day1228;

/*
진수 사용
*/





class Radix{
	public static void main(String[] args)	{

	int i = 10; //10진수
	int j = 012; //8진수
	int k = 0xA; //16진수
	int l = 0b100; //2진수
	//JVM 입장에서는 리터럴 값은 2진수로 저장되기 때문에  i j k l 을 합연산해도 문제되지 않는다.

	System.out.println(i + j + k + l);  //2진수를 연산하여 10진수로 나타내줌




	i = 0x25;
	System.out.println("0x25를 2진수로 : " + Integer.toBinaryString(i));
	System.out.println("0x25를 10진수로 : " + i);
	i = 0x1d;
	System.out.println("0x1d를 2진수로 : " + Integer.toBinaryString(i));
	System.out.println("0x1d를 10진수로 : " + i);
	i = 0xff;
	System.out.println("0xff를 2진수로 : " + Integer.toBinaryString(i));
	System.out.println("0xff를 10진수로 : " + i);


	




	}//main
}//class
