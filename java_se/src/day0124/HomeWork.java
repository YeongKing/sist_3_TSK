package day0124;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

/**
 * 숙제<br>
 * - InputDialog를 사용하여 아래와 같은 동작을 수행하는 프로그램을 작성하세요. 1.입력, 검색, 종료 메뉴를 받을 수 있는
 * Dialog를 제공한다.
 * 
 * 
 * 
 * //map , 출력에 사용(set, iterator) 사용 2.위의 Dialog에서 "1"이 입력 되면 학생번호,이름,자바,오라클 점수를
 * 입력 받을 수 있는 InputDialog를 제공한다. CSV형식의 데이터를 입력받아, 학생의 번호가 존재한다면 "이미존재하는 번호입니다".
 * 를 MessageDialog에 보여주세요
 * 
 * 3. 1번 메뉴에서 2번이 입력되면 저장된 모든 값을 console에 출력하는 코드 작성 번호 이름 자바점수 오라클점수 합계 평균 1
 * xxx 90 90 180 90.xx
 * 
 * 
 * 4. 1번메뉴에서 "3"이 입력되면 프로그램을 종료합니다.
 * 
 * 
 * 
 */

public class HomeWork {
	public static final int INPUT = 1;
	public static final int PRINT = 2;
	public static final int EXIT = 3;

	Map<Integer, WorkVO> map;

	private HomeWork() {
		map = new HashMap<Integer, WorkVO>();

	}

	private void program() {
		program: while (true) {
			String inputNumber = JOptionPane.showInputDialog("메뉴\n1.입력 2.검색 3.종료");

			// INPUT , PRINT , EXIT , null , "" 의 값 이외에 다른 값이 들어가는 검사
			if (isValidCondition(inputNumber)) {
				try {
					if (!inputNumber.equals("")) {
						if (Integer.parseInt(inputNumber) == EXIT) {
							// inputData의 입력값 null , 3일 경우 프로그램 종료

							JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
							break;
						} else if (Integer.parseInt(inputNumber) == INPUT) {
							handleCSVInput();// 입력창으로 이동
							continue;
						} else if (Integer.parseInt(inputNumber) == PRINT) {
							printData();// 출력창으로 이동
						}
					} else {
						JOptionPane.showMessageDialog(null, "아무것도 입력하지 않으셨습니다. 메뉴로 돌아갑니다.");
					}
				} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
					break;
				}

			} // end if

		} // end while

	}// program

	@SuppressWarnings("null")
	private void handleCSVInput() {// 입력작업

		String inputData = JOptionPane.showInputDialog("학생의 정보를 아래와 같이 입력해주세요.\n예)학생번호,이름,자바점수,오라클점수");
		if (!((inputData == null)||inputData.equals(""))) {

			StringTokenizer st = new StringTokenizer(inputData, ",");

			if (st.countTokens() == 4) { // 학생번호 , 이름 , 자바점수 , 오라클 점수

				int nameNum = isValidInteger((st.nextToken()));

				String name = st.nextToken();

				int java = isValidInteger((st.nextToken()));

				int oracle = isValidInteger((st.nextToken()));

				if (!map.containsKey(nameNum)) {// 학생번호 , 자바 점수, 오라클 점수에 대한 유효성 검사 추가하기
					if (java >= 0 && java <= 100 && oracle >= 0 && oracle <= 100) {
						map.put(nameNum, new WorkVO(name, java, oracle));
					} // end if
				} else {
					JOptionPane.showMessageDialog(null, "이미 존재하는 번호입니다.");

				} // end else

			} else {
				JOptionPane.showMessageDialog(null, "학생번호 , 이름 , 자바점수 , 오라클 점수 형식으로 다시 입력해주세요.");
			}// end else
			
		} else if(inputData.equals("")){
			JOptionPane.showMessageDialog(null, "아무것도 입력하지 않으셨습니다. 메뉴로 돌아갑니다.");
	} //else {
//			
//			JOptionPane.showMessageDialog(null, "아무것도 입력하지 않으셨습니다. 메뉴로 돌아갑니다.");
//		}
		
	}// handleCSVInput

	private void printData() {// 출력작업

		Set<Integer> keySet = map.keySet();
		System.out.println("번호\t이름\t자바점수\t오라클점수\t합계\t평균");
		for (Integer key : keySet) {
			System.out.println(key + "\t" + map.get(key).getName() + "\t" + map.get(key).getJava() + "\t"
					+ map.get(key).getOracle() + "\t\t" + map.get(key).getSum() + "\t"
					+ String.format("%.2f", map.get(key).getAvg()));
		}
		
		


		
		
		

	}// end printData

	private boolean isValidCondition(String inputNumber) {

		boolean result = true;
		try {
			if (!(inputNumber == null || inputNumber.equals("") || Integer.parseInt(inputNumber) == EXIT
					|| Integer.parseInt(inputNumber) == INPUT || Integer.parseInt(inputNumber) == PRINT)) {

				if (!(Integer.parseInt(inputNumber) == EXIT || Integer.parseInt(inputNumber) == INPUT
						|| Integer.parseInt(inputNumber) == PRINT)) {
					JOptionPane.showMessageDialog(null, "다시 입력해주세요\n1.입력 2.검색 3.종료");
					result = false;
				}

				result = false;
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "입력형식을 다시 확인해주세요.");
			result = false;
		}

		return result;
	}

	private int isValidInteger(String inputToken) {

		
		try {
			Integer.parseInt(inputToken);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "정수형이 아닙니다. 기본값 0으로 변경");
			inputToken = "0";
		}

		return Integer.parseInt(inputToken);

	}

	public static void main(String[] args) {

		HomeWork hw = new HomeWork();
		hw.program();

	}

}
