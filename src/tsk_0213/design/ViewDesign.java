package tsk_0213.design;

import tsk_0213.event.ViewEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ViewDesign extends JDialog {

	private WorkDesign wd;

	private JButton jbReport, jbOk;

	private JLabel jlResult;

	public ViewDesign(WorkDesign wd, boolean modal) {
		super(wd, modal);
		this.wd = wd;

		setLayout(null);

		setBounds(100, 100, 700, 700);

		jlResult = new JLabel("JLabel Test");
		jlResult.setBorder(new TitledBorder("결과물"));
		jbReport = new JButton("Report");
		jbOk = new JButton("Ok");

		jbReport.setBounds(500, 50, 150, 50);
		jbOk.setBounds(500, 120, 150, 50);
		jlResult.setBounds(20, 20, 450, 600);

		add(jbReport);
		add(jbOk);
		add(jlResult);

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

	public JLabel getJlResult() {
		return jlResult;
	}



}	// class
