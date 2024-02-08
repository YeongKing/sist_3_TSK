package day0118;

/**
 * nested class<br>
 * 안쪽 클래스를 static 변수처럼 사용할 때. ( 객체화 없이 직접 사용할 때 )<br>
 * 
 */
public class NestedOutter {
	int outI; // 객체의 크기에 포함
	static int outJ; // 객체의 크기에 포함되지 않음.
	
	public NestedOutter() {
		System.out.println("바깥클래스의 생성자");
	}//기본생성자
	
	public void outInsMethod() {
		
		System.out.println("바깥클래스의 인스턴스 method");
	}//outInsMethod()
	
	public static void outStaMethod() {
		
		System.out.println("바깥클래스의 스테틱 method");

	}//outStaMethod()
	
	////////////////////////////////////////nested Class 시작//////////////////////////////////////////////
	static class Inner{//NestedOutter$Inner.class
		//생성자를 만들지 않는다.(객체화 시키지 않음)
		//변수나 method는 static으로 만들어 객체없이 사용하도록 한다
		
		static int inI;
	
		public static void inMethod() {
			System.out.println("안쪽 클래스의 method");
//			outI = 10; //instance 영역의 변수는 사용할 수 없다. ->메모리저장영역을 침범할 수 없다 ( static , stack , heap)
//			outInsMethod(); //instance 영역의 method는 사용할 수 없다.
			outJ = 20;
			//NestedOutter.outStaMethod(); // 아래와 같음 
			outStaMethod();
		}
	}
	////////////////////////////////////////nested Class 종료//////////////////////////////////////////////
	
	
	
	
	
	public static void main(String[] args) {
		Inner.inMethod();//Nested class는 객체 없이 클래스명으로 직접 사용할 수 있다.

		
		
		
		
	}// main

}// class
