package day0130;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class UseMouseListener extends JFrame implements ListSelectionListener {
	//이벤트와 관련 있는 컴포넌트를 인스턴스 변수에 선언
	private DefaultListModel<String> dlmFriends;
	private DefaultListModel<String> dlmBlockFriends;
	
	private JList<String> jlFriends;
	private JList<String> jlBlockFriends;
	private JButton jbtnBlockAll;
	
	public UseMouseListener() {
		super("친구 리스트");
		//MVC 패턴이 도입된 컴포넌트는 Model에 값을 설정한다.
		dlmFriends = new DefaultListModel<String>();
		dlmFriends.addElement("루피");
		dlmFriends.addElement("나루토");
		dlmFriends.addElement("이치고");
		dlmFriends.addElement("쵸파");
		dlmFriends.addElement("히루루크");

				
		dlmBlockFriends = new DefaultListModel<String>();
		
		//모델객체와 has a 관계로 View객체를 생성
		jlFriends = new JList<String>(dlmFriends);
		jlBlockFriends = new JList<String>(dlmBlockFriends);
		
		jbtnBlockAll = new JButton(">>");
		
		JScrollPane jspFriends = new JScrollPane(jlFriends);
		JScrollPane jspBlockFriends = new JScrollPane(jlBlockFriends);
		
		jspFriends.setBorder(new TitledBorder("친구"));
		jspBlockFriends.setBorder(new TitledBorder("차단된 친구"));
		
		//이벤트에 컴포넌트를 등록
		jlFriends.addListSelectionListener(this);
		
		
		//수동배치
		setLayout(null);

		jspFriends.setBounds(20,20,150,200);
		jbtnBlockAll.setBounds(185,100,50,30);
		jspBlockFriends.setBounds(250,20,150,200);
		
		add(jspFriends);
		add(jbtnBlockAll);
		add(jspBlockFriends);
		
		setBounds(100,100,440,280);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
new UseMouseListener();
	}//main





	@Override
	public void valueChanged(ListSelectionEvent e) {
		System.out.println(dlmFriends.getElementAt(jlFriends.getSelectedIndex()));
	}//valueChanged

}//class
