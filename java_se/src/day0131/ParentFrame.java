package day0131;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ParentFrame extends JFrame implements ActionListener {
	private JButton jbtn, jbtnOpen, jbtnSave;

	public ParentFrame() {
		super("다이얼로그 연습");
		jbtn = new JButton("다이얼로그");
		jbtnOpen = new JButton("파일다이얼로그 열기");
		jbtnSave = new JButton("파일다이얼로그 저장");

		JPanel jp = new JPanel();

		jp.add(jbtn);
		jp.add(jbtnOpen);
		jp.add(jbtnSave);

		jbtn.addActionListener(this);
		jbtnOpen.addActionListener(this);
		jbtnSave.addActionListener(this);

		add("Center", jp);

		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}// ParentFrame

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jbtn) {
			new SubJDialog(this);

		} // end if

		if (ae.getSource() == jbtnOpen) {
			open();

		} // end if

		if (ae.getSource() == jbtnSave) {
			save();
		} // end if

	}// actionPerformed

	private void open() {
		FileDialog fdOpen = new FileDialog(this, "파일 열기", FileDialog.LOAD);
		fdOpen.setVisible(true);

		String path = fdOpen.getDirectory();
		String fName = fdOpen.getFile();
		
		if(path!=null) {//취소를 누르면 경로나 파일명에 null 입력


		if (path.length() >= 11) {

			path = path.substring(0, 10) + "..";

		
		setTitle("열기 : " + path + fName);// 타이틀 이름변경 메서드
		
		  }//end if
		
		
		}//end if
	}// open

	private void save() {
		FileDialog fdSave = new FileDialog(this, "파일 저장", FileDialog.SAVE);
		fdSave.setVisible(true);


		String path = fdSave.getDirectory();
		String fName = fdSave.getFile();
		
		if(path!=null) {//취소를 누르면 경로나 파일명에 null 입력
		System.out.println("자료를 선택하지 않았습니다.");
		
		
		
		if (path.length() >= 11) {

			path = path.substring(0, 10) + "..";

		
		setTitle("저장 : " + path + fName);// 타이틀 이름변경 메서드
		
		  }//end if
		
		
		}//end if
		
	}// save

	public static void main(String[] args) {
		new ParentFrame();
		//JOptionPane.showInputDialog("입력");
		//JOptionPane.showMessageDialog(null,"메세지");
		//JOptionPane.showConfirmDialog(null,"입력");

		
	}// main

}// class
