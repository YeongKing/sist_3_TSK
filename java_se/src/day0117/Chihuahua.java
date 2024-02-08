package day0117;

/**
 * 치와와 클래스
 */
public class Chihuahua extends Dog {

	public Chihuahua() {

		

	}
	
	
	
	@Override
	public String bark() {
		return getKind() + "인 " + getName() + "가 귀엽게 \"멍멍\" 짖는다.";

	}



	@Override
	public String eat(String menu) {
		return getName() + "가 따뜻한 집에서 " + menu + "를 귀엽게 먹는다.";

	}

	
	
	
	
}
