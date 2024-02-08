package day0108;

/**
 * instance method <br>
 * - instance variable를 사용하여 업무를 처리해야할 때 <br>
 * - 객체화 후에 객체명으로 method를 호출
 */
public class TestInstanceMethod {

	int day; // instance variable

	public void printDay() {
		System.out.println(day + "일");
	}// printDay	
	

	
	
	public static void main(String[] args) {
		//TestInstanceMethod.printDay();
		//instance method는 class명으로 호출 불가 // =>instance화 후 객체명.메소드명으로 호출
		
		TestInstanceMethod tim = new TestInstanceMethod();
		
		tim.day = 8;// instance variable의 사용
		
		
		//instance method 호출
		tim.printDay();
		
		tim.day++;
		
		tim.printDay();
		
		
		
		
		
		
	}// main

}// class
