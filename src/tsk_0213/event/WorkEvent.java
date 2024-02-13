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

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WorkEvent extends WindowAdapter implements ActionListener {

	private WorkDesign wd;
	private String userId; // 로그인성공한 당시 접속된 userId
	private String openFileString; //
	private int lineCount, startCount; // 로그파일 로드시 시작 , 끝 라인수
	
	
	private int maxRequestKeyCount;
	private String maxRequestKey ;
	private int successCount;
	private int failureCount;
	private int abnormalRequestCount;
	private int booksErrorCount;
	private String maxRequestHour;
	private int maxRequestHourCount;
	private int number;
	private boolean isFileLoaded; //파일 선택 여부 확인

	
	private Map<String, Integer> browserCounts;


	
	
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
			if(!isFileLoaded) {
				JOptionPane.showMessageDialog(null, "파일을 선택해주세요");
				return;
			}

			// 로그분석 메서드 실행
			try {
				viewLog(openFileString);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			// 결과 출력
			
			String result = "가장 많이 사용된 키: " + maxRequestKey + " (횟수: " + maxRequestKeyCount + ")\n"+"브라우저별 접속 횟수: " + browserCounts+"\n성공적으로 수행한 횟수(200): " 
			+ successCount+"\n실패한 횟수(404): " + failureCount + "\n비정상적인 요청(403) 횟수: " + abnormalRequestCount+"\nbooks 요청에 대한 에러(500) 횟수: " + booksErrorCount+"\n가장 많은 요청 시간 : " + maxRequestHour + "횟수 : " + maxRequestHourCount;

			// System.out.println("가장 많은 요청이 발생한 시간: " + findMostFrequentTime(filePath));

			

			ViewDesign viewDesign = new ViewDesign(result ,wd, true); // ViewDesign 클래스의 객체 생성
			viewDesign.setVisible(true); // 다이얼로그를 화면에 표시
		}
		
		
		
		if (ae.getSource() == wd.getJbtnSelect()) {
			// jbSelect버튼 클릭시
			JOptionPane.showMessageDialog(null, "jbSelect버튼 클릭 확인");
			try {
				openFile();
				isFileLoaded = true; // 파일 선택했는지?
//				System.out.println(isFileLoaded); //파일 선택여부 test
			} catch (IOException e) {
				e.printStackTrace();
//				JOptionPane.showMessageDialog(null, "파일을 선택해주세요");
			}
			
		}
	}
	
	
	public void numberCheck(String numbercheck) {

	    // 입력된문자열이 빈문자열이거나 null일경우
	    if (numbercheck == null || numbercheck.isEmpty()) {
	        // 처리할 내용이 있다면 이곳에 추가합니다.
	        return; // 예외 상황 처리 후 메서드를 종료합니다.
	    }

	    // 입력된문자열이 숫자로만 이루어져 있을 경우
	    if (!numbercheck.matches("\\d+")) {
	        // 숫자로만 구성되어 있지 않으면 예외처리
	        System.out.println("입력된 문자열은 숫자로만 구성되어야 합니다.");
	        return; //얼리리턴
	    }

	    try {
	        // 문자열을 정수로 변환
	         number = Integer.parseInt(numbercheck);

	    } catch (NumberFormatException e) {
	        System.out.println("올바른 숫자 형식이 아닙니다.");
	        e.printStackTrace(); // 디버깅을 위해 예외 내용을 출력합니다.
	    }

	    
	}
	
	
	
	
	
	
	
	

	private void openFile() throws IOException {
		lineCount = 0;
		startCount = 0;

		wd.getJta().setText("");
		FileDialog openFile = new FileDialog(wd, "열기", FileDialog.LOAD);
		openFile.setVisible(true);

		String path = openFile.getDirectory();
		String fileName = openFile.getFile();
		openFileString = path + fileName;

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
				lineCount++;
			}


			if (!sb.isEmpty()) {
				startCount = 1;
			}
			br.close();

		} catch (IOException ie) {
			ie.printStackTrace();
		}

		wd.setTitle(openFileString);

		wd.getJlAll().setText(Integer.toString(lineCount));

		wd.getJtfStart().setText(Integer.toString(startCount));
		wd.getJtfEnd().setText(Integer.toString(lineCount));

		wd.setFileName(fileName);
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
		browserCounts = new HashMap<String, Integer>();
		Map<String, Integer> timeCounts = new HashMap<String, Integer>();

		 maxRequestKeyCount = 0; // 가장많이 요청한 키의횟수
		 maxRequestKey = ""; // 가장많이 요청한 키
		 successCount = 0; // 200
		 failureCount = 0; // 404
		 abnormalRequestCount = 0; // 403
		 booksErrorCount = 0; // 500
		 maxRequestHour = null;
		 maxRequestHourCount = 0;

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

			numberCheck(wd.getJtfStart().getText());
			int keyIndex = number;
			numberCheck(wd.getJtfEnd().getText());
			int endIndex = number;

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

	}

}
