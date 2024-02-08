package day0124;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 1. 윈도우 컴포넌트 상속
 */
@SuppressWarnings("serial")
public class HelloSwing extends JFrame {

	public HelloSwing() {
		super("스윙 연습");

		// 2.컴포넌트 생성
		JButton jbtn = new JButton("안녕 Swing!!!");
		JLabel jrb = new JLabel("꾸에에에엑");

		// 3. 배치 => 부모 method 사용, 배치관리자를 사용할 수 있다.
		add(jbtn);

		// 4. 윈도우 크기 설정
		setSize(400, 250);

		// 5. 사용자에게 윈도우 컴포넌트 보여주기
		setVisible(true);

		// 6. 윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// TestSwing

	public static void main(String[] args) {

		//new HelloSwing();

	}// main

}// class
