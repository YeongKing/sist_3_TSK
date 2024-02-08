package day0125;

import javax.swing.*;

@SuppressWarnings("serial")
public class ManualLayout extends JFrame {

	public ManualLayout() {
		super("수동배치");

		JButton jbtn = new JButton("버튼");
		String[] dataArr = { "자장면", "김밥", "백반", "뼈해장국", "순대국밥", "돈가스" ,"을밀대 냉면"};
		JList<String> jl = new JList<String>(dataArr);

		JPasswordField jpf = new JPasswordField();

		setLayout(null);

		setSize(600, 600); //java.awt.Window클래스에서 Override
		setLocation(600,200); //시작좌표가 Frame 안쪽이 아닌 모니터 좌상단

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 컴포넌트의 크기 설정
		jbtn.setSize(80, 30);
		jl.setSize(150, 100);
		//jpf.setSize(90, 25);

		// 컴포넌트의 위치 설정

		jbtn.setLocation(50, 130);
		jl.setLocation(160, 210);
		//jpf.setLocation(480, 500);

		// 컴포넌트의 크기,위치 한번에 설정

//		jbtn.setBounds(10, 20, 80, 30);
//		jl.setBounds(130, 100, 100, 200);
		jpf.setBounds(360, 40, 120, 40);

		// 6. 컴포넌트 배치
		add(jbtn);
		add(jl);
		add(jpf);

		// 7. 윈도우 크기와 보여지는 위치 설정
		// 프레임의 setLocation은 모니터의 왼쪽 상단이 시작점
		// setBounds(100, 100, 400, 300);

		// 윈도우 크기조절 막기
		setResizable(false);

	}// ManualLayout

	public static void main(String[] args) {

		new ManualLayout();

	}// main

}// class
