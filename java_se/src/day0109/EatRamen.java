package day0109;

/**
 * 숙제<br>
 * -아래의 대상을 추상화하여 클래스를 생성하고, 객체화하여 사용해보세요.<br>
 * - 너구리 , 신라면 , 안성탕면<br>
 * - 명사적 : - 동사적 :
 */
public class EatRamen {

	public static void main(String[] args) {

		Ramen ra1 = new Ramen();

		ra1.setPulp(2);
		ra1.setSoup(0);// 0개일 경우 1개으로 설정
		ra1.setHot("순한맛");
		ra1.setName("너구리");
		ra1.setNoodleStyle("유탕면");

		System.out.printf("%s의 맵기는 %s이고, 면종류는 %s입니다. 그리고 스프는 %d개, 건더기는 %d개 들어있습니다.\n", ra1.getName(), ra1.getHot(),
				ra1.getNoodleStyle(), ra1.getSoup(), ra1.getPulp());

		System.out.println(ra1.eatPlace("학교"));

	}

}
