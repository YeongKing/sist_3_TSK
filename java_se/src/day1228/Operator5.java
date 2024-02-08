package day1228;

/*
논리연산자
 일반논리 : 여러개의 관계연산자를 붙여서 연산할 때 사용.
 && (AND) - 전항과 후항이 모두 true일때 만 true 반환
 || (OR) - 전항과 후항이 모두 false일때 만 false 반환

비트논리 : 비트를 연산
& ( AND ) : - 상위비트와 하위 비트가 모두 1일때만 1내림.
| ( OR  ) : - 상위비트와 하위 비트가 모두 0일때만 0내림.
^ ( XOR ) : - 상위비트와 하위비트 둘 중 하나만 1인경우 1내림.
*/




class Operator5 {
	public static void main(String[] args)	{
	
	boolean flag = true, flag2 = false, flag3 = true, flag4 = false;

	System.out.println("-------------AND--------------");
	System.out.println(flag + " && " + flag3 + " = " + (flag && flag3));//true && true -> true
	System.out.println(flag + " && " + flag2 + " = " + (flag && flag2));//true && false -> false
	System.out.println(flag2 + " && " + flag3 + " = " + (flag2 && flag3));//false && true -> false    전항이 false이면 후항을 연산하지 않고 바로 false 출력
	System.out.println(flag2 + " && " + flag4 + " = " + (flag2 && flag4));//false && false -> false   전항이 false이면 후항을 연산하지 않고 바로 false 출력


	System.out.println("-------------OR--------------");
	System.out.println(flag + " || " + flag3 + " = " + (flag || flag3));//true || true -> true		  전항이 true이면 후항을 연산하지 않고 바로 true 출력
	System.out.println(flag + " || " + flag2 + " = " + (flag || flag2));//true || false -> true		  전항이 true이면 후항을 연산하지 않고 바로 true 출력
	System.out.println(flag2 + " || " + flag3 + " = " + (flag2 || flag3));//false || true -> true2
	System.out.println(flag2 + " || " + flag4 + " = " + (flag2 || flag4));//false || false -> false


	//%% : 전항이 false라면 후항을 연산하지 않는다.
	//|| : 전항이 true라면 후항을 연산하지 않는다.

	flag = false;
	flag2 = false;
	flag3 = false;

	flag3 = (flag=3<2) && (flag2 = 5<6) ; // 앞의 flag=3<2 가 false이므로 후항을 연산하지 않고 처음 입력한 값 false가 나옴
										  // 만약 후항을 연산 했다면 flag2 는 true가 되어야함.

	System.out.println(flag + " && " + flag2 + " = " + flag3); // false && false -> false가된다.



	//octalNum이 8진수의 범위라면 true를 그렇지 않다면 false를 출력해보세요. 

	int octalNum=((int)(Math.random()*10));//(0~9)
	System.out.println("octalNum = " + octalNum);

	
	if (((octalNum<8)&&(octalNum>=0))){
		
		System.out.println("true");

	}else{

		System.out.println("false");

		}

	
	int tel = 01012341234;//0으로 시작하는 수는 8진수.
	System.out.println("내 전화번호는 : " + tel);



	int tel1=150040838; // 10진수값
	System.out.println("내 전화번호는 : 0" + Integer.toOctalString(tel1) );// 8진수로 표현








	int i = 37, j = 14;
	System.out.println(i + " & " + j + " = " + (i & j));//결과
	System.out.println(i + " | " + j + " = " + (i | j));//결과
	System.out.println(i + " ^ " + j + " = " + (i ^ j));//결과








	}//main
}//class
