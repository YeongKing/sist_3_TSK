package tsk_0213;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginDesign extends JFrame {

	private JTextField jtfId;
	private JPasswordField jtfPw;

	private JLabel jlId, jlPw;

	private JButton jbLogin;

	public LoginDesign() {
		super("로그인");
		jtfId = new JTextField();
		jtfPw = new JPasswordField();

		jlId = new JLabel("ID");
		jlPw = new JLabel("PW");
		jbLogin = new JButton("로그인");

		setLayout(null);//수동배치
		setBounds(500, 500, 330, 150);

		jlId.setBounds(30, 20, 50, 30);
		jlPw.setBounds(30, 60, 50, 30);

		jtfId.setBounds(70, 20, 120, 30);
		jtfPw.setBounds(70, 60, 120, 30);

		jbLogin.setBounds(200, 20, 90, 70);

		add(jlId);
		add(jlPw);
		add(jtfId);
		add(jtfPw);
		add(jbLogin);

		LoginEvent le = new LoginEvent(this);

		jtfId.addKeyListener(le);
		jtfPw.addKeyListener(le);
		jbLogin.addActionListener(le);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JTextField getJtfId() {
		return jtfId;
	}

	public JPasswordField getJtfPw() {
		return jtfPw;
	}

	public JLabel getJlId() {
		return jlId;
	}

	public JLabel getJlPw() {
		return jlPw;
	}

	public JButton getJbLogin() {
		return jbLogin;
	}

	// MemberVO에 따라 디자인 변경
	public static void main(String[] args) {

		new LoginDesign(); // LoginDesign 객체 생성
	}


}
