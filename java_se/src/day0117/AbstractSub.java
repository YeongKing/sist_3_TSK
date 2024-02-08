package day0117;

/**
 * abstract class를 구현한 class<br>
 * 부모 클래스의 모든 abstract method를 Override해야한다.(강제성)
 */
public class AbstractSub extends AbstractSuper {

	public AbstractSub() {
		System.out.println("자식의 생성자");
	}// AbstractSub



	@Override
	public String msg() {
		// TODO Auto-generated method stub
		return "Override한 method!!!";
	}

	@Override
	public String msg(String msg) {
		// TODO Auto-generated method stub
		//부모의 msg는 추상 메서드로 body가 없어 호출 될 수 없다.
		//super.msg("안녕"); //추성 클래스의 메서드는 직접 호출할 수 없다.(몸통이 없음)
		return msg + " 입니다.";
	}

	public static void main(String[] args) {
		//자식클래스가 생성되면 부모클래스 부터 생성된다. ( 이때에만 객체화 가능 )
		//new AbstractSuper(); //직접적으로 abstract class를 생성할 수 없다.
		AbstractSub as = new AbstractSub();
		System.out.println(as.msg());	
		System.out.println(as.msg("수요일"));	
	
		
		
		
		
	}// main
	
	
	
	
	
}// class
