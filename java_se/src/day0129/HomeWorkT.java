package day0129;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class HomeWorkT extends Frame implements ActionListener {

	private JTextField jtfId;
	private JPasswordField jpwfPW;
	private JLabel jlResult;

	Map<String, String> login;

	public HomeWorkT() {
		super("숙제 받아랏.");

		component();

		// HashMap은 좋은 선택
		login = new HashMap<String, String>();
		login.put("root", "1234");
		login.put("admin", "password");
		login.put("temp", "q1w2e3r4");

		jlResult.setForeground(Color.blue);
		jlResult.setText("아이디와 비밀번호를 입력해 주세요.");

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});

	}

	// 프레임 코드
	public void component() {

		jtfId = new JTextField();
		jpwfPW = new JPasswordField();
		jlResult = new JLabel();

		jtfId.addActionListener(this);
		jpwfPW.addActionListener(this);

		JScrollPane jsp1 = new JScrollPane(jtfId);
		JScrollPane jsp2 = new JScrollPane(jpwfPW);
		JScrollPane jsp3 = new JScrollPane(jlResult);

		jtfId.setBorder(new TitledBorder("아이디"));
		jpwfPW.setBorder(new TitledBorder("비밀번호"));
		jlResult.setBorder(new TitledBorder("결과"));

		setLayout(null);
		jsp1.setSize(300, 100);
		jsp2.setSize(300, 100);
		jsp3.setSize(300, 100);

		jsp1.setLocation(30, 33);
		jsp2.setLocation(30, 133);
		jsp3.setLocation(30, 233);

		add(jsp1);
		add(jsp2);
		add(jsp3);

		setSize(350, 350);
		setVisible(true);
		setResizable(false);
		setLocation(700, 200);

	}

	public static void main(String[] args) {
		new HomeWorkT();

	}// main



	@Override
	public void actionPerformed(ActionEvent e) {
		//아이디에서 엔터가 눌려지든, 비밀번호에서 엔터가 눌려지든 호출된다.
		System.out.println("dashkjashkj");
		// TODO Auto-generated method stub
		
	}// actionPerformed
	
	public void chkNull() {
		
		//아이디와 비밀번호를 받아서 입력 값이 존재하는지 판단.
		String id = jtfId.getText().trim();
		if(!(id.isEmpty())) {
			jpwfPW.requestFocus();
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}


}
