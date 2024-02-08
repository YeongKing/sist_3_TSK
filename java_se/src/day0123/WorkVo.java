package day0123;



public class WorkVo {

	private String name;
	private int java;
	private int oracle;
	private int sum;
	
	
	public WorkVo() {
		
		
		
	}
	
public WorkVo(String name, int java, int oracle) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.sum = java+oracle;
		
		
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
	
	
	
	
	
	
	
	
}
