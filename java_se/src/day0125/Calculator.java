package day0125;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Calculator extends JFrame {

	public Calculator() {
		
		
		super("계산기");
		
		String[] numArr = {"1","2","3","4","5","6","7","8","9","*","0","#"};
		
		JButton[] jrbArr = new JButton[numArr.length];
		
		JTextArea jtaNameDisplay = new JTextArea();
		
		
		
		
		
		
		
		
		
		//setLayout(new BorderLayout());


		
//		for (int i = 0; i < jrbArr.length; i++) {
//			
//			jrbArr[i] = new JButton(numArr[i]);
//			add(jrbArr[i]);
//		}
//		
		JPanel jpNorth = new JPanel(new BorderLayout());
		JPanel jpCenter = new JPanel(new GridLayout(4, 3)); //FlowLayout 순서
		
		jpCenter.setLayout(new GridLayout(4, 3));
		
		for (int i = 0; i < jrbArr.length; i++) {
			
			jrbArr[i] = new JButton(numArr[i]);
			jpCenter.add(jrbArr[i]);
		}
		
		jpNorth.add(jtaNameDisplay);
		
		add("Center", jpCenter);
		add("North",jpNorth);
		

		// 5. 윈도우 크기 설정
		setSize(300, 400);

		// 6. 가시화
		setVisible(true);

		// 7. 윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {

		new Calculator();
		
		
		

	}

}
