package day1228;

/*

단항 연산자 : 연산에 필요한 항이 하나인 연산자.
~, !, +, -, ++, --

*/



class Operator1{
	public static void main(String[] args) 	{
		
	//~ : tilde(틸드) -1의 보수 연산
	//~양수 : 부호변경 1증가, ~음수 :부호변경 1감소
	int i= 10, j = -10;
	System.out.println("~" + i + " = " + ~i);//-11
	System.out.println("~" + j + " = " + ~j);//9

	
	//~를 사용하여 부호만 부호만 변경하고 싶다. -10으로 만들어보세요
	System.out.println(~i);//-11
	System.out.println(~i+1);//-10
		}
	}

