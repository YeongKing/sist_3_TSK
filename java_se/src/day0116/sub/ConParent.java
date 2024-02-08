package day0116.sub;

public class ConParent {

	public ConParent() {
		//this(2024);
		System.out.println("부모의 기본 생성자");
	}

	public ConParent(int i) {
		this();
		System.out.println("부모의 인자 생성자 " + i);

	}

}
