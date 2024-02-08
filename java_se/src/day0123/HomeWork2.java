package day0123;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

/**
 * 숙제.<br>
 * 아래의 inputDialog에 입력값을 넣어 처리하는 프로그램을 작성하세요.<br>
 * <br>
 * 1.입력데이터가 CSV형태(이름,자바점수,오라클점수)라면 WorkVo객체를 생성하여<br>
 * 입력값을 할당하고 java.util.List에 추가하는 작업을 수행하세요.<br>
 * <br>
 * 2. CSV형태가 아닌 "출력"이 입력되면 java.util.List에 들어있는 값을 모두 다<br>
 * Console에 출력하세요.<br>
 * 
 * 출력예 )<br>
 * 번호 이름 자바 오라클 총점<br>
 * 1. 윤웅찬 100 100 200<br>
 * 2. 김병년 95 85 xx<br>
 * 
 * 3. CSV형태가 아닌 "Y"나 "y"가 입력되면 프로그램을 종료한다.
 * 
 * 
 * 
 * 
 */
public class HomeWork2 {
	private List<WorkVo> list;

	public HomeWork2() {
		list = new ArrayList<WorkVo>();
	}// HomeWork2

	public void program() {
		while (true) {
			String inputData = JOptionPane
					.showInputDialog("\"이름,자바점수,오라클점수\" 입력하면 출력됩니다. \n 종료하시려면 \" Y | y \"를 입력해 주세요.");

			if (inputData == null || inputData.equalsIgnoreCase("Y")) { // inputData의 입력값 null, or 대소문자 y인지 체크
				exitProgram();
				break;
			}

			processInput(inputData);
		}
	}// program

	private void processInput(String inputData) {
		if (isCSVInput(inputData)) {// inputData의 토큰이 3개인지 확인
			handleCSVInput(inputData);// CSV의 작업을 시작
		} else if (inputData.equals("출력")) {// inputData에 들어온 값이 "출력"일 경우
			printData();// List 출력
		}
	}// processInput

	private boolean isCSVInput(String inputData) {
		StringTokenizer st = new StringTokenizer(inputData, ",");
		return st.countTokens() == 3;
	}// isCSVInput

	private void handleCSVInput(String inputData) {
		StringTokenizer st = new StringTokenizer(inputData, ",");

		if (st.countTokens() == 3) {
			String name = st.nextToken();

			try {
				int java = Integer.parseInt(st.nextToken());
				int oracle = Integer.parseInt(st.nextToken());

				if (isValidScore(java) && isValidScore(oracle)) {// java,oracle의값이 모두 0~100일 경우
					list.add(new WorkVo(name, java, oracle)); // 리스트에 객체 추가
				} else {
					System.out.println("점수는 0에서 100 사이의 숫자여야 합니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("유효하지 않은 숫자 형식입니다.");
			} // end catch

		}
	}// handleCSVInput

	private boolean isValidScore(int score) {
		return score >= 0 && score <= 100;
	}// isValidScore

	private void printData() {// list 출력
		int num = 1;
		System.out.println("번호\t이름\t자바\t오라클\t총점");
		for (WorkVo work : list) {
			System.out.println(num++ + "\t" + work.getName() + "\t" + work.getJava() + "\t" + work.getOracle() + "\t"
					+ work.getSum());
		}
	}// printData

	private void exitProgram() {// 종료메세지출력
		System.out.println("프로그램을 종료합니다.");
	}// exitProgram

	public static void main(String[] args) {
		HomeWork2 hw = new HomeWork2();
		hw.program();

//		
//		String inputData = JOptionPane.showInputDialog("이름을 입력해주세요.","홍길동");
//		
//		StringBuilder sb= new StringBuilder();
//		
//
//		if("융운찬".equals(inputData)) {
//			sb.append("조원동의 자랑 ");
//			
//		}
//		
//		sb.append(inputData).append("님");
//		System.out.println(sb);
//		

	}// main

}// class
