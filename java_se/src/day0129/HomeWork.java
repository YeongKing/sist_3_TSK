package day0129;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * 숙제<br>
 * 아래와 같은 프로그램을 제작하고, 동작하도록 코딩하세요.
 */
@SuppressWarnings("serial")
public class HomeWork extends JFrame {

	JTextField jtfId;
	JPasswordField jpfPw;
	JLabel jtfResult;

	public HomeWork() {
		
		super("숙제");

		jtfId = new JTextField();
		jpfPw = new JPasswordField();
		jtfResult = new JLabel();

		jtfId.setBorder(new TitledBorder("아이디"));
		jpfPw.setBorder(new TitledBorder("비밀번호"));
		jtfResult.setBorder(new TitledBorder("결과"));

		jtfId.addKeyListener(new KeyAdapter() {


			@Override
			public void keyPressed(KeyEvent e) {



				int code = e.getKeyCode();



				if (code == KeyEvent.VK_ENTER) {// enter 누르면

					if (!(jtfId.getText().isEmpty())) {

						if (String.valueOf(jpfPw.getPassword()).isEmpty()) {
							jpfPw.requestFocus();
						} else {

							if (userCheck()) {
								
								jtfResult.setForeground(Color.blue);
								jtfResult.setText(jtfId.getText() + "님 로그인");

							} else {
								jtfResult.setForeground(Color.red);
								jtfResult.setText("로그인 실패");

							}

						}
					}

				}

			}

		});

		jpfPw.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {


				int code = e.getKeyCode();


				if (code == KeyEvent.VK_ENTER) {// enter 누르면

					if (!(String.valueOf(jpfPw.getPassword()).isEmpty())) {

						if ((jtfId.getText().isEmpty())) {
							jtfId.requestFocus();
						} else {

							if (userCheck()) {
								
								jtfResult.setForeground(Color.blue);
								jtfResult.setText(jtfId.getText() + "님 로그인");

							} else {
								jtfResult.setForeground(Color.red);
								jtfResult.setText("로그인 실패");
							}

						}

					}

				}

			}

		});

		setSize(600, 600);
		setVisible(true);

		setLayout(new GridLayout(3, 1));
		add(jtfId);
		add(jpfPw);
		add(jtfResult);

	}// HomeWork
	
	public boolean userCheck() {
		
		boolean result = (jtfId.getText().equals("root") && String.valueOf(jpfPw.getPassword()).equals("1234"))

				|| (jtfId.getText().equals("admin")
						&& String.valueOf(jpfPw.getPassword()).equals("password"))
				|| (jtfId.getText().equals("temp")
						&& String.valueOf(jpfPw.getPassword()).equals("q1w2e3r4"));
		
		return result;
		
	}
	

	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HomeWork();
	}// main

}// class
