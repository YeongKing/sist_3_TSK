package day1226;


//1. 지역변수 사용.

class UseLocalVariable{

	int i;//instance variable 

	//main method : 클래스를 단독으로 실행 시켜야 할 때 정의하는 method
	//단독으로 실행 가능한 프로그램 : java application
	public static void main(String[] args){

	//지역변수
	//1.선언 : 데이터형 변수명;
	int maxScore=100;//초기화값
	int myScore=0;
	System.out.print(myScore);//초기화되지 않은 변수를 사용하면 error 발생


	//2.값 할당 : 변수명 = 값;

	myScore = 80;

 
	//3.값 사용 : 출력

	System.out.print("최고점수 = " + maxScore+"점 \n내 점수 "+myScore + "점");	
	System.out.println();
	System.out.println("최고 점수간의 차이 : "+(maxScore-myScore)+"점");

	System.out.println();
	//2.값 할당을 여러번 할 수 있다.
	//같은 myScore지만 다른 값이 나올 수 있다.

	myScore = 95;

 
	//3.값 사용 : 출력

	System.out.print("최고점수 = " + maxScore+"점 \n내 점수 "+myScore + "점");	
	System.out.println();
	System.out.println("최고 점수간의 차이 : "+(maxScore-myScore)+"점");
	System.out.println();
	System.out.println();
	System.out.println();




	//1.올해를 저장할 수 있는 변수를 선언하고 초기값으로 올해를 할당.
	//2.자신의 나이를 저장할 수 있는 변수를 선언하세요.
	//3.2번의 변수에 자신의 나이를 할당하세요.	
	//4.두개의 변수를 사용하여 자신이 태어난 해를 연산하여 출력하세요.

	int year = 2023;
	int myAge = 27;
	int birthYear = year-myAge;
	System.out.println("올해 = " + year);
	System.out.println("내 나이 = " + myAge);
	System.out.println("태어난 해 = " + birthYear);





	//	int myScore = 10000;//변수 myScore은 이미 메인메서드 내에 선언 되어있음(Error)
	//영역이 같다면 같은 이름의 변수는 하나만 선언 가능

	//int i = 0;//영역이 다르므로 같은 이름의 변수를 선언할 수 있다.

	}//main	



}//class

//2.저장 : 클래스명.java (Hello.java)

//3.컴파일 : compiler 필요(javac.exe) javac 소스파일명.java

//4.실행 : 실행기 필요(java.exe) java bytecode명