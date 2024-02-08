package day0116;

/**
 * 사용자 정의 자료형( 분할된 여러 값들을 묶어서 저장할 수 있다.)<br>
 * 학생은 학번, 이름, 나이, 키, 몸무게, 이메일 의 정보가 저장되어야 한다.<br>
 * 업무를 구현하지 않고, 값을 저장하기 위해 만드는 <br>
 * 클래스, 사용자 정의 데이터 형으로 클래스를 만들 때에는 클래스명 뒤에 VO(Value Object)를 붙여준다.<br>
 */
public class StudentInfoVO {
	private int num;
	private String name;
	private int age;
	private double height;
	private double weight;
	private String email;

	/**
	 * 기본생성자 - 인스턴스 변수에 default value값이 할당되어 객체가 생성된다. 인스턴스변수에 값 변경은 setter method를
	 * 사용하여 변경한다.
	 */
	public StudentInfoVO() {

	}

	/**
	 * Overload된 생성자.<br>
	 * 객체를 생성할 때 default value가 아닌 사용자가 원하는 값으로 설정한 후 객체를 생성하는 생성자. 인스턴스변수에 값 변경은
	 * setter method를 사용하여 변경한다.<br>
	 * 
	 * @param num    학생의 번호
	 * @param name   학생의 이름
	 * @param age    학생의 나이
	 * @param height 학생의 몸무게
	 * @param weight 학생의 키
	 * @param email  학생의 이메일
	 */
	public StudentInfoVO(int num, String name, int age, double height, double weight, String email) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.email = email;

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {


	}

}
