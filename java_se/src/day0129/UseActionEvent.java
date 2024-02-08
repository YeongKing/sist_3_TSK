package day0129;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//1. Window Component 상속 , 이벤트 처리용 XxxListener 구현
@SuppressWarnings("serial")
public class UseActionEvent extends JFrame implements ActionListener {

	// 3. Override한 method안에서 사용해야할 컴포넌트를 인스턴스 변수로 선언
	private JTextField jtfName;
	private JTextArea jtaList;

	private JComboBox<String> jcbGender;
	


	public UseActionEvent() {

		super("여러 개의 레이아웃 사용");

		// 2. 컴포넌트를 생성
		// 헝가리엔네이밍 : 컴포넌트종류+하는일
		JLabel jlblName = new JLabel("이름");
		jtfName = new JTextField(10);// 고유크기 설정가능

		jcbGender = new JComboBox<String>();//MVC패턴을 적용할 클래스인데 모델을 사용하지 않음.

		jcbGender.addItem("남자");
		jcbGender.addItem("여자");
		JButton jbtnInput = new JButton("입력");

		jtfName.addActionListener(this);
		jbtnInput.addActionListener(this);

		jtaList = new JTextArea();
		jtaList.setEditable(false); //텍스트 수정 가능여부 설정

		JScrollPane jscp = new JScrollPane(jtaList);

		// 3. 배치관리자 설정
//			
//			add("North",jlblName);
//			add("North",jtfName);
//			add("North",jcbGender);
//			add("North",jbtnInput);

		// 여러개의 컴포넌트를 관리하기 위해서 Container Component를 사용.

		JPanel jpNorth = new JPanel();
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jcbGender);
		jpNorth.add(jbtnInput);

		// 윈도우 컴포넌트에 (사용자에게 보여주는 일) 배치

		add("North", jpNorth);
		add("Center", jscp);

		////////////////////////////////////////////////////////////////////
//			setLayout(new BorderLayout());
//			
//			//4. 컴포넌트배치
//			//BorderLayout은 하나의 영역에 하나의 컴포넌트만 배치할 수 있다.
//			//North 영역에는 여러 개의 컴포넌트가 한 번에 배치되어야 하므로
//			//Container Component인 JPanel이 필요하다.
//			JPanel jpNorth = new JPanel(); //FlowLayout 순서
//			
//			//Container Component에 레이아웃 설정
//			jpNorth.setLayout(new FlowLayout());
//			
//			//일반 Component를 Container Component에 배치
//			jpNorth.add(jlblName);
//			jpNorth.add(jtfName);
//			jpNorth.add(jbtnInput);
//			
//			add("North", jlblName);//입력되지 않은 영역은 자동으로 사라짐
//			add("North", jtfName); //입력되지 않은 영역은 자동으로 사라짐
//			add("North", jbtnInput);//입력되지 않은 영역은 자동으로 사라짐
//			
//			add("North", jpNorth); //하나의 영역에 하나의 컴포넌트만 배치
//			add("Center", jtaNameDisplay);
//			//////////////////////////////////////////////////////////////////////
		// 6. 윈도우 컴포넌트인 JFrame의 크기 설정
		// setLocation(500, 100);
		setSize(450, 300);

		// 7. 윈도우 컴포넌트인 JFrame을 사용자에게 보여주기
		setVisible(true);

		// 8. 윈도우 컴포넌트의 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 2. XxxListener에 abstract method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		// 이벤트가 발생했을 때 사용자에게 제공할 코드
		// JTextField의 값을 가져와서 JTextArea에 설정한다.

		String data = jtfName.getText();
		
		//Model 객체를 사용하지 않았으므로 View객체에서 선택된 아이템의 갓을 얻습니다.
		String gender = (String)jcbGender.getSelectedItem();

		jtaList.append(gender+ " : " +data + "님\n");// 개행문자 추가
		jtfName.setText(""); // 기존 텍스트에 있던 글자 초기화
		jtfName.requestFocus(); // 입력가능 텍스트에 포커스

	}// actionPerformed

	public static void main(String[] args) {

		new UseActionEvent();

	}// main

}// class
