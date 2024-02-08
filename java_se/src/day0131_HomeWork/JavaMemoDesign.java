package day0131_HomeWork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import day0130.NameManagementEvent;
import day0131_HomeWork.JavaMemoDesign;

/**
 * 숙제 "새글"이 눌려지면 J.T.A를 초기화한다. "열기"가 눌려지면 FileDialog를 "열기모드"로 생성하고 선택한 파일의 "경로와
 * 파일명"을 열기를 앞에 붙여 "타이틀 바"에 설정한다. => 열기 경로/파일명 // ok
 * 
 * "저장"이 눌려지면 FileDialog를 "저장모드"로 생성하고 선택한 파일의 "경로와 파일명"을 저장을 앞에 붙여 "타이틀 바"에
 * 설정한다. => 저장 경로/파일명 // ok
 * 
 * "종료"가 눌려지면 메모장을 종료한다.// ok
 * 
 * "글꼴" 눌려지면 아래 다이얼 로그를 보여준다.
 * 
 */
@SuppressWarnings("serial")
public class JavaMemoDesign extends JFrame {

	JMenuBar jmb;

	JMenu jm1;

	JMenu jm2;
	JMenu jm3;

	JMenuItem jmi1;
	JMenuItem jmi1_1;
	JMenuItem jmi1_2;
	JMenuItem jmi1_3;

	JMenuItem jmi2;

	JMenuItem jmi3;

	JTextArea area;
	JScrollPane sp;

	public JavaMemoDesign() {
		super("메모장");
//    1. MenuBar 생성
		jmb = new JMenuBar();

//     2. Menu 생성
		jm1 = new JMenu("파일");

		jm2 = new JMenu("서식");
		jm3 = new JMenu("도움말");

//     3. MenuItem 생성

		jmi1 = new JMenuItem("새글");
		jmi1_1 = new JMenuItem("열기");
		jmi1_2 = new JMenuItem("저장");
		jmi1_3 = new JMenuItem("종료");

		jmi2 = new JMenuItem("글꼴");

		jmi3 = new JMenuItem("메모장 정보");

		area = new JTextArea();
		sp = new JScrollPane(area); // 스크롤판 추가
		add(sp); // 화면에 추가

//     4. Menu에 MenuItem 배치
//      메뉴객체명.add(메뉴아이템객체);

		jm1.add(jmi1);
		jm1.addSeparator();
		jm1.add(jmi1_1);

		jm1.add(jmi1_2);
		jm1.addSeparator();
		jm1.add(jmi1_3);
		jm2.add(jmi2);
		jm3.add(jmi3);

//     5. MenuItem을 가진 Menu를 MenuBar 붙임
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);

//     6. JMenuBar를 JFrame에 설정
		setJMenuBar(jmb);

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JavaMemoEvent jme = new JavaMemoEvent(this);
		addWindowListener(jme);
		jmi1.addActionListener(jme);
		jmi1_1.addActionListener(jme);
		jmi1_2.addActionListener(jme);
		jmi1_3.addActionListener(jme);
		jmi2.addActionListener(jme);
		jmi3.addActionListener(jme);
		
		

	}

	public JMenuBar getJmb() {
		return jmb;
	}

	public JMenu getJm1() {
		return jm1;
	}

	public JMenu getJm2() {
		return jm2;
	}

	public JMenu getJm3() {
		return jm3;
	}

	public JMenuItem getJmi1() {
		return jmi1;
	}

	public JMenuItem getJmi1_1() {
		return jmi1_1;
	}

	public JMenuItem getJmi1_2() {
		return jmi1_2;
	}

	public JMenuItem getJmi1_3() {
		return jmi1_3;
	}

	public JMenuItem getJmi2() {
		return jmi2;
	}

	public JMenuItem getJmi3() {
		return jmi3;
	}

	public JTextArea getArea() {
		return area;
	}

	public JScrollPane getSp() {
		return sp;
	}

}// class
