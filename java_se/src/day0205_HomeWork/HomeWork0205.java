package day0205_HomeWork;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 
 * 숙제<br>
 * 1. InputDialog를 사용하여 경로를 받습니다.(c:/dev)<br>
 * 2. 입력된 문자열에 해당하는 경로가 존재하면 아래와 같이 디렉토리내 모든 디렉토리와 파일명을 J.T.A에 출력하는 프로그램을 작성 3.
 * 디렉토리는 크기를 출력하지 않고 파일에 대해서만 byte 크기로 출력해주세요. ex) c:/dev 입력되었을 때
 * 
 * 
 * 
 */
public class HomeWork0205 {

	public HomeWork0205() throws IOException {

		String filePath = JOptionPane.showInputDialog("경로를 입력해주세요.");

		if (filePath == null) {// 취소 혹은 x표 클릭시 early return

			return;
		}

		File file = new File(filePath);

		if (!file.exists()) { // 파일명,경로 일치 하지 않을 시 early return
			JOptionPane.showMessageDialog(null, "파일명이나 경로를 확인해주세요.");

			return;
		}

		listDirectory(file);// 본작업

	}// HomeWork0205

	private void listDirectory(File directory) {
		JTextArea jta = new JTextArea(10, 50);
		JScrollPane jsp = new JScrollPane(jta);
		jta.append("이름\t\t수정한날짜\t\t유형\t크기\n");

		for (File file : directory.listFiles()) {
			appendFileInfo(jta, file);
		}

		jta.setEditable(false);// 수정불가
		JOptionPane.showMessageDialog(null, jsp);
	}

	private void appendFileInfo(JTextArea jta, File file) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm");
		jta.append(file.getName() + "\t\t" + sdf.format(new Date(file.lastModified())));

		if (file.isDirectory()) {// 디렉토리일 경우
			jta.append("\t폴더\n");
		} else {// 파일일 경우
			jta.append("\t파일\t" + file.length() + "byte\n");
		}
	}

	public static void main(String[] args) {

		try {
			new HomeWork0205();
		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}// main

}// class
