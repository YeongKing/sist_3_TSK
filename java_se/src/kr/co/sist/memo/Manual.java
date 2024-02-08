package kr.co.sist.memo;

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

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Manual extends JFrame {
	
	public Manual() {
		super("숙제");
		
		//컴포넌트 생성
		JLabel jlblName = new JLabel("이름");

		
		Integer[] arr = {20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40
	
		};
		
		
		
		JComboBox<Integer> jcbbAge = new JComboBox<Integer>(arr);
		
		
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		JList<String> jl = new JList<String>(dlm);
		dlm.addElement("1,진수현,남,010-1234-5678");
		dlm.addElement("2,김동섭,남,010-2345-6789");

		
		
		JLabel jlblAge = new JLabel("나이");
		JLabel jlblGender = new JLabel("성별");
		JLabel jlblAddress = new JLabel("전화번호");
		
		JTextField jtfName = new JTextField(8);
		
		JTextField jtfAddress = new JTextField(8);
		
		//성별
		JRadioButton jrbGender1 = new JRadioButton("남", true);
		JRadioButton jrbGender2 = new JRadioButton("여");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbGender1);
		bg.add(jrbGender2);
		
		JButton jbtInput = new JButton("추가");
		JButton jbtModify = new JButton("변경");
		JButton jbtDelete = new JButton("삭제");

		JButton jbtExit = new JButton("종료");

		


		
		//배치관리자 설정
		setLayout(null);
				
		//Button Container Component 생성
		JPanel jpButton = new JPanel();		
		jpButton.setLayout(new GridLayout(1, 5));
		jpButton.add(jbtInput);
		jpButton.add(jbtModify);
		jpButton.add(jbtDelete);

		jpButton.add(jbtExit);
		
		//컴포넌트의 위치와 크기 설정
		jlblName.setBounds(40, 20, 60, 20);
		jtfName.setBounds(80, 20, 100, 20);
		
		jlblAge.setBounds(40, 35, 60, 50);
		jcbbAge.setBounds(80, 50, 100, 20);
		
		
		jlblGender.setBounds(40, 80, 60, 20);
		jrbGender1.setBounds(80, 80, 50, 20);
		jrbGender2.setBounds(130, 80, 50, 20);
		
		jlblAddress.setBounds(30, 110, 60, 20);
		jtfAddress.setBounds(80, 110, 100, 20);
		
		jl.setBounds(220, 20, 280, 140);
		jpButton.setBounds(95, 170, 350, 30);
		
		//배치
		add(jlblName);
		add(jtfName);
		add(jlblAge);
		add(jcbbAge);
		
		add(jlblGender);
		add(jrbGender1);
		add(jrbGender2);
		add(jlblAddress);
		add(jtfAddress);
		add(jl);
		add(jpButton);

		//크기설정
		setBounds(200, 200, 550, 250);
		//가시화
		setVisible(true);
		//종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//
	
		
		
	}
	
	
	


