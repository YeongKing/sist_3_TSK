package tsk_0213.event;

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

import tsk_0213.design.ViewDesign;
import tsk_0213.design.WorkDesign;

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
	
	private int maxRequestKeyCountSub;
	private String maxRequestKeySub ;
	
	
	

	
	private Map<String, Integer> browserCounts;

	
	
	
	public WorkEvent(WorkDesign wd) {
//		wd.setTitle("작업");
		this.wd = wd;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//JOptionPane.showMessageDialog(null, "윈도우 종료버튼 클릭 확인");
		wd.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == wd.getJbtnView()) {
			
			// jbView버튼 클릭시
		//	JOptionPane.showMessageDialog(null, "jbView버튼 클릭 확인");
			if(!isFileLoaded) {
				JOptionPane.showMessageDialog(null, "파일을 선택해주세요");
				return;
			}

			// 로그분석 메서드 실행
			try {
			
				int start = Integer.parseInt(wd.getJtfStart().getText());
				int end = Integer.parseInt(wd.getJtfEnd().getText());
				int all = Integer.parseInt(wd.getJlAll().getText().substring(10));
				
//				System.out.println(start + " " + end + " " + all);

//				numberCheck(start);
//				numberCheck(end);

				if((start>0)&&(start <= end) && (end <= all) && (all!=0)) {
				
					viewLog(openFileString);
					
					String result = "1. 가장 많이 사용된 키 : " + maxRequestKey + " (횟수 : " + maxRequestKeyCount + " 회)\n"
					+ "2. 브라우저별 접속 횟수 : " + browserCounts+"\n"
					+ "3. 성공적으로 수행한 횟수(200) : " + successCount+" 회\n"
					+ "4. 가장 많은 요청 시간 : " + maxRequestHour + " 시\n" /*"횟수 : " + maxRequestHourCount*/ 
					+ "5. 비정상적인 요청(403) 횟수 : " + abnormalRequestCount + " 회\n"
					+ "5-1. 실패한 횟수(404) : " + failureCount + " 회\n"
					+ "6. books 요청에 대한 에러(500) 횟수 : " + booksErrorCount + " 회\n"
					+ "7."+start+"~"+end+"번째 라인에 해당하는 정보 중 최다사용 키의 이름과 횟수 : " +maxRequestKeySub+ " (횟수 : "+maxRequestKeyCountSub+"회)";
					 
					
					
					// System.out.println("가장 많은 요청이 발생한 시간: " + findMostFrequentTime(filePath));	
					
					ViewDesign viewDesign = new ViewDesign(result , wd, true); // ViewDesign 클래스의 객체 생성
					viewDesign.setVisible(true); // 다이얼로그를 화면에 표시
					
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "시작라인, 마지막라인을 확인해주세요.");
				return;
			}
			// 결과 출력

		}
		
		if (ae.getSource() == wd.getJbtnSelect()) {
			// jbSelect버튼 클릭시
			//JOptionPane.showMessageDialog(null, "jbSelect버튼 클릭 확인");
			try {
				openFile();
				isFileLoaded = true; // 파일 선택했는지?
//				System.out.println(isFileLoaded); //파일 선택여부 test
			} catch (Exception e) {
			//	e.printStackTrace();
			//	JOptionPane.showMessageDialog(null, "파일을 선택해주세요");
			}
			
		}
	}
	
	
	public void numberCheck(String numbercheck) {

//		System.out.println(numbercheck);
	    // 입력된문자열이 빈문자열이거나 null일경우
	    if (numbercheck == null || numbercheck.isEmpty()) {
	        // 처리할 내용이 있다면 이곳에 추가합니다.
//	    	JOptionPane.showMessageDialog(null, "시작라인 또는 마지막라인을 입력해주세요.");
	        return; // 예외 상황 처리 후 메서드를 종료합니다.
	    }
	    
	    // 입력된문자열이 숫자로만 이루어져 있을 경우(구현되었음) &&  (입력된 숫자가 시작라인 끝라인 사이의 수 이면서 끝라인의 수가 시작라인의 수보다 커야함)> 미구현되었음
	    if (!numbercheck.matches("\\d+")) {
	        // 숫자로만 구성되어 있지 않으면 예외처리
//	        System.out.println("입력된 문자열은 숫자로만 구성되어야 합니다.");
	        return; //얼리리턴
	    }

	    try {
	        // 문자열을 정수로 변환
	         number = Integer.parseInt(numbercheck);
	         
	    } catch (NumberFormatException e) {
//	        System.out.println("올바른 숫자 형식이 아닙니다.");
	        e.printStackTrace(); // 디버깅을 위해 예외 내용을 출력합니다.
	    }

	    
	}
	

	private void openFile() throws Exception {
		lineCount = 0;
		startCount = 0;

		wd.getJta().setText("");
		FileDialog openFile = new FileDialog(wd, "열기", FileDialog.LOAD);
		openFile.setVisible(true);

		String path = openFile.getDirectory();
		String fileName = openFile.getFile();
		openFileString = path + fileName;

		if (path == null) {
			throw new Exception();
		
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

		wd.getJlAll().setText("불러온 라인 수 :" + Integer.toString(lineCount));
		
		// 파일 선택 후 수정 가능 설정
		wd.getJtfStart().setEditable(true);
		wd.getJtfEnd().setEditable(true);

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
		Map<String, Integer> keyCountsSub = new HashMap<String, Integer>();
		browserCounts = new HashMap<String, Integer>();
		Map<String, Integer> timeCounts = new HashMap<String, Integer>();

		 maxRequestKeyCount = 0; // 가장많이 요청한 키의횟수
		 maxRequestKey = ""; // 가장많이 요청한 키
		 
		 maxRequestKeyCountSub = 0; // 가장많이 요청한 키의횟수
		 maxRequestKeySub = ""; // 가장많이 요청한 키
		 
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
			int startLineNumber = number;
			
			numberCheck(wd.getJtfEnd().getText());
			int endLineNumber = number;
			
			
			int endIndex = 0;
			int keyIndex = 0;
			String line = "";
			int checkLine =1 ;
			

			int endIndexSub = 0;
			int keyIndexSub = 0;
			String keySub = "";

			
			
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
				
				
				
				
				
				if(checkLine>=startLineNumber&&checkLine<=endLineNumber) {
			//해당라인에 관련된 key 및 횟수 확인
					  // key값 저장하기 , key가 없으면 null반환 하고 있으면 "key="의 다음 인덱스부터 "&"전까지 저장
				    keyIndexSub = line.indexOf("key=");
				    if (keyIndexSub != -1) {
				        keyIndexSub += 4;
				        endIndexSub = line.indexOf("&", keyIndexSub);
				         keySub = line.substring(keyIndexSub, endIndexSub);
				    } else {
				        keySub = null;
				    }

				    // 키별 요청 횟수 계산
				    keyCountsSub.put(keySub, keyCountsSub.getOrDefault(keySub, 0) + 1);


				    // 가장 많이 사용된 키와 횟수 찾기
				    for (Map.Entry<String, Integer> keyEntry : keyCountsSub.entrySet()) {
				        if (keyEntry.getValue() > maxRequestKeyCountSub) {
				            maxRequestKeyCountSub = keyEntry.getValue();
				            maxRequestKeySub = keyEntry.getKey();
				        }
				    }

					
			}
				checkLine++;
			}//while
		
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

}