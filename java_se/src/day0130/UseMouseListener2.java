package day0130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class UseMouseListener2 extends JFrame implements MouseListener, ActionListener {
	// 이벤트와 관련 있는 컴포넌트를 인스턴스 변수에 선언
	private DefaultListModel<String> dlmFriends;
	private DefaultListModel<String> dlmBlockFriends;

	private JList<String> jlFriends;
	private JList<String> jlBlockFriends;
	private JButton jbtnBlockAll;
	private JButton jbtnFriendsAll;

	public UseMouseListener2() {
		super("친구 리스트");
		// MVC 패턴이 도입된 컴포넌트는 Model에 값을 설정한다.
		dlmFriends = new DefaultListModel<String>();
		dlmFriends.addElement("루피");
		dlmFriends.addElement("나루토");
		dlmFriends.addElement("이치고");
		dlmFriends.addElement("쵸파");
		dlmFriends.addElement("히루루크");

		dlmBlockFriends = new DefaultListModel<String>();

		// 모델객체와 has a 관계로 View객체를 생성
		jlFriends = new JList<String>(dlmFriends);
		jlBlockFriends = new JList<String>(dlmBlockFriends);

		jbtnBlockAll = new JButton(">>");
		jbtnFriendsAll = new JButton("<<");

		JScrollPane jspFriends = new JScrollPane(jlFriends);
		JScrollPane jspBlockFriends = new JScrollPane(jlBlockFriends);

		jspFriends.setBorder(new TitledBorder("친구"));
		jspBlockFriends.setBorder(new TitledBorder("차단된 친구"));

		// 이벤트에 컴포넌트를 등록
		jlFriends.addMouseListener(this);
		jlBlockFriends.addMouseListener(this);

		jbtnBlockAll.addActionListener(this);
		jbtnFriendsAll.addActionListener(this);

		// 수동배치
		setLayout(null);

		jspFriends.setBounds(20, 20, 150, 200);
		jbtnBlockAll.setBounds(185, 70, 50, 30);
		jbtnFriendsAll.setBounds(185, 120, 50, 30);
		jspBlockFriends.setBounds(250, 20, 150, 200);

		add(jspFriends);
		add(jbtnBlockAll);
		add(jbtnFriendsAll);
		add(jspBlockFriends);

		setBounds(100, 100, 440, 280);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

	}

	@Override
	public void mouseClicked(MouseEvent me) {


		if (me.getSource() == jlFriends) {

			int index = jlFriends.getSelectedIndex();
			if (index != -1) {
				// 선택된 인덱스에 해당하는 값을 Model에서 얻고
				String name = dlmFriends.getElementAt(index);

				// 얻어낸 값을 차단된 친구로 등록 (dlmBlockFriends)
				dlmBlockFriends.addElement(name);

				// 선택된 인덱스에 해당하는 값을 Model에서 삭제
				dlmFriends.remove(index);

			}
		} 
	if (me.getSource() == jlBlockFriends) {

			int blockIndex = jlBlockFriends.getSelectedIndex();
			if (blockIndex != -1) {
				// 선택된 인덱스에 해당하는 값을 Model에서 얻고
				String name = dlmBlockFriends.getElementAt(blockIndex);

				// 얻어낸 값을 차단된 친구로 등록 (dlmBlockFriends)
				dlmFriends.addElement(name);

				// 선택된 인덱스에 해당하는 값을 Model에서 삭제
				dlmBlockFriends.remove(blockIndex);

				}

			}


	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jbtnBlockAll) {

			for (int i = 0; i < dlmFriends.getSize(); i++) {
				// 친구리스트에서 모든 값을 가져와서 차단된 친구리스트에 넣고
				dlmBlockFriends.addElement(dlmFriends.elementAt(i));
			}
			// 삭제한다.
			dlmFriends.clear();

		}
		if (ae.getSource() == jbtnFriendsAll) {

			for (int i = 0; i < dlmBlockFriends.getSize(); i++) {
				// 친구리스트에서 모든 값을 가져와서 차단된 친구리스트에 넣고
				dlmFriends.addElement(dlmBlockFriends.elementAt(i));
			}
			// 삭제한다.
			dlmBlockFriends.clear();

		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("mousePressed");	 // 처음 클릭 되었을 때

	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("mouseReleased");  //클릭된 키가 올라왔을 때

	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("mouseEntered");	

	}

	@Override
	public void mouseExited(MouseEvent e) {
//		System.out.println("mouseExited");	

	}

	public static void main(String[] args) {
		new UseMouseListener2();
	}// main

}// class
