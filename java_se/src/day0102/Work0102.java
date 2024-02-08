package day0102;

public class Work0102 {

	public static void main(String[] args) {
	//문제 1.
	//1-1. 두 정수를 저장할 수 있는 변수를 만들고, 임의의 값을 할당한다.
	//1-2. 위의 변수 중의 큰 값을 반환하는 코드(삼항 연산자) 만들어보세요.
		int num1 = 7;
		int num2 = 1;
		
		System.out.println(num1>num2?num1:num2);
		
		
		
		
	
	//문제 2.
	//2-1. 세 개의 정수를 저장할 수 있는 변수를 만들고, 각각의 변수의 임의의 값을 할당한다.
	//2-2. 세 개의 숫자중 가장 작은 값을 찾아서 출력하는 코드를 만들어 보세요. (삼항 연산자)
		
		
		
		int num11 = 10;
		int num22 = 3;
		int num33 = 5;
		
		System.out.println((num11>num22?(num11>num33?num11:num33):(num22>num33?num22:num33)) + " : 가장 큰 값");
		System.out.println((num11<num22?(num11<num33?num11:num33):(num22<num33?num22:num33)) + " : 가장 작은 값");	
		System.out.println(((num11 < num22) && (num11 < num33)) ? num11 : (num22 < num33 ? num22 : num33));
		
		
		
		
		
	//문제 3.
	//int temp1=10 , temp2=20이 할당된 변수를 선언하고 아래 코드를 작성했을 때
	//어떤 값이 출력되는지 예상해보고, 어떻게 그런 결과가 나왔는지 주석을 열고 간단히 작성.
		
		int temp1 = 10,temp2 = 20;

		
		System.out.println(++temp1 + temp2--);//11 + 20 = 31
		// temp1은 선위연산자에 의해 11가 되고 11이 출력되고, 
		// temp2는 후위연산자에 의해 20이 출력된 후 19가된다
		System.out.println("temp1 : " + temp1 + " temp2 : " + temp2  );
		//temp1 = 11 , temp2 = 19
		
		
		
	//문제 4.
	//Integer.MAX_VALUE Constant를 사용하여 Integer의 하위 2Byte값을 출력해보고
	//비트논리 연산자를 사용하여 출력해보세요. 결과 (65535가 나와야 한다.)
		
		
		System.out.println(Integer.MAX_VALUE & 65535);//65535
		System.out.println(Integer.MAX_VALUE & 0x0000ffff);//65535
		

		
		
		
	}

}
