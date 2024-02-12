package tsk_0213;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkEvent extends WindowAdapter implements ActionListener {

	private WorkDesign wd;
	private String userId; // 로그인성공한 당시 접속된 userId

	public WorkEvent(WorkDesign wd) {
		this.wd = wd;
	}   // WorkEvent

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(null, "윈도우 종료버튼 클릭 확인");
		wd.dispose();
	}   // windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == wd.getJbtnSelect()) {
			//jbtnSelect버튼 클릭시
			JOptionPane.showMessageDialog(null, "jbtnSelect버튼 클릭 확인");
			openFile();
		}   // end if


		if (ae.getSource() == wd.getJbtnView()) {
			// added jtfStart, jtfEnd null check method
			if(!chkNull()) {
				return;
			}	// end if
			
			//jbtnView버튼 클릭시
			JOptionPane.showMessageDialog(null, "jbtnView버튼 클릭 확인");
			ViewDesign viewDesign = new ViewDesign(wd, true); // ViewDesign 클래스의 객체 생성
			viewDesign.setVisible(true); // 다이얼로그를 화면에 표시
		}   // end if

		// added jtfStart, jtfEnd null check method
		chkNull();
	}   // actionPerformed

	private void openFile() {
		if (wd == null) {
			JOptionPane.showMessageDialog(null, "WorkDesign 객체가 초기화되지 않았습니다.");
			return;
		}	// end if

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

		wd.setTitle(openFileString);

		if (!file.exists()) {
			System.out.println(file.getAbsolutePath() + "는 존재하지 않습니다.");
			return;
		}   // end if

		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(openFileString)));

			String str = "";
			while ((str = br.readLine()) != null) {
				lineCount++;
				// added lineCount at jta
				wd.getJta().append(lineCount + ". " + str + "\n");
				sb.append(str + "\n");
			}   // end while

			if (!sb.isEmpty()) {
				startCount = 1;
			}   // end if

			wd.getJlAll().setText("총 라인 수: " + Integer.toString(lineCount));
			wd.getJtfStart().setText(Integer.toString(startCount));
			wd.getJtfEnd().setText(Integer.toString(lineCount));

		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	// end catch
			}	// end if
		}   // end catch
	}   // openFile
	
	// added jtfStrat, jtfEnd null check method
	public boolean chkNull() {
		String inputStart = wd.getJtfStart().getText().trim();
		String inputEnd = wd.getJtfEnd().getText().trim();
		
		if(inputStart.isEmpty()) {
			wd.getJtfStart().requestFocus();
			JOptionPane.showMessageDialog(null, "시작 라인을 입력하세요.");
			return false;
		}	// end if
		if(inputEnd.isEmpty()) {
			wd.getJtfEnd().requestFocus();
			JOptionPane.showMessageDialog(null, "마지막 라인을 입력하세요.");
			return false;
		}	// end if
		return true;
	}	// chkNull
}   // class
