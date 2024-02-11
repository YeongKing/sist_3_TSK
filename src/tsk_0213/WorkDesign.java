package tsk_0213;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class WorkDesign extends JFrame {
	private String userId; // 로그인된 아이디
	private JLabel jlStart, jlEnd;
	private JTextField jtfStart, jtfEnd;

	private JTextArea jta;
	private JScrollPane jsp;

	private JButton jbView, jbSelect;

	public WorkDesign(String userId) {

		// this.userId = userId;
		jlStart = new JLabel("시작 라인 범위 : ");
		jlEnd = new JLabel("마지막 라인 범위 : ");

		jtfStart = new JTextField();
		jtfEnd = new JTextField();

		jta = new JTextArea();
		jta.setText("임시작성된 글 , 로그인된 ID : " + userId);
		jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("불러온 Log Data"));

		jbView = new JButton("View");
		jbSelect = new JButton("Select");

		setLayout(null);
		setBounds(100, 100, 700, 700);

		jlStart.setBounds(50, 30, 110, 30);
		jlEnd.setBounds(280, 30, 110, 30);

		jtfStart.setBounds(145, 30, 120, 30);
		jtfEnd.setBounds(390, 30, 120, 30);

		jsp.setBounds(40, 70, 610, 500);

		jbView.setBounds(70, 590, 150, 50);
		jbSelect.setBounds(270, 590, 150, 50);

		add(jlStart);
		add(jlEnd);

		add(jtfStart);
		add(jtfEnd);

		add(jsp);

		add(jbView);
		add(jbSelect);

		WorkEvent we = new WorkEvent(this);
		addWindowListener(we);
		jbView.addActionListener(we);
		jbSelect.addActionListener(we);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public String getUserId() {
		return userId;
	}

	public JLabel getJlStart() {
		return jlStart;
	}

	public JLabel getJlEnd() {
		return jlEnd;
	}

	public JTextField getJtfStart() {
		return jtfStart;
	}

	public JTextField getJtfEnd() {
		return jtfEnd;
	}

	public JTextArea getJta() {
		return jta;
	}

	public JScrollPane getJsp() {
		return jsp;
	}

	public JButton getJbView() {
		return jbView;
	}

	public JButton getJbSelect() {
		return jbSelect;
	}

}
