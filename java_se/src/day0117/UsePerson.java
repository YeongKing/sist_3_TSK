package day0117;

/**
 * Person 클래스의 자식 클래스를 사용하기 위해서 만드는 클래스.<br>
 * 
 * 
 */
public class UsePerson {

		private void usePerson() {
			HongGilDong hgd = new HongGilDong();
			//코드의 재 사용성 : 부모클래스의 method, 변수를 내 클래스에 존재하는 것 처럼 사용.
			hgd.setName("홍길동");
			System.out.printf("눈 %d,코 %d,입 %d, 이름 %s\n",hgd.getEye(),hgd.getNose(),hgd.getMouth(),hgd.getName());
			
			
			System.out.println(hgd.fight(5));//6 -> 7
			System.out.println(hgd.fight(6));//7 -> 8
			System.out.println(hgd.fight(8));//8 -> 8
			System.out.println(hgd.fight(9));//8 -> 7
			System.out.println(hgd.getName() + "의 Level은 "+hgd.getLevel());
			
			
			System.out.println("---------------------------------------------------");
			
			Clark superman = new Clark();
			//코드의 재 사용성 : 부모클래스의 method, 변수를 내 클래스에 존재하는 것 처럼 사용.
			superman.setName("클락 켄트");
			System.out.printf("눈 %d,코 %d,입 %d, 이름 %s\n",superman.getEye(),superman.getNose(),superman.getMouth(),superman.getName());
			
			
			System.out.println(superman.power("다이아몬드"));// 10 -> 10
			System.out.println(superman.power("크립토나이트"));// 10 -> 0
			System.out.println(superman.power("짱돌"));// 0 -> 12
			System.out.println(superman.power);

			System.out.println("---------------------------------------------------");
			
			//코드의 재 사용성 : 부모 클래스에 존재하는 변수나 method를 자식클래스에서 사용하는 것.
			//자식의 객체명으로 사용하는 것. => 부모에서 제공하는 기능이 자식과 맞지 않는 상황발생!!
			System.out.println(hgd.eat());
			System.out.println(superman.eat());
			System.out.println(hgd.eat("뜨끈한 국밥",3));
			System.out.println(superman.eat("스테이크",10));
			
			System.out.println(hgd); //toString() method가 호출되었기 때문이다.
			System.out.println(superman); //toString() method가 호출되었기 때문이다.
			
			
			
			System.out.println("---------------------------------------------------");
//			
//			KimMuYeong muYeong = new KimMuYeong();
//			muYeong.setName("김무영");
//			System.out.printf("눈 %d,코 %d,입 %d, 이름 %s\n",muYeong.getEye(),muYeong.getNose(),muYeong.getMouth(),muYeong.getName());
//			System.out.println(muYeong.eat("맛있는음식") + " -> 배고픔 수치 : "+muYeong.hungry);
//			System.out.println(muYeong.eat("맛없는음식") + " -> 배고픔 수치 : "+muYeong.hungry);
//			System.out.println(muYeong.eat("보통음식") + " -> 배고픔 수치 : "+muYeong.hungry);
			
			
			System.out.println("---------------------------------------------------");

			System.out.println("추진력 : " + superman.drivingForce());
			System.out.println("양력 : " + superman.lift());
			
			
			
		}//usePerson
		
		

	public static void main(String[] args) {

UsePerson up = new UsePerson();
up.usePerson();

	}// main

}// class
