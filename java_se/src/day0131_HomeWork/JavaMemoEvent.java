package day0131_HomeWork;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaMemoEvent extends WindowAdapter implements ActionListener {

	private JavaMemoDesign jmd;

	public JavaMemoEvent(JavaMemoDesign jmd) {
		this.jmd = jmd;

	}

	public JavaMemoDesign getJmd() {
		return this.jmd;
	}

	@Override
	public void windowClosing(WindowEvent e) {

		jmd.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jmd.jmi1) {
			// System.out.println("새클버튼 클릭");
			jmd.area.setText("");
			jmd.area.requestFocus();

			

		}

		//////////////////////////////////////////////
		if (ae.getSource() == jmd.jmi1_1) {
			// System.out.println("열기버튼 클릭");

			FileDialog fdOpen = new FileDialog(jmd, "파일 열기", FileDialog.LOAD);
			fdOpen.setVisible(true);

			String path = fdOpen.getDirectory();
			String fName = fdOpen.getFile();

			if (path != null) {// 취소를 누르면 경로나 파일명에 null 입력

				jmd.setTitle("열기 " + path + "/" + fName);// 타이틀 이름변경 메서드

			} // end if

		}
		if (ae.getSource() == jmd.jmi1_2) {
			// System.out.println("저장버튼 클릭");

			FileDialog fdSave = new FileDialog(jmd, "파일 저장 ", FileDialog.SAVE);
			fdSave.setVisible(true);

			String path = fdSave.getDirectory();
			String fName = fdSave.getFile();

			if (path != null) {// 취소를 누르면 경로나 파일명에 null 입력

				jmd.setTitle("저장 " + path + "/" + fName);// 타이틀 이름변경 메서드

			} // end if

		}
		if (ae.getSource() == jmd.jmi1_3) {
			// System.out.println("종료버튼 클릭");
			jmd.dispose();

		}
		if (ae.getSource() == jmd.jmi2) {
			// System.out.println("글꼴버튼 클릭");
			new MemoFontDesign(jmd);

		}
		if (ae.getSource() == jmd.jmi3) {
			// System.out.println("메모장정보 버튼 클릭");

			new MemoHelpDesign(jmd);

		}

	}

}
