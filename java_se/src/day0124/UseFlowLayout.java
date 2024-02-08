package day0124;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UseFlowLayout extends JFrame {

	public UseFlowLayout() {
		super("흐름 레이아웃 연습!");

		// 2.컴포넌트 생성

		JLabel jlbName = new JLabel("라베엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘엘");
		JTextField jtfName = new JTextField("텍스트필드드드드드드드드드드드드드드드드드드드드드드");
		JCheckBox jcbSave = new JCheckBox("체크박스스스스스스스스스스스스스스스스스스스스스스스스스스스스");
		JButton jbtInput = new JButton("버튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼튼ㄴ");

		// 3. 배치관리자 생성 ( Non - Visual Component)
	
		setLayout(new FlowLayout());

		// 4. 배치 컴포넌트를 배치관리자의 특성에 맞게 배치수행.
		add(jlbName);
		add(jtfName);
		add(jcbSave);
		add(jbtInput);

		// 5. 윈도우 크기 설정
		setSize(500, 500);

		// 6. 사용자에게 윈도우 컴포넌트 보여주기
		setVisible(true);

		// 7. 윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}//UseFlowLayout

	public static void main(String[] args) {

		new UseFlowLayout();

	}// main

}// class
