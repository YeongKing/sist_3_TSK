package day1227;

/*
다른 클래스에 존재하는 Constant사용.




*/




class UseConstant {
	public static void main(String[] args) 	{




		//System.out.println("최고 점수 : "+ MAX_SCORE);
		System.out.println("최고 점수 : "+ Constant.MAX_SCORE + ", 최저점수 : "+ Constant.MIN_SCORE);//constant가 존재하는 class명.constant명

		System.out.println("Byte의 최고값 : "+ Byte.MAX_VALUE + ", 최저값 : " + Byte.MIN_VALUE);

		System.out.println("Integer의 최고값 : "+ Integer.MAX_VALUE + ", 최저값 : " + Integer.MIN_VALUE);



		


	}//main
}//class
