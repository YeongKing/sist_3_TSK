package day1228;


/*
산술 연산자 : +, -, *, /, %
*/



class Operator2{
	public static void main(String[] args)	{
		
		int i = 10;
		System.out.println(i+"를 2로 나눈 나머지 : "+ (i % 2));
		//0 또는 1나옴

		i = 11;
		System.out.println(i+"를 2로 나눈 나머지 : "+ (i % 2));
		//0 또는 1나옴

	    i = 97865465;
		System.out.println(i+"를 2로 나눈 나머지 : "+ (i % 2));
		//0 또는 1나옴


		int birth = 1996;
		System.out.println(birth + "를 12로 나눈 나머지 : "+ (birth % 12));
		//0-원숭이,1-닭,2-개,3-돼지,4-쥐,5-소,6-호랑이,7-토끼,8-용,9-뱀,10-말,11-양


		//정수 / 정수 = 정수
		int num = 10;
		int num2 = 3;
		System.out.println(num + " / " + num2 + " = " + (num / num2));

		//정수 / 실수 = 실수 : 연산 결과를 실수로 얻으려면 나누는 수 중 하나는 
		//실수 이어야 한다.

		System.out.println(num + " / " + num2 + " = " + (num / (double)(num2)));


	}//main
}//class
