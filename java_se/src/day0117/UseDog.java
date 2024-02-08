package day0117;

public class UseDog {

	 UseDog() {
		Chihuahua chihuahua = new Chihuahua();
		chihuahua.setName("와와");
		System.out.println(chihuahua.bark());
		System.out.println(chihuahua.eat("사료"));
		System.out.println("-------------------------------------------");
		Malamute malamute = new Malamute();
		malamute.setKind("말라뮤트");
		malamute.setName("말라");
		System.out.println(malamute.bark());
		System.out.println(malamute.eat("생고기"));
		
		
		
	}
	
	public static void main(String[] args) {

		UseDog ud = new UseDog();
		
		
	}//main

}//class
