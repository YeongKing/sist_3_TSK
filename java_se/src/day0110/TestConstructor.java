package day0110;

/**
 * 	생성자 연습.<br>
 * 	- 생성자는 직접 호출 불가능하고, new(객체 생성용 키워드)로만 호출 가능.
 * 	- 생성자를 반환형 없이, 클래스의 이름과 동일하게 생성.
 */
public class TestConstructor {
	
	
	/**
	 * 매개변수 없는 기본생성자!!
	 */
	public TestConstructor() {//instance 영역
		System.out.println("default constructor!! 기본 생성자");
	}//TestConstructor
	
	/**
	 * 매개변수 있는 생성자
	 * @param i
	 */
	public TestConstructor(int i) {
		System.out.println("overload된 constructor!! 생성자의 다형성");
	}
	
	public void test() { //instance method
		System.out.println("나는 test method");
		//TestConstructor();//생성자는 직접호출 불가능
		new TestConstructor();
	}//test
	
	public void temp() { //instance method
		System.out.println("나는 temp method");
		this.test(); //영역이 같다면 객체명 없이 직접 호출 가능
	}//temp
	
	
	

	public static void main(String[] args) {//static 영역
		//생성자 호출.
		TestConstructor tc = new TestConstructor();

		tc.temp(); 
		//temp()는 instance 영역 , main은 static 영역으로 영역이 다르기 때문에,
		//static 영역에서 instance 영역의 method를 호출하려면 객체화를 하여 호출한다.
		
		
		TestConstructor tc2 = new TestConstructor(2024);
		tc2.temp();
		
		
	}//main

}//class
