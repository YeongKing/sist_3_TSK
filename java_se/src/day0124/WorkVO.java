package day0124;

public class WorkVO {

	private String name;
	private int java;
	private int oracle;
	private int sum ;
	private double avg ; 
	
	public WorkVO() {

	}
	
	
	public WorkVO( String name, int java, int oracle) {

		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.sum = java + oracle;
		this.avg = (sum/2.0);
	}




	public String getName() {
		return name;
	}


	public int getJava() {
		return java;
	}


	public int getOracle() {
		return oracle;
	}


	public int getSum() {
		return sum;
	}


	public double getAvg() {
		return avg;
	}
	
	
	
	


	
	
	
}
