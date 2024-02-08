package day0110;

public class UseDog {

	public UseDog() {
		Dog d1 = new Dog();
		d1.setName("멍멍이");
		String result = d1.bark();
		System.out.println(result);
		System.err.printf("이름은 %s이고, 눈은 %d개, 코는 %d개, 입은 %d개, 크기는 %s, 종류는 %s입니다.\n", d1.getName(), d1.getEye(),
				d1.getNose(), d1.getMouth(), d1.getSize(), d1.getKind());

		Dog d2 = new Dog(2, 1, 1, "중형견", "시베리안 허스키");
		d2.setName("허스키");
		result = d2.bark();
		System.out.println(result);
		System.err.printf("이름은 %s이고, 눈은 %d개, 코는 %d개, 입은 %d개, 크기는 %s, 종류는 %s입니다.\n", d2.getName(), d2.getEye(),
				d2.getNose(), d2.getMouth(), d2.getSize(), d2.getKind());

		Dog d3 = new Dog(2, 1, 1, "중형견", "시바견");
		d3.setName("시바");
		result = d3.bark();
		System.out.println(result);
		System.err.printf("이름은 %s이고, 눈은 %d개, 코는 %d개, 입은 %d개, 크기는 %s, 종류는 %s입니다.\n", d3.getName(), d3.getEye(),
				d3.getNose(), d3.getMouth(), d3.getSize(), d3.getKind());
	}

	public static void main(String[] args) {

		UseDog ud = new UseDog();

	}// main

}// class
