package tsk_0213.design;

<<<<<<< HEAD
import tsk_0213.event.ViewEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
=======
import javax.swing.JButton;
import javax.swing.JDialog;
>>>>>>> cadbb98e92050d1e4c0f53ca2a35d2d69a5cfb12
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

<<<<<<< HEAD
=======
import tsk_0213.event.ViewEvent;

>>>>>>> cadbb98e92050d1e4c0f53ca2a35d2d69a5cfb12
@SuppressWarnings("serial")
public class ViewDesign extends JDialog {

	private WorkDesign wd;

	private JButton jbReport, jbOk;



	private JTextArea jtaResult;
	private JScrollPane jsp ;
	
	private String userId;
	private boolean chmodRWX;
	


<<<<<<< HEAD
	public ViewDesign(String result, WorkDesign wd, boolean modal) {
=======
	public ViewDesign(String result,WorkDesign wd, boolean modal) {
>>>>>>> cadbb98e92050d1e4c0f53ca2a35d2d69a5cfb12
		super(wd, "필요한 정보", modal);
		this.wd = wd;
		this.userId = wd.getUserId();
		this.chmodRWX= wd.isChmodRWX();

		setLayout(null);

<<<<<<< HEAD
		setBounds(100, 100, 750, 420);
=======
		setBounds(100, 100, 750, 270);
>>>>>>> cadbb98e92050d1e4c0f53ca2a35d2d69a5cfb12

		jtaResult = new JTextArea(result);
		jtaResult.setBorder(new TitledBorder("결과물"));
		jsp = new JScrollPane(jtaResult);
		jtaResult.setEditable(false);
		
		jbReport = new JButton("Report");
		jbOk = new JButton("Ok");

<<<<<<< HEAD
		jbReport.setBounds(570, 130, 150, 50);
		jbOk.setBounds(570, 190, 150, 50);
		jsp.setBounds(20, 20, 540, 340);
=======
		jbReport.setBounds(570, 40, 150, 50);
		jbOk.setBounds(570, 110, 150, 50);
		jsp.setBounds(20, 20, 540, 180);
>>>>>>> cadbb98e92050d1e4c0f53ca2a35d2d69a5cfb12

		add(jbReport);
		add(jbOk);
		add(jsp);

		setResizable(false);
		
<<<<<<< HEAD

=======
		
>>>>>>> cadbb98e92050d1e4c0f53ca2a35d2d69a5cfb12
		ViewEvent ve = new ViewEvent(this);
		jbReport.addActionListener(ve);
		jbOk.addActionListener(ve);
		

	}

	public WorkDesign getWd() {
		return wd;
	}

	public JButton getJbReport() {
		return jbReport;
	}

	public JButton getJbOk() {
		return jbOk;
	}

	public JTextArea getJtaResult() {
		return jtaResult;
	}

	public JScrollPane getJsp() {
		return jsp;
	}

	public String getUserId() {
		return userId;
	}

	public boolean isChmodRWX() {
		return chmodRWX;
	}



}	// class
