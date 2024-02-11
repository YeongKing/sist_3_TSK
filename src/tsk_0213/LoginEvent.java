package tsk_0213;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class LoginEvent extends WindowAdapter implements ActionListener {

	private LoginDesign ld;
	private MemberVO[] members; // Array of MemberVO objects to hold user information

	public LoginEvent(LoginDesign ld) {
		init();
		this.ld = ld;
	}	// LoginEvent

	@Override
	public void actionPerformed(ActionEvent e) {
		chkNull();
		login();
	}	// actionPerformed
	
	private void chkNull() {
		String inputId = ld.getJtfId().getText().trim();
		String inputPw = String.valueOf(ld.getJpfPw().getPassword()).trim();
		
		if(inputId.isEmpty()) {
			ld.getJtfId().requestFocus();
			ld.getJlStatus().setText("아이디를 입력하세요.");
			return;
		}	// end if
		if(inputPw.isEmpty()) {
			ld.getJpfPw().requestFocus();
			ld.getJlStatus().setText("비밀번호를 입력하세요.");
			return;
		}	// end if
	}	// chkNull
	
	private void login() {
		String userId = ld.getJtfId().getText().trim();	// 공백 제거
		String userPw = String.valueOf(ld.getJpfPw().getPassword()).trim();
		if(userCheck()) {
			JOptionPane.showMessageDialog(ld, userId + "님이 로그인하셨습니다.");	// null -> ld
			new WorkDesign(userId);
			
			//로그인되었다면 로그인창은 사라지게 구현해야함.
			ldClose();
		} else {
			if(userId.isEmpty() || userPw.isEmpty()) {	// 공백이 없을 때만 로그인 실패 뜨도록 설
				return;
			}	// end if
			JOptionPane.showMessageDialog(ld, "로그인 실패");	// null -> ld
		}	// end else
	}	// login
	
	private boolean userCheck() {	// public -> private 변경
		String inputId = ld.getJtfId().getText().trim();	// 공백 제거
		String inputPw = String.valueOf(ld.getJpfPw().getPassword()).trim();	// 공백 제거, 변수 통일
		
		for (MemberVO member : members) {
			if (member.getId().equals(inputId) && member.getPassword().equals(inputPw)) {
				return true;
			}	// end if
		}	// end for
		return false;
	}	// userCheck
	
	public void ldClose() {
		// LoginDesign Class의 setDefaultCloseOperation 제거 후 close method 생성 
		ld.dispose();
	}	// ldClose

	@Override
	public void windowClosing(WindowEvent e) {
		ldClose();
	}	// windowClosing
	
	public void init(){
		members = new MemberVO[]{
				// Admin -> admin 변경, administrator pw 1234 -> 12345 변경 
				new MemberVO("admin", "1234", true),
				new MemberVO("administrator", "12345", true),
				new MemberVO("root", "1111", false)
		};
	}	// init
	
}	// class