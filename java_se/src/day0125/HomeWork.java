package day0125;

import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 숙제 프로그램이 실행되면 현재 월의 달력을 만들어서 , JButton을 사용하여 보여주는 Window Application을 작성
 */
@SuppressWarnings("serial")
public class HomeWork extends JFrame {
	// 테스트를 위한 임시 작성.
	private int year;
	private int month;
	private int day;

	public HomeWork() {
		// 테스트를 위해 임시 날짜 지정
		this(2024, 12, 1);

	}

	public HomeWork(int year, int month, int day) {
		super("달력");
		this.year = year;
		this.month = month;
		this.day = day;

		Calendar cal = Calendar.getInstance();

		cal.set(year, month - 1, day); // 월은 -1해줘야 해당월로 인식

		////////////////////////////////////////////////////////////////////////////////////
		// 세로값 ,
		// System.out.println((cal.get(Calendar.MONTH) + 1) + "월의 세로값 : " + 
		//
		// 1일의 요일
		// System.out.println("1일의 요일 : " + getDayOfWeek(cal));
		//
		// 마지막일
		// System.out.println("마지막일 : " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		///////////////////////////////////////////////////////////////////////////////////

		int blankString = getDayOfWeek(cal) - 1; // 값이 2라면 1칸을 빈칸으로 만들어라.

		// 컴포넌트 생성
		JButton[] jbt = new JButton[verticalNum(cal) * 7];
		for (int i = 0, count = 1; i < jbt.length; i++) {

			if (i < blankString || count > cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
				jbt[i] = new JButton("");
			} else {
				jbt[i] = new JButton(Integer.toString(count++));
			}

		}
		// 레이아웃 설정
		setLayout(new GridLayout(verticalNum(cal), 7));

		// 컴포넌트 배치
		for (int j = 0; j < jbt.length; j++) {
			add(jbt[j]);
		}

		setBounds(0, 0, 1400, 1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// end HomeWork

	/**
	 * 
	 * 1일의 요일 반환 메서드
	 * 
	 * @param cal Calendar객체
	 * @return 1일의 요일 (1 : 일요일 /~~/ 7 : 토요일)
	 */
	private int getDayOfWeek(Calendar cal) {
		int tempCalDay = cal.get(Calendar.DAY_OF_MONTH);
		int result = 0;
		cal.set(Calendar.DAY_OF_MONTH, 1);

		result = cal.get(Calendar.DAY_OF_WEEK);
		cal.set(Calendar.DAY_OF_MONTH, tempCalDay);

		return result;
	}

	/**
	 * 
	 * 해당 월의 세로의 개수
	 * 
	 * @param cal Calendar 객체
	 * @return 해당 월의 세로 개수
	 */
	private int verticalNum(Calendar cal) {

		int tempCalYear = cal.get(Calendar.YEAR);
		int tempCalMonth = cal.get(Calendar.MONTH);
		int tempCalDay = cal.get(Calendar.DAY_OF_MONTH);

		int count = 1;
		int dayday = 0;

		for (int tempDay = 1;; tempDay++) {
			cal.set(Calendar.DAY_OF_MONTH, tempDay);
			dayday = cal.get(Calendar.DAY_OF_MONTH);
			if (dayday != tempDay) {// 설정된 일자와 임시일자가 같지않으면 요일의 끝이므로 반복한 필요 x
				// 월이 끝났기 떄문에 반복문을 빠져 나간다.
				break;
			} // end if

			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);// 설정된 일자의 요일얻기

			switch (dayOfWeek) { // Calendar에서 요일을 가져와서 비교
			case Calendar.SATURDAY:
				count++; // count++
			}

		}
		cal.set(tempCalYear, tempCalMonth, tempCalDay);

		return count;
	}

	public static void main(String[] args) {
		new HomeWork();

	}// main

}// Class
