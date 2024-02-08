package TeamHomeWork;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

public class LoginEvent implements KeyListener, ActionListener {

	private LoginDesign ld;


	public LoginEvent(LoginDesign ld) {

		this.ld = ld;

	}// loginEvent

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void login() {
		if (!(ld.getJtfId().getText().isEmpty())) {

			if (String.valueOf(ld.getJtfPw().getPassword()).isEmpty()) {
				ld.getJtfPw().requestFocus();
			} else {

				if (userCheck()) {
					String userId = ld.getJtfId().getText();
					
					JOptionPane.showMessageDialog(null, userId + "님이 로그인하셨습니다.");

					new WorkDesign(userId);
					//로그인되었다면 로그인창은 사라지게 구현해야함.
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

	}// keyPressed

	public boolean userCheck() {

		boolean result = (ld.getJtfId().getText().equals("root")
				&& String.valueOf(ld.getJtfPw().getPassword()).equals("1234"))

				|| (ld.getJtfId().getText().equals("admin")
						&& String.valueOf(ld.getJtfPw().getPassword()).equals("password"))
				|| (ld.getJtfId().getText().equals("temp")
						&& String.valueOf(ld.getJtfPw().getPassword()).equals("q1w2e3r4"));

		return result;

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ld.getJbLogin()) {// jbLogin버튼 클릭시
			login();

		}

	}

}
