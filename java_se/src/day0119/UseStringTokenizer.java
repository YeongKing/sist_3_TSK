package day0119;

import java.util.StringTokenizer;

/**
 * 문자열을 짧은 한 마디로(token) 분리할 때 사용하는 클래스
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {

		String data = "월요일 화요일 수요일 목요일 금요일 틜";

		// 데이터를 자르기위해 StringTokenizer에 할당
		StringTokenizer stk = new StringTokenizer(data);// 공백으로 자른다.
		// 토큰이 존재하는지 모르지만 존재한다면 현재 토큰을 얻고 포인터를 다음으로 옮긴다.
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());// 한번 진행하면 뒤로 가지 않는다.

		} // end while
		System.out.println("------------------------------------");
//		stk = new StringTokenizer(data);//공백으로 자른다.
		// 토큰은 다 추출하면 다음 번에 사용할 수 없다.
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());// 한번 진행하면 뒤로 가지 않는다.

		} // end while
		for (int i = 0; i < stk.countTokens(); i++) {
			System.out.println("토큰의 수 : " + stk.countTokens());
		}

		System.out.println("토큰의 수 : " + stk.countTokens());
		System.out.println("-------------------------------");

		// 특정 문자열로 구분하는 생성자 StringTokenizer(데이터, "기준문자열", 토큰보호여부(default : false)
		String data2 = "Java,Oracle~JDBC,HTML.CSS.JavaScript,javaScript Library";

		StringTokenizer sk2 = new StringTokenizer(data2, ",~. "); // ',' || '~' || '.' || ' ' -> 정규식처럼 사용 가능

		while (sk2.hasMoreTokens()) {// 현재 포인터 위치에서 토큰이 존재하는가?
			System.out.println(sk2.nextToken());

		} // end while
		
		System.out.println("---------------------------------");

	}// UseStringTokenizer
	

	
	
	
	
	

	public TokenDataVO csvData() {
		TokenDataVO tdVO = null;
		
		String data = "오늘은,불금.입니다.주말엔 역시 자바공부죠! 그쵸? 아닌가? 데헷";
		// 위의 문자열을 , 공백 . ! 로 구분하여 배열과 총 토큰 수를 반환하시오

		StringTokenizer st = new StringTokenizer(data, ", .!");

		
		int tokenCnt = st.countTokens();

		String[] temp = new String[tokenCnt];
		
		int i = 0;
		
		while(st.hasMoreTokens()) {
			
			temp[i] = st.nextToken();
			
			i++;
		}//end while

		tdVO=new TokenDataVO(temp,tokenCnt);
		

		return tdVO;
	}
	
	
	public void useCsvData() {
		//csvData method를 호출하여 배열에 담긴 값과 토큰 수를 출력해보세요.

		TokenDataVO tdVO = csvData();
		String[] temp = tdVO.getData();
		int cnt = tdVO.getCountToken();
		System.out.println("얻어낸 토큰 수 " + cnt);
		for(String value : temp) {
			System.out.println(value);
		}
		
		
	
		
		
		
		
	}

	public static void main(String[] args) {

		UseStringTokenizer ust = new UseStringTokenizer();
		ust.useCsvData();
		

	}// main

}// class