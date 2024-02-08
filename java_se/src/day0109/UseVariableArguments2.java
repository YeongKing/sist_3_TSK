package day0109;

/**
 * V.A를 사용하여 console에 출력하는 method<br>
 * System.out.format(), System.out.printf() - 출력 후 줄 변경을 하지 않는다.<br>
 * 
 * 
 * 
 */
public class UseVariableArguments2 {

	public static void main(String[] args) {

		int year = 2024, month = 1, day = 9;
		
		System.out.println("오늘은 "+ year+"년 "+month+"월 "+day+"일 입니다.");
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n",year,month,day);
		
		System.out.printf("정수 출력 : [%d][%5d][%-5d]\n",19,19,19);// %5d -> 오른쪽 정렬 , %-5d -> 왼쪽 정렬
		System.out.printf("문자 출력 : [%c][%5c][%-5c]\n",'A','A','A');// %5c -> 오른쪽 정렬 , %-5c -> 왼쪽 정렬
		System.out.printf("불린 출력 : [%b][%5b][%-5b]\n",true,true,true);// %5b -> 오른쪽 정렬 , %-5b -> 왼쪽 정렬
		System.out.printf("실수 출력 : [%f][%10.2f][%.5f]\n",2024.0109,2024.0109,2024.0109);
		System.out.printf("문자열 출력 : [%s][%10s][%-10s]\n","자바","자바","자바");
		
		String name = "김무영";
		
		int javaScore = 89;
		
		int oracleScore = 94;
		
		int htmlScore = 79;
		
		//아래와 같이 출력 (평균은 소수점 이하 1자리까지만 출력)
		//XXX님 JAVA SE xx점, Oracle xx점, HTML xx점
		//총점 : xx점 평균 xx점
		
		System.out.printf("%s님 JAVA SE %d점, Oracle %d점, HTML %d점\n총점 : %d점 평균 %.1f점",name,javaScore,oracleScore,htmlScore,javaScore+oracleScore+htmlScore,(javaScore+oracleScore+htmlScore)/3.0);
		
	}//main

}//class
