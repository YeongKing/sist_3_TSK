package day0130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 * 이벤트를 모아 처리하기 위해서
 */
public class HomeWorkEvent0130 extends WindowAdapter implements ActionListener ,MouseListener{

	private HomeWorkDesign0130 hwd;

	public HomeWorkEvent0130(HomeWorkDesign0130 hwd) {
		this.hwd = hwd;
	}

	@Override
	public void windowClosing(WindowEvent we) {

		hwd.dispose();

	}// windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {

		// 이벤트 비교

		if (ae.getSource() == hwd.getJbtInput()) {
			input();
		}
		if (ae.getSource() == hwd.getJbtModify()) {
			modify();
		}
		if (ae.getSource() == hwd.getJbtDelete()) {
			delete();
		}
		if (ae.getSource() == hwd.getJbtExit()) {
			exit();
		}

		
		
		

	}// actionPerformed

	private void input() {

		String name = hwd.getJtfName().getText().trim();

		int age = (int) hwd.getJcbbAge().getSelectedItem();

		String tel = hwd.getJtfTel().getText().trim();

		String gender = hwd.getJrbGender1().isSelected() ? hwd.getJrbGender1().getText()
				: hwd.getJrbGender2().getText();

		if ((!name.isEmpty()) && !tel.isEmpty()) {

			hwd.getDlm().addElement(name + "," + age + "," + gender + "," + tel);

		}
		
	
		
		

	}// addName

	@SuppressWarnings("unlikely-arg-type")
	private void modify() {

		int age = (int) hwd.getJcbbAge().getSelectedItem();
		String tel = hwd.getJtfTel().getText().trim();

		JTextField jtfName = hwd.getJtfName();
		String name = jtfName.getText();

		DefaultListModel<String> dlmName = hwd.getDlm();

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < dlmName.size(); i++) {

			String tempStr = dlmName.getElementAt(i);
			String[] checkStr = tempStr.split(",");
			String result = "";
//			System.out.println(i + "번째 입력값" + checkStr[0]);
			if (checkStr[0].equals(name)) {
//				System.out.println("동일한이름");
				checkStr[1] = Integer.toString(age);
				checkStr[3] = tel;

				result = String.join(",", checkStr);

				list.add(result);
			} else {
				list.add(tempStr);

			}


			
		} // end for
		dlmName.removeAllElements();// Model의 모든 아이템을 삭제하고

		for (String value : list) {// 리스트에 저장된 값으로 Model에 추가
			dlmName.addElement(value);

		}

	}// modify

	private void delete() {

		JTextField jtfName = hwd.getJtfName();
		String name = jtfName.getText();

		DefaultListModel<String> dlmName = hwd.getDlm();

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < dlmName.size(); i++) {

			String tempStr = dlmName.getElementAt(i);
			String[] checkStr = tempStr.split(",");
//			System.out.println(i + "번째 입력값" + checkStr[0]);
			if (!checkStr[0].equals(name)) {
				list.add(tempStr);
			}

		} // end for
		dlmName.removeAllElements();// Model의 모든 아이템을 삭제하고

		for (String value : list) {// 리스트에 저장된 값으로 Model에 추가
			dlmName.addElement(value);

		}

	}// delete

	private void exit() {
		hwd.dispose();
	}// exit

	@Override
	public void mouseClicked(MouseEvent me) {
		
		 JList<String> jl = hwd.getJl();
		 DefaultListModel<String> dlmName = hwd.getDlm();
		
		
		if (me.getSource() == hwd.getJl()) {

			int index = jl.getSelectedIndex();
			if (index != -1) {
				// 선택된 인덱스에 해당하는 값을 Model에서 얻고
				String name = dlmName.getElementAt(index);//추출한 string값
				
				String[] elements = name.split(",");// 4개 생성
				
				System.out.println("요소 추출 후 4개로 분리 완료");
				
				for (int i = 0; i < elements.length; i++) {
					
					System.out.println(elements[i]);
					
					
				}// 요소 4개 추출완료 
				
				
				//////해당 칸에 설정하는기능 구현///////

				
				
				


			}
		} // mouseClicked
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}// class
