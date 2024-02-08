package day0109;

/**
 *	Variable Arguments ( 가변 인수 - 파라메터는 하나이나 입력 값이 동적 )<br> 
 *	문법)<br>
 *	데이터형 ... 변수명
 */
public class UseVariableArguments {

	public void testVA(int ... i) {
	//parameter는 참조형 데이터 형인 배열로 처리된다.
	//System.out.println(i);
	//배열은 반복문으로 처리
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	}//testVA
	
	//V.A는 가장 마지막에만 정의할 수 있다.
	public void test(int i,char c, String s, double d,int...j) {
		
	}
	//public void test2(int i,char c, String s, int...j, double d) {//가변인수가 가장마지막에 와야하므로 에러 발생
	//}
	
	
	
	public static void main(String[] args) {
		
	UseVariableArguments uva = new UseVariableArguments();
		//V.A는 호출할 때 데이터형만 일치하면 값의 개수에 상관 없이 호출 가능
		//uva.testVA(2024);
		uva.testVA(2024,1,9,11,43);

		
		
		
		
	}//main

}//class
