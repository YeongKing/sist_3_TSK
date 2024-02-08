package day0207;

import java.io.Serializable;


/**
 * 직렬화 방지 키워드 : transient
 */

public class UserData  implements Serializable {
	
	


	/**
	 * 
	 */
	private static final long serialVersionUID = -6305979410790805138L;
	
	//참조형 데이터형은 직렬화가 되지 않음. Serializable 과 transient를 같이 쓰면
	//transient를 우선한다
	
	
	
	private  transient String name ; //참조형 데이터형은 직렬화가 되지 않음
	private  double height ; //기본형 데이터형은 직렬화가 지원된다.
	private  transient double weight ;
	

	public UserData(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}//getName

	public double getHeight() {
		return height;
	}//getHeight

	public double getWeight() {
		return weight;
	}//getWeights
	
	
	
	
	
}// class
