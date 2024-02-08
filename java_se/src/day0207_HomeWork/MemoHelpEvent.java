package day0207_HomeWork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MemoHelpEvent extends WindowAdapter implements ActionListener {

	private MemoHelpDesign mhd;

	MemoHelpEvent(MemoHelpDesign mhd) {

		this.mhd = mhd;

	}

	@Override
	public void windowClosing(WindowEvent we) {
		mhd.dispose();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == mhd.getJbtn()) {
			// System.out.println("종료버튼 클릭");
			mhd.dispose();

		}

	}

}
