package day0125;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

//1. Window Component 상속
@SuppressWarnings("serial")
public class UseLayoutManager extends JFrame {

	public UseLayoutManager() {
		super("여러 개의 레이아웃 사용");

		// 2. 컴포넌트를 생성
		// 헝가리엔네이밍 : 컴포넌트종류+하는일
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(10);// 고유크기 설정가능
		JComboBox<String> jcbGender = new JComboBox<String>();
		jcbGender.addItem("남자");
		jcbGender.addItem("여자");

		JButton jbtnInput = new JButton("입력");
		
		//글꼴 적용
		//1. Font 클래스 생성
		Font font = new Font("궁서체", Font.BOLD,20);
		
		jlblName.setFont(font);
		jtfName.setFont(font);
		jcbGender.setFont(font);
		jbtnInput.setFont(font);
		
		
		//글자색 => 상수
		jlblName.setForeground(Color.BLUE);
		//RGB
		Color color = new Color(0x03CD5C);
		jtfName.setForeground(color);
		jcbGender.setForeground(color);
		jbtnInput.setForeground(color);
		
		//바닥이 투명한 컴포넌트는 투명도를 설정해야한다.
		jlblName.setOpaque(true);
		jlblName.setBackground(new Color(0x3F7F5F));
		
		
		
		
		JTextArea jtaList = new JTextArea();
		jtaList.setFont(new Font("맑은 고딕", Font.ITALIC|Font.BOLD, 20));
		jtaList.setForeground(new Color(0xFFCE4B));
		jtaList.setBackground(Color.GRAY);
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
	//	setLocation(500, 100);
		setSize(450, 300);

		// 7. 윈도우 컴포넌트인 JFrame을 사용자에게 보여주기
		setVisible(true);

		// 8. 윈도우 컴포넌트의 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new UseLayoutManager();

	}// main

}// class
