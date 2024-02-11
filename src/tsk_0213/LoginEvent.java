package tsk_0213;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class LoginEvent implements KeyListener, ActionListener, WindowListener {

	private LoginDesign ld;
	private MemberVO[] members; // Array of MemberVO objects to hold user information

	public LoginEvent(LoginDesign ld) {
		init();
		this.ld = ld;
	}

	private void login() {
		if (!(ld.getJtfId().getText().isEmpty())) {
			if (String.valueOf(ld.getJpfPw().getPassword()).isEmpty()) {
				ld.getJpfPw().requestFocus();
			} else {
				if (userCheck()) {
					String userId = ld.getJtfId().getText();
					JOptionPane.showMessageDialog(null, userId + "님이 로그인하셨습니다.");
					new WorkDesign(userId);
					//로그인되었다면 로그인창은 사라지게 구현해야함.
					ld.dispose();

				} else {
					System.out.println("로그인 실패");
				}
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_ENTER) {// enter 누르면
			login();
		}
	}

	public boolean userCheck() {
		String inputId = ld.getJtfId().getText();
		String inputPassword = String.valueOf(ld.getJpfPw().getPassword());

		for (MemberVO member : members) {
			if (member.getId().equals(inputId) && member.getPassword().equals(inputPassword)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ld.getJbtnLogin()) {// jbLogin버튼 클릭시
			login();
		}
	}

	public void init(){
		members = new MemberVO[]{
				new MemberVO("Admin", "1234", true),
				new MemberVO("administrator", "1234", true),
				new MemberVO("root", "1111", false)
		};
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}
}
