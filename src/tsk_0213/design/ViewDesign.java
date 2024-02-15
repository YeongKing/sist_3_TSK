package tsk_0213.design;

import tsk_0213.event.ViewEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ViewDesign extends JDialog {

	private WorkDesign wd;

	private JButton jbReport, jbOk;



	private JTextArea jtaResult;
	private JScrollPane jsp ;
	
	private String userId;
	private boolean chmodRWX;
	


	public ViewDesign(String result, WorkDesign wd, boolean modal) {
		super(wd, "필요한 정보", modal);
		this.wd = wd;
		this.userId = wd.getUserId();
		this.chmodRWX= wd.isChmodRWX();

		setLayout(null);

		setBounds(100, 100, 750, 420);

		jtaResult = new JTextArea(result);
		jtaResult.setBorder(new TitledBorder("결과물"));
		jsp = new JScrollPane(jtaResult);
		jtaResult.setEditable(false);
		
		jbReport = new JButton("Report");
		jbOk = new JButton("Ok");

		jbReport.setBounds(570, 130, 150, 50);
		jbOk.setBounds(570, 190, 150, 50);
		jsp.setBounds(20, 20, 540, 340);

		add(jbReport);
		add(jbOk);
		add(jsp);

		setResizable(false);
		

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
