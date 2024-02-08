package day0131Teacher;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HomeWorkEvent extends WindowAdapter implements ActionListener {

	private HomeWorkDesign hwd;
	

	
	public HomeWorkEvent(HomeWorkDesign hwd) {
		this.hwd = hwd;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//이벤트 비교
		if(ae.getSource() == hwd.getAddButon()) {
			addData();
			
		}
		
		if(ae.getSource() == hwd.getChangeButon()) {
			changeData();
			System.out.println(2);
		}
		
		if(ae.getSource() == hwd.getDeleteButon()) {
			deleteData();
			System.out.println(3);
		}
		
		if(ae.getSource() == hwd.getEndButon()) {
			endOver();
			JRadioButton jtfMan = hwd.getMan();
			JRadioButton jtfWman = hwd.getWman();
			
			System.out.println(jtfMan.isSelected());

		}
		

	}
	
	@Override
	public void windowClosing(WindowEvent we) {
		hwd.dispose();
	}
	
	private void addData() {
		StringBuilder sb1 = new StringBuilder();
		JTextField jtfName = hwd.getJtfName();
		DefaultComboBoxModel<String> age = hwd.getAge();
		JTextField jtfCallNum = hwd.getJftCallNum();
		JRadioButton jtfMan = hwd.getMan();
		JRadioButton jtfWman = hwd.getWman();
		
		String name = jtfName.getText();
		String callNum = jtfCallNum.getText();
		
		if(!name.isEmpty() && !callNum.isEmpty()) {
			
			sb1.append(name).append(",").append(age.getSelectedItem());
			
			if(jtfMan.isSelected()) {
				sb1.append(",").append(jtfMan.getText());
				
			}else {
				sb1.append(",").append(jtfWman.getText());
			}
			
			sb1.append(",").append(callNum);
			
			hwd.getDlmData().addElement(sb1.toString());
			jtfName.setText("");
			jtfCallNum.setText("");
			jtfName.requestFocus();
			
		}
		
		
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	private void changeData() {
	
		StringBuilder sb1 = new StringBuilder();
		JTextField jtfName = hwd.getJtfName();
		DefaultComboBoxModel<String> age = hwd.getAge();
		JTextField jtfCallNum = hwd.getJftCallNum();
		JRadioButton jtfMan = hwd.getMan();
		JRadioButton jtfWman = hwd.getWman();
		
		
		DefaultListModel<String> dlmData = hwd.getDlmData();
		List<String> list = new ArrayList<String>();
		
		for (int i =0; i<dlmData.size(); i++) {
			String stName =
			dlmData.elementAt(i).substring(0,dlmData.elementAt(i).indexOf(","));
			
			if(jtfName.getText().equals(stName)) {
				dlmData.remove(i);
				
				sb1.append(jtfName.getText()).append(",").append(age.getSelectedItem());
				
				if(jtfMan.isSelected()) {
					sb1.append(",").append(jtfMan.getText());
					
				}else {
					sb1.append(",").append(jtfWman.getText());
				}
				
				sb1.append(",").append(jtfCallNum.getText());
				
				hwd.getDlmData().addElement(sb1.toString());
				jtfName.setText("");
				jtfCallNum.setText("");
				jtfName.requestFocus();

			}
		}

	}
	
	private void deleteData() {
		DefaultListModel<String> dlmData = hwd.getDlmData();
		dlmData.removeAllElements();
		
	}
	
	private void endOver() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
