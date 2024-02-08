package day0126;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class UseMenuBar extends JFrame{

	public UseMenuBar() {
		super("메뉴바 연습");
		
//	    1. MenuBar 생성
	      JMenuBar jmb = new JMenuBar();
	      
	      
//	     2. Menu 생성
	      JMenu jm1 = new JMenu("1번 메뉴");
	      JMenu jm1_1 = new JMenu("1번 메뉴의메뉴");
	      
	      JMenu jm2 = new JMenu("2번 메뉴");
	      
	      
	      //JMenu jmFile = new JMenu("파일");
	      //JMenu jmEdit = new JMenu("편집");
	      
	      
//	     3. MenuItem 생성
	      //JMenuItem jmi = new JMenuItem("라벨")  ;
	      JMenuItem jmi1 = new JMenuItem("1번의 하위메뉴 아이템");
	      JMenuItem jmi1_1 = new JMenuItem("1번의 두번째 메뉴아이템");
	      JMenuItem jmi1_2 = new JMenuItem("1번의 세번째 메뉴아이템");
	      
	      JMenuItem jmi2 = new JMenuItem("2번의 하위메뉴 아이템");
	      JMenuItem jmi2_1 = new JMenuItem("2번의 두번째 메뉴아이템");
	      JMenuItem jmi2_2 = new JMenuItem("2번의 세번째 메뉴아이템");
	      
	      
	      jm1_1.add("하위메뉴1");
	      jm1_1.add("하위메뉴2");
	      jm1_1.add("하위메뉴3");
	      jm1_1.add("하위메뉴4");
	      
	      
//	     4. Menu에 MenuItem 배치
//          메뉴객체명.add(메뉴아이템객체);
	      
	      jm1.add(jmi1);
	      jm1.addSeparator();
	      jm1.add(jm1_1);
	      jm1.addSeparator();
	      jm1.add(jmi1_1);

	      jm1.add(jmi1_2);
	      
	      jm2.add(jmi2);
	      jm2.add(jmi2_1);
	      jm2.add(jmi2_2);
	      
	      
//	     5. MenuItem을 가진 Menu를 MenuBar 붙임
	      jmb.add(jm1);
	      jmb.add(jm2);
	      
	      
//	     6. JMenuBar를 JFrame에 설정
	      setJMenuBar(jmb);
	      
	      
	      setSize(800,400);
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
		
		
		

		
		
		
		
		
		
		
		
		
	}//UseMenuBar

	public static void main(String[] args) {

		new UseMenuBar();
		
		
	}//main

}//class
