package day0118;


/**
 * 인터페이스를 구현하는 클래스. 
 */
public class SuperInterImpl implements SuperInter{

	
	


	/**
	 * 추상 메서드는 반드시 구현(Override)해야한다.
	 */
	@Override
	public String toDay() {
		
		return "오늘은 목요일 입니다.";
	}

	@Override
	public int getAge() {

		return 20;
	}

	public static void main(String[] args) {
		
		
		//인터페이스는 객체화 될 수 없다.
//		SuperInter is = new SuperInter();
		//구현 클래스가 생성되고 그 주소(객체)를 저장할 수 있다.
		SuperInter si = new SuperInterImpl();
		System.out.println(si);
		System.out.println(si.getAge()); // SuperInterImpl class에서 구현이 완료된 abstract method
		System.out.println(si.toDay()); // SuperInterImpl class에서 구현이 완료된 abstract method
		
		//JDK1.8이후 부터는 default method를 호출 가능.
		System.out.println(si.defMethod());// SuperInter 인터페이스에서 완성된 default method
		
		
		
		
	}//main
	
	
	
}//class
