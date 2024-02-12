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

	private JLabel jlStart, jlEnd, jlAll;	// jlAll(총 라인 수) 추가
	private JTextField jtfStart, jtfEnd;
	private JTextArea jta;
	private JScrollPane jsp;

	private JButton jbtnView, jbtnSelect;	// report 버튼 삭제
	private JLabel  jlLine, jlLineNumber;
	

	private JButton jbView, jbSelect;


	public WorkDesign(String userId) {
		super("sist 사용자 로그 분석 프로그램");

		jlStart = new JLabel("시작 라인 : ");
		jlEnd = new JLabel("마지막 라인 : ");
		jlAll = new JLabel("총 라인 수: ");

		jtfStart = new JTextField();
		jtfEnd = new JTextField();

		jta = new JTextArea();
		// added jta setEditable false
		jta.setEditable(false);
		jta.setText("임시 작성된 글, 로그인된 ID : " + userId);
		jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("불러온 Log Data"));

		jbtnView = new JButton("View");
		jbtnSelect = new JButton("File Select");	// 버튼 이름 변경


		setLayout(null);
		setBounds(400, 100, 700, 700);

		jlStart.setBounds(50, 30, 110, 30);
		jlEnd.setBounds(280, 30, 110, 30);
		jlAll.setBounds(550, 30, 100, 30);

		jtfStart.setBounds(145, 30, 120, 30);
		jtfEnd.setBounds(390, 30, 120, 30);
		jsp.setBounds(40, 70, 610, 500);
		jbtnView.setBounds(150, 590, 150, 50);
		jbtnSelect.setBounds(380, 590, 150, 50);

		add(jlStart);
		add(jlEnd);
		add(jlAll);

		add(jtfStart);
		add(jtfEnd);
		add(jsp);
		add(jbtnView);
		add(jbtnSelect);

		WorkEvent we = new WorkEvent(this);

		addWindowListener(we);
		jtfStart.addActionListener(we);	// jtfStart, jtfEnd actionlistener 추가
		jtfEnd.addActionListener(we);
		jbtnView.addActionListener(we);
		jbtnSelect.addActionListener(we);


		add(jbtnView);
		add(jbtnSelect);

		setVisible(true);
		// 제거 후 WorkEvent에 close method 생성 필요
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// WorkDesign
		
		

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

	public JLabel getJlAll() {
		return jlAll;
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

	public JButton getJbtnView() {
		return jbtnView;
	}

	public JButton getJbtnSelect() {
		return jbtnSelect;

	}

	public JLabel getJlLine() {
		return jlLine;
	}

	public JLabel getJlLineNumber() {
		return jlLineNumber;
	}

	public JButton getJbView() {
		return jbView;
	}

	public JButton getJbSelect() {
		return jbSelect;
	}
}	// class

