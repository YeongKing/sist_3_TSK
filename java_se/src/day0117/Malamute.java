package day0117;

public class Malamute extends Dog {

	@Override
	public String bark() {
		
		return getKind() + "인 " + getName() + "가 무섭게 \"크르르르릉\" 짖는다.";
	}

	@Override
	public String eat(String menu) {
		return getName() + "가 추운 밖에서 " + menu + "를 허겁지겁 먹는다.";

	}

	
	
}
