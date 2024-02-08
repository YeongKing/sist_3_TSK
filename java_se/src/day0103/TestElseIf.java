package day0103;

/**
 * 다중 if ( else ~ if ) : 연관된 여러 조건을 비교할 때 사용<br>
 * 문법)<br>
 * 
 * if( 조건식 ){<br>
 * 조건에 맞을 때 수행할 문장 들...;<br>
 * }else if( 조건식 ){ <br>
 * 조건에 맞을 때 수행할 문장 들...;<br>
 * .<br>
 * .<br>
 * }else{<br>
 * 조건에 맞지 않을 때 수행할 문장 들....<br>
 * }<br>
 * 
 */
public class TestElseIf {
	

	
	

	public static void main(String[] args) {

		// *점수 판별
		// 점수는 0보다 작을 수 없고, 100보다 클 수 없다.
		// 0보다 작다면 "0보다 작아서 실패" 출력하고
		// 100보다 크다면 "100보다 커서 실패" 출력하고,
		// 그렇지 않다면(0~100 사이) "성공!!"을 출력

		int score = 70;

		System.out.print(score + "점은 ");

		if (score < 0) {
			System.out.println("0보다 작아서 실패");
		} else if (score > 100) {
			System.out.println("100보다 커서 실패");
		} else {
			System.out.println("성공");
		} // end else

		// char 형의 변수에는 임의의 문자가 할당 되어있다.
		// 할당된 문자가 대문자인지, 소문자인지, 숫자인지 그렇지 않다면 영어나 숫자가 아닙니다.
		// "영어나 숫자가 아닙니다."를 출력하는 코드를 작성

		char ch = 48;
		System.out.print(ch + "는 ");
		
		
		if (ch > 47 && ch < 58) {//숫자
			System.out.println("숫자입니다.");
		} else if (ch > 64 && ch < 91) {//대문자
			System.out.println("대문자입니다.");
		} else if (ch > 96 && ch < 123) {//소문자
			System.out.println("소문자입니다.");
		} else {//숫자, 대문자, 소문자 아닌 문자
			System.out.println("영어나 숫자가 아닙니다.");
		}

		
		//태어난 해를 저장하는 변수를 선언하고, 자신의 태어난 해를 할당한다.
		//태어난 해의 띠를 출력하세요.
		//0-원숭이, 1-닭, 2-개, 3-돼지, 4-쥐, 5-소, 6-호랑이, 7-토끼, 8-용,
		//9-뱀, 10-말, 11-양
		
		int year = 1996;
		System.out.print(year + "년생은 ");
		if(year%12 == Zodiac.MONKEY) {
			System.out.println("원숭이띠 입니다.");
		}else if(year%12 == Zodiac.ROOSTER) {
			System.out.println("닭띠 입니다.");
		}else if(year%12 == Zodiac.DOG) {
			System.out.println("개띠 입니다.");
		}else if(year%12 == Zodiac.PIG) {
			System.out.println("돼지띠 입니다.");
		}else if(year%12 == Zodiac.RAT) {
			System.out.println("쥐띠 입니다.");
		}else if(year%12 == Zodiac.OX) {
			System.out.println("소띠 입니다.");
		}else if(year%12 == Zodiac.TIGER) {
			System.out.println("호랑이띠 입니다.");
		}else if(year%12 == Zodiac.RABBIT) {
			System.out.println("토끼띠 입니다.");
		}else if(year%12 == Zodiac.DRAGON) {
			System.out.println("용띠 입니다.");
		}else if(year%12 == Zodiac.SNAKE) {
			System.out.println("뱀띠 입니다.");
		}else if(year%12 == Zodiac.HORSE) {
			System.out.println("말띠 입니다.");
		}else {
			System.out.println("양띠 입니다.");
		}

		
		
		
		
	}// main

}// class
