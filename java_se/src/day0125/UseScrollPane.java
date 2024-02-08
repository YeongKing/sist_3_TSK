package day0125;

import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class UseScrollPane extends JFrame {

	
	public UseScrollPane() {
		super("스크롤 바 연습");
		
		JTextArea jta = new JTextArea("adjlkaflkajdlksajdlkjl");
		
		String[] dataArr = "자바,오라클,JDBC,HTML,CSS,JavaScript,JavaScript Library,Servlet/JSP,JSON,XML,AJAX".split(",");
		
		JTextArea jta2 = new JTextArea("adjlkaflkajdlksajdlkjl");
		//줄 단위의 보호
		jta2.setLineWrap(true);
		//단어 단위로 보호 ( 한글은 안됨 )
		jta2.setWrapStyleWord(true);
		
		JList<String> jl = new JList<String>(dataArr);
		
		//BorderLayout -> GridLayout으로 배치관리자를 변경
		
		setLayout(new GridLayout(1,2));
		
		//스크롤바가 필요한 컴포넌트를 위해 JScrollPane을 생성
		
		JScrollPane jsp = new JScrollPane(jta);
		JScrollPane jsp2 = new JScrollPane(jl);
		JScrollPane jsp3 = new JScrollPane(jta2);
	
		
		
		add(jsp);
		add(jsp2);
		add(jsp3);
		
		setBounds(100,100,300,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		

		
		
		
	}//UseScrollPane
	
	
	
	public static void main(String[] args) {
		new UseScrollPane();
	}//main

}//class
