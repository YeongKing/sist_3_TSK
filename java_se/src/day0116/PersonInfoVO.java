package day0116;

public class PersonInfoVO {

	private String name;
	private String address;
	private int age;

	PersonInfoVO() {

	}

	PersonInfoVO(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

}
