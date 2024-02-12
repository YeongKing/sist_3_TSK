package tsk_0213.event;

import tsk_0213.design.ViewDesign;
import tsk_0213.design.WorkDesign;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class WorkEvent extends WindowAdapter implements ActionListener {

	private WorkDesign wd;
	private String userId; // 로그인성공한 당시 접속된 userId

	public WorkEvent(WorkDesign wd) {
		wd.setTitle("작업");
		this.wd = wd;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(null, "윈도우 종료버튼 클릭 확인");
		wd.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == wd.getJbtnView()) {
			// jbView버튼 클릭시
			JOptionPane.showMessageDialog(null, "jbView버튼 클릭 확인");
			ViewDesign viewDesign = new ViewDesign(wd, true); // ViewDesign 클래스의 객체 생성
			viewDesign.setVisible(true); // 다이얼로그를 화면에 표시
		} else if (ae.getSource() == wd.getJbtnSelect()) {
			// jbSelect버튼 클릭시
			JOptionPane.showMessageDialog(null, "jbSelect버튼 클릭 확인");
			try {
				openFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void openFile() throws IOException {
		int lineCount = 0;
		int startCount = 0;

		wd.getJta().setText("");
		FileDialog openFile = new FileDialog(wd, "열기", FileDialog.LOAD);
		openFile.setVisible(true);

		String path = openFile.getDirectory();
		String fileName = openFile.getFile();
		String openFileString = path + fileName;

		if (path == null) {
			return;
		} // end if

		File file = new File(openFileString);

		if (!file.exists()) {
			System.out.println(file.getAbsolutePath() + "는 존재하지 않습니다.");
			return;
		}

		StringBuilder sb = new StringBuilder();
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(openFileString)));

			String str = "";
			while ((str = br.readLine()) != null) {
				wd.getJta().append(str + "\n");
				sb.append(str + "\n");
			}
			lineCount++;
			if (!sb.isEmpty()) {
				startCount = 1;
			}
			br.close();

		} catch (IOException ie) {
			ie.printStackTrace();
		}

		// 로그분석 메서드 실행
		try {
			viewLog(openFileString);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		wd.setTitle(openFileString);

		wd.getJlAll().setText(Integer.toString(lineCount));

		wd.getJtfStart().setText(Integer.toString(startCount));
		wd.getJtfEnd().setText(Integer.toString(lineCount));
	}

	/**
	 * <로직분석 메서드> VIEW버튼 클릭시 로직 분석 실행
	 *
	 * @throws IOException
	 * @throws ParseException
	 */
	public void viewLog(String openFileString) throws IOException, ParseException {
		// 변수 초기화
		Map<String, Integer> keyCounts = new HashMap<String, Integer>();
		Map<String, Integer> browserCounts = new HashMap<String, Integer>();
		Map<String, Integer> timeCounts = new HashMap<String, Integer>();

		int maxRequestKeyCount = 0; // 가장많이 요청한 키의횟수
		String maxRequestKey = ""; // 가장많이 요청한 키
		int successCount = 0; // 200
		int failureCount = 0; // 404
		int abnormalRequestCount = 0; // 403
		int booksErrorCount = 0; // 500
		String maxRequestHour = null;
		int maxRequestHourCount = 0;

		// 로그 파일 읽기
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(openFileString)))) {
			boolean isBook;
			String status = "";
			String browser = "";
			String key = "";
			String requestTime = "";

			// 문자열 -> 시간변환
			SimpleDateFormat sdf;
			Date datetHour;

			// 키값의 시작과 끝 인덱스
			int keyIndex = 0;
			int endIndex = 0;

			String line = "";
			while ((line = br.readLine()) != null) {
				// isbook 초기화;
				isBook = false;

				// 로그 라인 분석
				String[] parts = line.split("\\]\\[");

				// 요청상태,브라우저,키값,시간을 배열에서 추출
				status = parts[0].replace("[", "").replace("]", "");
				browser = parts[2];
				key = "";

				requestTime = parts[3].replace("]", "").replace("ora", "00");

				// books 가 포함되있을시 true로
				if (parts[1].contains("books")) {
					isBook = true;
				}

				// 요청 시간(hour) 을 저장

				sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				datetHour = sdf.parse(requestTime);
				String requestHour = new SimpleDateFormat("HH").format(datetHour);
//				System.out.println(requestHour); 데이터 정상출력 확인

				// key값 저장하기 , key가 없으면 null반환 하고 있으면 "key="의 다음 인덱스부터 "&"전까지 저장
				keyIndex = line.indexOf("key=");
				if (keyIndex != -1) {
					keyIndex += 4;
					endIndex = line.indexOf("&", keyIndex);
					key = line.substring(keyIndex, endIndex);
				} else {
					key = null;
				}

				// 키별 요청 횟수 계산
				keyCounts.put(key, keyCounts.getOrDefault(key, 0) + 1);

				// 브라우저별 접속 횟수 계산
				browserCounts.put(browser, browserCounts.getOrDefault(browser, 0) + 1);

				// 시간별 접속 횟수 계산
				timeCounts.put(requestHour, timeCounts.getOrDefault(requestHour, 0) + 1);

				// 성공(200) 및 실패(404) 횟수 계산
				if ("200".equals(status)) {
					successCount++;
				} else if ("404".equals(status)) {
					failureCount++;
				}

				// books 요청에 대한 에러(500) 횟수 계산
				if ("500".equals(status) && isBook) {
					booksErrorCount++;
				}

				// 비정상적인 요청(403) 횟수 계산
				if ("403".equals(status)) {
					abnormalRequestCount++;
				}

			}
		}
		// 가장 많이 사용된 키와 횟수 찾기
		for (Map.Entry<String, Integer> keyEntry : keyCounts.entrySet()) {
			if (keyEntry.getValue() > maxRequestKeyCount) {
				maxRequestKeyCount = keyEntry.getValue();
				maxRequestKey = keyEntry.getKey();
			}
		}

		// 요청이 가장 많은 시간 찾기
		for (Map.Entry<String, Integer> timeEntry : timeCounts.entrySet()) {
			if (timeEntry.getValue() > maxRequestHourCount) {
				maxRequestHourCount = timeEntry.getValue();
				maxRequestHour = timeEntry.getKey();
			}
		}
		// 결과 출력
		System.out.println("가장 많이 사용된 키: " + maxRequestKey + " (횟수: " + maxRequestKeyCount + ")");
		System.out.println("브라우저별 접속 횟수: " + browserCounts);
		System.out.println("성공적으로 수행한 횟수(200): " + successCount);
		System.out.println("실패한 횟수(404): " + failureCount);
		// System.out.println("가장 많은 요청이 발생한 시간: " + findMostFrequentTime(filePath));
		System.out.println("비정상적인 요청(403) 횟수: " + abnormalRequestCount);
		System.out.println("books 요청에 대한 에러(500) 횟수: " + booksErrorCount);
		System.out.println("가장 많은 요청 시간 : " + maxRequestHour + "횟수 : " + maxRequestHourCount);
	}
}
