package day0110;

/**
 * Person 클래스를 사용하기 위해서 만드는 클래스.<br>
 * 
 * 
 */
public class UsePerson {

	private void usePerson() {
		Person ogong = new Person();// 사람이 태어난 것 ! => 기본적으로 가지고 있어야함
		//값을 가지지 않았다. => 객체가 생성될 때 기본적으로 가지고 있어야할 값을 설정하는 코드 작성
		
//		ogong.setEye(2); // 눈,코,입 설정
//		ogong.setNose(1);
//		ogong.setMouth(1);
		ogong.setName("손오공");

		System.out.printf("눈 %d개, 코 %d개, 입 %d개, 이름 %s, \n", ogong.getEye(), ogong.getNose(), ogong.getMouth(),
				ogong.getName());

		// 동사적인 특징 : Overloading
		System.out.println(ogong.eat());
		System.out.println(ogong.eat("돈가스",10000));
		
		////////////////////자신을 객체화하여 사용///////////////////////
		System.out.println("////////////////////////////////////////////////////////");
		Person muyeong = new Person();

		muyeong.setName("김무영");
		
		System.out.printf("눈 %d개, 코 %d개, 입 %d개, 이름 %s, \n", muyeong.getEye(), muyeong.getNose(), muyeong.getMouth(),
				muyeong.getName());
		
		System.out.println(muyeong.eat());
		System.out.println(muyeong.eat("지하식당",7500));
		
		//천진반 객체를 생성
		Person jinban = new Person(3,1,1);
		jinban.setName("천진반");
		
		System.out.println("////////////////////////////////////////////////////////");
		//동적인특징 : Overloading
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두",0));
		
		
	}// usePerson

	public static void main(String[] args) {

		UsePerson up = new UsePerson();
		up.usePerson();


	}// main

}// class
