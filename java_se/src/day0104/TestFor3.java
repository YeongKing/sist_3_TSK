package day0104;

/**
 * 다양한 for의 형태.<br>
 * 
 * -무한 루프<br>
 * for( 초기값 ; ;증.감소식){<br>
 * 
 * }<br>
 * for( ; ; ){<br>
 * }<br>
 */
public class TestFor3 {

	public static void main(String[] args) {

//		test : for(int i = 0 ; ;i++) {
//			System.out.println("i = " + i);
//			if(i==50) {
//				System.out.println("i = " + i + "이므로 탈출");
//			break test;
//			}
//		}//end for

		
		
		
		
//		for (;;) {
//
//			System.out.println("무한루프");
//		}//end for

		
		// 여러개의 초기 값을 가진 for
		for(int i = 0,j=10,k=100 ; i <10 ; i++, j+=100,k--) {
			System.out.println("i : " + i + ", j : " + j + ", k : " + k);
		}
		System.out.println("----------------------------------------");
		
		//1에서부터 100까지 홀수만 출력
		for (int i = 1; i < 101; i++) {
			
			if(i%2==0) {
				continue;
			}//end if
			System.out.print(i + " ");
			
			
		}
		

		
		
		
		
		
	}// main

}// class
