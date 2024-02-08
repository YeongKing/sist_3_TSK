package day0116.sub;

public class ConChild extends ConParent{

	public ConChild() {
		//super();
		this(100);
		System.out.println("자식의 기본 생성자");

	}

	public ConChild(int i) {
		//this();
		super(100);

		System.out.println("자식의 인자 생성자 " + i);
	}

	
	public static void main(String[] args) {
		//new ConChild(10);
		new ConChild();
		
		//생성자에는 기본적으로 생성자의 가장 윗부분에 super(); 즉 부모의 기본생성자가 존재한다, 
		//허나 따로 매개변수를 지정해주면 그 매개변수에 해당하는 부모의 기본생성자로 이동한다.
		//부모 클래스의 기본생성자가 없고 매개변수를 가지는 생성자만 가지고 있을 경우
		//자바 컴파일러는 부모클래스의 매개변수를 가지는 생성자를 호출하기 위해서 
		//자식 클래스의 생성자들에게 부모클래스의 매개변수를 가지는 생성자 호출을 강요한다.
		
		//생성자에 this와 super를 적절하게 사용하여 아래와 같이 출력되도록 만들어보세요.
		//부모의 인자 생성자 2024 -> 부모의 기본 생성자 -> 자식의 기본 생성자 -> 자식의 인자 생성자 10
		//부모의 기본 생성자 -> 부모 인자의 생성자 100 -> 자식의 인자 생성자 100 -> 자식의 기본 생성자
		
	}
	
	
	
	
	
}
