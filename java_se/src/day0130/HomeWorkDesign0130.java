package day0130;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class HomeWorkDesign0130 extends JFrame {

	private JRadioButton jrbGender1;
	private JRadioButton jrbGender2;

	private JComboBox<Integer> jcbbAge; // 나이콤보박스
	private DefaultListModel<String> dlm;

	private ButtonGroup bg;

	private JList<String> jl;

	private JTextField jtfName; // 이름

	private JTextField jtfTel; //전화번호

	private JButton jbtInput, jbtModify, jbtDelete, jbtExit;

	private JPanel jpButton;
	// 추가,수정,삭제,종료

	public HomeWorkDesign0130() {
		super("숙제");

		// 컴포넌트 생성
		JLabel jlblName = new JLabel("이름");

		Integer[] arr = { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40

		};

		jcbbAge = new JComboBox<Integer>(arr);

		dlm = new DefaultListModel<String>();
		jl = new JList<String>(dlm);
		dlm.addElement("진수현,20,남,010-1234-5678");
		dlm.addElement("김동섭,21,남,010-2345-6789");

		JLabel jlblAge = new JLabel("나이");
		JLabel jlblGender = new JLabel("성별");
		JLabel jlblAddress = new JLabel("전화번호");
		JScrollPane jsp = new JScrollPane(jl);

		jtfName = new JTextField(8);

		jtfTel = new JTextField(8);

		// 성별
		jrbGender1 = new JRadioButton("남", true);
		jrbGender2 = new JRadioButton("여");
		bg = new ButtonGroup();
		bg.add(jrbGender1);
		bg.add(jrbGender2);

		jbtInput = new JButton("추가");
		jbtModify = new JButton("변경");
		jbtDelete = new JButton("삭제");

		jbtExit = new JButton("종료");

		HomeWorkEvent0130 hwd = new HomeWorkEvent0130(this);
		addWindowListener(hwd);
		jbtInput.addActionListener(hwd);
		jbtModify.addActionListener(hwd);
		jbtDelete.addActionListener(hwd);
		jbtExit.addActionListener(hwd);
		jl.addMouseListener(hwd);
		

		// 배치관리자 설정
		setLayout(null);

		// Button Container Component 생성
		JPanel jpButton = new JPanel();
		jpButton.setLayout(new GridLayout(1, 5));
		jpButton.add(jbtInput);
		jpButton.add(jbtModify);
		jpButton.add(jbtDelete);

		jpButton.add(jbtExit);

		// 컴포넌트의 위치와 크기 설정
		jlblName.setBounds(40, 20, 60, 20);
		jtfName.setBounds(80, 20, 100, 20);

		jlblAge.setBounds(40, 35, 60, 50);
		jcbbAge.setBounds(80, 50, 100, 20);

		jlblGender.setBounds(40, 80, 60, 20);
		jrbGender1.setBounds(80, 80, 50, 20);
		jrbGender2.setBounds(130, 80, 50, 20);

		jlblAddress.setBounds(30, 110, 60, 20);
		jtfTel.setBounds(80, 110, 100, 20);

		jsp.setBounds(220, 20, 280, 140);
		jpButton.setBounds(95, 170, 350, 30);

		// 배치
		add(jlblName);
		add(jtfName);
		add(jlblAge);
		add(jcbbAge);

		add(jlblGender);
		add(jrbGender1);
		add(jrbGender2);
		add(jlblAddress);
		add(jtfTel);
		add(jsp);
		add(jpButton);

		// 크기설정
		setBounds(200, 200, 550, 250);
		// 가시화
		setVisible(true);
		// 크기전환 금지
		setResizable(false);

	}//

	public JRadioButton getJrbGender1() {
		return jrbGender1;
	}


	public JRadioButton getJrbGender2() {
		return jrbGender2;
	}


	public JPanel getJpButton() {
		return jpButton;
	}

	public JComboBox<Integer> getJcbbAge() {
		return jcbbAge;
	}

	public DefaultListModel<String> getDlm() {
		return dlm;
	}

	public JList<String> getJl() {
		return jl;
	}

	public JTextField getJtfName() {
		return jtfName;
	}

	public JTextField getJtfTel() {
		return jtfTel;
	}

	public JButton getJbtInput() {
		return jbtInput;
	}

	public JButton getJbtModify() {
		return jbtModify;
	}

	public JButton getJbtDelete() {
		return jbtDelete;
	}

	public JButton getJbtExit() {
		return jbtExit;
	}

	public ButtonGroup getBg() {
		return bg;
	}

}
