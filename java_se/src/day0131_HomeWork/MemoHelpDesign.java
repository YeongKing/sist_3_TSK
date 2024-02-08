package day0131_HomeWork;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 부가적인 기능을 제공하기 위해 제작하는 창 : Dialog
 */
@SuppressWarnings("serial")
public class MemoHelpDesign extends JDialog {

	private JButton jbtn;
	private JPanel jp;
	private JavaMemoDesign jmd;

	public MemoHelpDesign(JavaMemoDesign jmd) {
		super(jmd,"정보",true);
		this.jmd = jmd;

		

		JTextArea jta = new JTextArea(
				"Java 메모장 Version1.0 \n이 메모장은 \nSHPL( SuHyunPublic License)로서 \n아무나 가져다 변환 및 배포 가능합니다.\n편하게 가져다 사용해주세요");

		jta.setEditable(false);

		jbtn = new JButton("닫기");
		jp = new JPanel();
		jp.add(jbtn);

		add("Center", jta);
		add("South", jp);

		// JDialog는 이벤트 등록 코드를 setVisible전에 정의해야한다.

		MemoHelpEvent mhe = new MemoHelpEvent(this);
		addWindowListener(mhe);
		jbtn.addActionListener(mhe);

		setBounds(100, 100, 244, 200);
		setVisible(true);// 사용자에게 보여지는 일.

		// JDialog의 종료 : DISPOSE_ON_CLOSE사용
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

	}// SubJDialog

	public JButton getJbtn() {
		return jbtn;
	}

	public JPanel getJp() {
		return jp;
	}

}// class
