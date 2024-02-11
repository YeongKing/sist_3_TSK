package tsk_0213;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginDesign extends JFrame {

	private JTextField jtfId;
	private JPasswordField jpfPw;	// jtf -> jpw 변경
	private JLabel jlId, jlPw, jlStatus;
	private JButton jbtnLogin;	 // jb -> jbtn 변경

	public LoginDesign() {
		// 타이틀명 변경
		super("sist 사용자 로그 분석 프로그램 - 로그인");
		jtfId = new JTextField();
		jpfPw = new JPasswordField();

		jlId = new JLabel("ID");
		jlPw = new JLabel("PW");
		jlStatus = new JLabel("아이디와 비밀번호를 입력하세요.");
		jbtnLogin = new JButton("로그인");

		setLayout(null);//수동배치
		setBounds(300, 100, 310, 190);

		jlStatus.setBounds(70, 17, 200, 30);
		jlId.setBounds(30, 60, 50, 30);
		jlPw.setBounds(30, 100, 50, 30);
		jtfId.setBounds(70, 60, 120, 30);
		jpfPw.setBounds(70, 100, 120, 30);
		jbtnLogin.setBounds(200, 60, 90, 70);
		
		jlStatus.setForeground(Color.red);

		add(jlId);
		add(jlPw);
		add(jlStatus);
		add(jtfId);
		add(jpfPw);
		add(jbtnLogin);

		LoginEvent le = new LoginEvent(this);
		
		addWindowListener(le);
		jtfId.addActionListener(le);
		jpfPw.addActionListener(le);
		jbtnLogin.addActionListener(le);

		setVisible(true);
	}	// LoginDesign

	public JTextField getJtfId() {
		return jtfId;
	}

	public JPasswordField getJpfPw() {
		return jpfPw;
	}
	
	// getJlId, Pw 삭제, getJlStatus 추가
	public JLabel getJlStatus() {
		return jlStatus;
	}
	
	public JButton getJbtnLogin() {
		return jbtnLogin;
	}

	// MemberVO에 따라 디자인 변경
	public static void main(String[] args) {
		new LoginDesign(); // LoginDesign 객체 생성
	}	// main

}	// class