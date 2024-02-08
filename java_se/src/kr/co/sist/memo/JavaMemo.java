package kr.co.sist.memo;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 1. 패키지명은 kr.co.sist.memo이고 JavaMemo클래스에서 디자인을 구현한다. 실행하는 RunJavaMemo클래스를 만들고
 * 디자인 클래스를 생성하여 실행한다. (자동배치관리자.)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 2.수동배치를 사용하여 아래의 디자인을 가지는 클래스를 작성 자바텍스트박스 2개 자바콤보박스 1개 : 20~40까지 들어있어야함 성별 :
 * 그룹으로 묶임 라디오버튼, 자신의 성별이 체크되어있는상태보여지고 추가 변경 삭제 종료 : JButton 오른쪽화면 : J리스트 :
 * 1,진수현,남,010-1234-5678 2,김동섭,남,010-2345-6789
 * 
 * 
 */
@SuppressWarnings("serial")
public class JavaMemo extends JFrame {
	public JavaMemo() {
		super("메모장");
//    1. MenuBar 생성
		JMenuBar jmb = new JMenuBar();

//     2. Menu 생성
		JMenu jm1 = new JMenu("파일");
		// JMenu jm1_1 = new JMenu("1번 메뉴의메뉴");

		JMenu jm2 = new JMenu("도움말");

		// JMenu jmFile = new JMenu("파일");
		// JMenu jmEdit = new JMenu("편집");

//     3. MenuItem 생성
		// JMenuItem jmi = new JMenuItem("라벨") ;
		JMenuItem jmi1 = new JMenuItem("새글");
		JMenuItem jmi1_1 = new JMenuItem("열기");
		JMenuItem jmi1_2 = new JMenuItem("저장");
		JMenuItem jmi1_3 = new JMenuItem("종료");

		JMenuItem jmi2 = new JMenuItem("메모장 정보");

		JTextArea area= new JTextArea();
		JScrollPane sp= new JScrollPane(area);  //스크롤판 추가
		add(sp); //화면에 추가
		 
		//area.append(log);  // 출력로그 JTextArea 출력
		//area.setCaretPosition(txtLog.getDocument().getLength());
		
		
		
		
		

//     4. Menu에 MenuItem 배치
//      메뉴객체명.add(메뉴아이템객체);

		jm1.add(jmi1);
		jm1.addSeparator();
		jm1.add(jmi1_1);

		jm1.add(jmi1_2);
		jm1.addSeparator();
		jm1.add(jmi1_3);

		jm2.add(jmi2);

//     5. MenuItem을 가진 Menu를 MenuBar 붙임
		jmb.add(jm1);
		jmb.add(jm2);

//     6. JMenuBar를 JFrame에 설정
		setJMenuBar(jmb);

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}// class
