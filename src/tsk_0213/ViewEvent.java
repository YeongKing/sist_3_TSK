package tsk_0213;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class ViewEvent extends WindowAdapter implements ActionListener{

	private ViewDesign vd;
	
	public ViewEvent(ViewDesign vd) {
		this.vd =vd;
	}	// ViewEvent
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==vd.getJbReport()) {
			//JbReport버튼 클릭시
			JOptionPane.showMessageDialog(null, "JbReport버튼 클릭 확인");
		}	// end if
		
		if(ae.getSource()==vd.getJbOk()) {
			//JbOk버튼 클릭시
			JOptionPane.showMessageDialog(null, "JbOk버튼 클릭 확인");
			vd.dispose();
		}	// end if

	}	// actionPerformed

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(null, "윈도우 종료버튼 클릭 확인");
		vd.dispose();
	}	// windowClosing

}	// class