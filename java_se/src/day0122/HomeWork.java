package day0122;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * 
 * 
 * * 숙제<br>
 * 1. Calendar 클래스를 사용하여 1월의 달력을 출력해보세요. <br>
 *    1 2 3 4 5 6 <br>
 * 7  8 9 10 11 12 13<br>
 * 14 15 16 17 18 19 20<br>
 * 21 22 23 24 25 26 27<br>
 * 28 29 30 31<br>
 * 
 * 2. 매개변수로 년,월을 입력받아 해당 년,월에 대한 마지막일 까지를 일차원 배열에 할당하여 반환하는 일을 하는 method를 작성해
 * 보세요.<br>
 * (마지막 일을 하는 method를 찾아볼 것 - LocalDate클래스를 사용해 볼 것)
 * 
 * 
 * 
 * @author user
 */
public class HomeWork {

	public HomeWork() {

		Calendar cal = Calendar.getInstance();// 현재일자 정보
		cal.set(Calendar.MONTH, 0); // 현재월 0 -> 1월
		cal.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println(cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월");
		System.out.println("―――――――――――――――――――――――――――――");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "일", "월", "화", "수", "목", "금", "토");
		System.out.println("―――――――――――――――――――――――――――――");

		for (int tempDay = 1; tempDay < 32; tempDay++) {// 최대 31일까지
			cal.set(Calendar.DAY_OF_MONTH, tempDay); // 임시일자로 달력객체 설정
			if (cal.get(Calendar.DAY_OF_MONTH) != tempDay) {// 설정된 날짜가 현재일과 다르다면 반복문을 빠져나감
				break;
			} // end if
			if (tempDay == 1) { // 1일이라면
				for (int blank = 1; blank < cal.get(Calendar.DAY_OF_WEEK); blank++) {
					System.out.print("\t");
				} // end for
			} // end if

			System.out.printf("%-3d\t", tempDay);// 날짜 출력
			switch (cal.get(Calendar.DAY_OF_WEEK)) { // Calendar에서 요일을 가져와서 비교
			case Calendar.SATURDAY:
				System.out.println(); // 토요일이면 줄을 변경
			}
		} // end for

	}// HomeWork

	public static int[] getLastDayArray(int year, int month) {
		// 해당 월의 마지막 날짜를 구함
		LocalDate lastDayOfMonth = LocalDate.of(year, month, 1)
				.withDayOfMonth(LocalDate.of(year, month, 1).lengthOfMonth());

		// 배열 생성
		int[] lastDayArray = new int[lastDayOfMonth.getDayOfMonth()];

		// 배열에 날짜 할당
		for (int i = 0; i < lastDayArray.length; i++) {
			lastDayArray[i] = i + 1;
		}

		return lastDayArray;
	}

	public static void main(String[] args) {
		new HomeWork();
		System.out.println();
		System.out.println("―――――――――――――――――――――――――――――");

		int year = 2024; // 원하는 년도 입력
		int month = 1; // 원하는 월 입력

		int[] lastDayArray = getLastDayArray(year, month);

		System.out.println(year + "년 " +month + "월의 마지막 날짜 배열:");
		for (int day : lastDayArray) {
			System.out.print(day + " ");

		} // main
	}
}