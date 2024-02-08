package day0125;

import javax.swing.*;

@SuppressWarnings("serial")
public class UseImageIcon extends JFrame {

	public UseImageIcon() {
		super("이미지 연습");
		
		ImageIcon ii = new ImageIcon("E:/dev/workspace/java_se/src/day0125_images/img1.png");
		ImageIcon ii2 = new ImageIcon("E:/dev/workspace/java_se/src/day0125_images/img4.png");
		ImageIcon ii3 = new ImageIcon("E:/dev/workspace/java_se/src/day0125_images/img2.png");
		ImageIcon ii4 = new ImageIcon("E:/dev/workspace/java_se/src/day0125_images/img3.png");
		
		
		JLabel jl = new JLabel( ii );
		JButton jbtn = new JButton("지리는 이미지", ii2 );
		JButton jbtn2 = new JButton("클릭");
		JButton jbtn3 = new JButton("차차",ii3);
		
		
		//레이아웃 매니저 날리기 -> 수동배치
		setLayout(null);
		
		//컴포넌트 위치,크기 설정
		jl.setBounds(100,100,300,200);
		jbtn.setBounds(420,100,400,250);
		jbtn2.setBounds(200,200,80,30);
		jbtn3.setBounds(840,100,320,200);

		//버튼 제어
		//풍선도움말
		jbtn.setToolTipText("지림");
		jbtn3.setToolTipText("손흔드는 차차");
		
		//텍스트를 특정 위치로 보내기
		jbtn.setVerticalTextPosition(JButton.BOTTOM);
		jbtn3.setVerticalTextPosition(JButton.TOP);
		jbtn3.setHorizontalTextPosition(JButton.CENTER);
		
		//RollOver
		jbtn3.setRolloverIcon(ii4);


		
		
		
		
		
		//Frame에 컴포넌트 배치 // 배치 순서에 따라 안보였다 보여질 수 있음.
		add(jbtn2);
		add(jl);
		add(jbtn);
		add(jbtn3);
	


		
		setBounds(100,100,1600,800);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseImageIcon

	public static void main(String[] args) {

		new UseImageIcon();

	}// main

}// class
