package day0112;


/**
 * 문자열 클래스의 사용
 */
public class UseString2 {

	public static void main(String[] args) {

		String fileName = "Test.bat";
		
		System.out.println("파일명 : " + fileName.substring(0,fileName.lastIndexOf(".")));
		
	
		System.out.println("확장자 : " + fileName.substring(fileName.lastIndexOf(".")+1));
		

		String str = ""; //""로 초기화 => String 클래스에서 제공하는 instance method는 사용할 수 있다.
		String str1 = null; //null로 초기화 => String 클래스에서 제공하는 instance method는 사용할 수 없다.
		
		System.out.println(fileName+"는 비었니?" + fileName.isEmpty());
		System.out.println(str+"는 비었니?" + str.isEmpty());
		//System.out.println(str1+"는 비었니?" + str1.isEmpty());
		//null로 초기화된 객체의 method를 호출하면 error가 발생.
		
		
		str = "   A BC   ";
		String temp = str.trim();//문자열의 앞뒤 공백을 제거
		System.out.printf("[%s][%s]\n",str,temp);
		
		str = "Java Oracle JDBC JSON";
		//temp = str.replace("J","j");
		temp = str.replaceAll("J","j");
		System.out.println(str + " 변경된 문자열 " + temp);

		String msg = "나 지금 피씨방인데, 넌 어디니 ㅆㅣ 방새야?";
		String filter  = msg.replaceAll("씨","*").replaceAll("방", "*").replaceAll("ㅆ", "*");
		System.out.println(filter);
		
		
		
//		String msg1 = "ㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱ";
//		String filter1  = msg1.replaceAll("ㄱ","ㄴ").replaceAll("ㄴ", "ㄷ").replaceAll("ㄷ", "ㄹ");
//		System.out.println(filter1);
//		//동작방향  왼쪽 -> 오른쪽 ("ㄱ" -> "ㄹ")
		
		temp= msg.concat("데헷").replaceAll("씨방", "**").trim().toUpperCase();
		
		System.out.println(temp);
		
		msg = "내 전화번호는 010-1234-5678 내친구 전번은 010-2222-3333 내 나이는 20살";
		temp = msg.replaceAll("\\d", "*");
		System.out.println(temp);

		msg = "내 현재 전화번호는 010-1234-5678 내 친구 전번은 010-2222-3333\n" + 
			  "내 나이는 20살 이전 전화번호는 011-123-4567 태어난 해는 1995년\n" + 
			  "내 전화번호는 02-123-4567 아! 듀얼번호는 010-3345-7788\n";
		temp = msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})","***-****-**** \n");
		System.out.println(temp);
				
		msg = "내 현재 전화번호는 010-1234-5678 내 친구 전번은 010-2222-3333\n" + 
			  "내 나이는 20살 이전 전화번호는 011-123-4567 태어난 해는 1995년\n" + 
			  "내 전화번호는 02-123-4567 아! 듀얼번호는 010-3345-7788\n";
		temp = msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})","$1-xxxx-$3");
		System.out.println(temp);		
		
		msg = "전화번호는 010-1234-5678임";
		temp= msg.replaceAll("(\\d{3}-)\\d{1}(\\d{3}-\\d{4})", "$1x$2");
		System.out.println(temp);//010-x234-5678
		
		//문자열
		//문법
		// [] : 문자 Class,
		//정의되는 문자는 각가을 비교 : test => 문자열안에 't','e','s','t'하나를 각각 찾는다.(범위가 아님)
		//범위 : 소문자 a-z , 대문자 A-Z, 숫자 0-9, 한글 ㄱ-힣, 특수문자는 범위를 설정할 수 없다.
		
		
		// + : 하나 혹은 많이
		
		
		//test@sist.co.kr
		//test@sis.com
		
		//test : 메일주소 -> 로컬파트
		//sist.co.kr : 도메인주소 -> 도메인파트
		//sist : TLD(Top Level Domain)
		//com : gTLD(Generl Top Level Domain)-> 특정 국가를 가리지 않고 사용하는 도메인 (.com , .org , .net )
		//co.kr : ccTLD(Country Code Top Level Domain) : 국가 코드 최상위 도메인(특정 국가나 지역을 알려줌)
		
		msg = "내 이메일은 test@daum.net 과 Hello12 Java test@sist.co.kr";
		//temp= msg.replaceAll("[a-z]", "");//소문자
		//temp= msg.replaceAll("[A-Z]", "");//대문자
		//temp= msg.replaceAll("[0-9]", "");//숫자
		//temp= msg.replaceAll("[ㄱ-힣]", "");//한글
		//temp= msg.replaceAll("[da]", "");//범위 ( - )가 아니면 각각의 문자가 된다.
		temp= msg.replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}+", "");
		
		//temp= msg.replaceAll("[a-zA-z0-9._%+-]++@[a-zA-Z]++\\.[a-z]{2,}", "xxxx@xxx.xxx");

		System.out.println(temp);

		
		
		int i = 12;
		//temp = String.valueOf(i);
		temp = "" + i;
		System.out.println(temp);
		
		
		String csvData = "Java,Oracle,JDBC,HTML,CSS,JavaScript";
		//String[] arr = csvData.split(",");
		String[] arr = "Java,Oracle,JDBC,HTML,CSS,JavaScript".split(","); //위 주석과 결과가 같음
		
		System.out.println("arr.length : " + arr.length);
		System.out.println("-------------------");
		
		for(String data : arr) {
			System.out.println(data);
		}
	
		System.out.println("-------------------");
		String[] arr2 = "어쩔.저쩔.뇌절.안물.안궁.개킹받쥬".split("[.]");
		for(String data : arr2) {
			System.out.println(data);
		}//end for
		
		
		
		
	}//main

}//class
