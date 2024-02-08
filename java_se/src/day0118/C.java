package day0118;

/**
 *  C인터페이스의 부모는 A와 B이다
 */
public interface C extends A ,B{//인터페이스는 다중 상속이 가능
	public void methodC();
}
