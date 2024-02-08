package day0129;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * 1. KeyListener 구현
 *
 */
@SuppressWarnings("serial")
public class TestKeyboardEvent extends JFrame implements KeyListener {
	// 3. 이벤트 처리와 관련있는 컴포넌트를 선언

	private JTextField jtf;
	private JTextArea jta;

	public TestKeyboardEvent() {
		super("키보드 이벤트");

		JTextField jtf = new JTextField();
		JTextArea jta = new JTextArea();

		JScrollPane jsp = new JScrollPane(jta);

		jtf.setBorder(new TitledBorder("아무키나 누르세요"));
		jsp.setBorder(new TitledBorder("눌린키의 정보"));

		// jtf에서 이벤트 발생하면 이벤트를 감지할 수 있도록 이벤트 객체에 등록하기.
		// 2. anonymous inner class로 이벤트 처리

		jtf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent ke) {

				// 눌린 키의 키코드와 키 값을 얻어온다.
				char c = ke.getKeyChar();

				int code = ke.getKeyCode();
				// jTextArea에 추가

				jta.append("문자 : " + c + ", 코드 : +" + code + "\n");
				// ESC키가 눌렸을 때 프로그램을 종료해보세요.

				
				switch (code) {
				case KeyEvent.VK_ESCAPE :
					dispose();
					break;
				case KeyEvent.VK_ENTER : 
					jta.append("엔터눌림\n");

				}
				
				if (code == KeyEvent.VK_ESCAPE) {



				}
				//엔터키가 눌렸을 때 J.T.A에 "엔터눌림"을 추가

			}

		});

		add("North", jtf);
		add("Center", jsp);

		setSize(400, 400);
		setVisible(true);

		// 윈도우 종료 이벤트 처리
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent we) {

				dispose();
			}

		});

	}// TestKeyboardEvent

	@Override
	public void keyTyped(KeyEvent ke) {// keyTyped 주의 -> 키코드가 안나옴

		System.out.println("keyTyped [" + ke.getKeyCode() + " / " + ke.getKeyChar() + "]");
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		System.out.println("keyPressed [" + ke.getKeyCode() + " / " + ke.getKeyChar() + "]");
		// keyCode는 대소문자 상관없이 동일하다.
	}

	@Override
	public void keyReleased(KeyEvent ke) {

		// System.out.println("keyReleased [" + ke.getKeyCode() + " / " +
		// ke.getKeyChar() + "]");

	}

	public static void main(String[] args) {
		new TestKeyboardEvent();

	}// main

}// class
