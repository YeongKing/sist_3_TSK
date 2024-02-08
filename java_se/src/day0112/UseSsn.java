package day0112;

public class UseSsn {

	public static void main(String[] args) {


		String ssn = "960320-134567";
		Ssn s1 = new Ssn(ssn);
		
		System.out.println(s1.getSsnNumber());
		
		System.out.println(s1.lengthCheck());
		System.out.println(s1.deshCheck());
		System.out.println(s1.changeBirth());
		System.out.println(s1.checkSex());
		System.out.println(s1.checkZodiac());
		System.out.println(s1.age());
		
		System.out.println("---------------------------------------------");
		
		
		s1.setSsnNumber("930128-2234567");
		
		System.out.println(s1.getSsnNumber());
		System.out.println(s1.deshCheck());
		System.out.println(s1.changeBirth());
		System.out.println(s1.checkSex());
		System.out.println(s1.checkZodiac());
		System.out.println(s1.age());
		
		
	}//main

}//class
