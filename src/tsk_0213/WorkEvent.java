package tsk_0213;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

// WindowAdapter 상속, ActionListener 구현 처리
public class WorkEvent extends WindowAdapter implements ActionListener {
	
	private String userId; //로그인성공한 당시 접속된 userId
	private WorkDesign wd;
	
	public WorkEvent(WorkDesign wd) {
		this.wd = wd;
	}	// WorkEvent

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	// actionPerformed

}	// class