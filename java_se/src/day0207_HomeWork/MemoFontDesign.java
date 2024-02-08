package day0207_HomeWork;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class MemoFontDesign extends JDialog {
	private JTextField jtfFont, jtfStyle, jtfSize;
	private JList jlFont, jlStyle, jlSize;
	private DefaultListModel<String> dlmFont, dlmStyle, dlmSize;
	private JLabel jlPreview;
	private JButton jbtnCheck, jbCancel;
	private JavaMemoDesign jmd;

	public MemoFontDesign(JavaMemoDesign jmd) {
		super( jmd, "글꼴", false);
		this.jmd = jmd;

		jtfFont = new JTextField("고딕체");
		jtfStyle = new JTextField("일반");
		jtfSize = new JTextField("12");

		JLabel font = new JLabel("글꼴 : ");
		JLabel style = new JLabel("글꼴 스타일 : ");
		JLabel size = new JLabel("크기 : ");

		dlmFont = new DefaultListModel<String>();
		dlmStyle = new DefaultListModel<String>();
		dlmSize = new DefaultListModel<String>();

		jlPreview = new JLabel("abcdㄱㄴㄷㄹ1234");
		jlPreview.setBorder(new TitledBorder("보기"));

		jbtnCheck = new JButton("확인");
		jbCancel = new JButton("취소");

		dlmFont.addElement("고딕체");
		dlmFont.addElement("궁서체");
		dlmFont.addElement("Consolas");
		dlmFont.addElement("새굴림");
		dlmFont.addElement("맑은 고딕");

		dlmStyle.addElement("일반");
		dlmStyle.addElement("굵게");
		dlmStyle.addElement("기울임꼴");
		dlmStyle.addElement("굵은 기울임꼴");

		for (int i = 12; i <= 80; i += 2) {
			dlmSize.addElement(i + "");

		}

		jlFont = new JList(dlmFont);
		jlStyle = new JList(dlmStyle);
		jlSize = new JList(dlmSize);

		jlFont.setSelectedIndex(0);
		jlStyle.setSelectedIndex(0);
		jlSize.setSelectedIndex(0);

		JScrollPane jspFont = new JScrollPane(jlFont);
		JScrollPane jspStyle = new JScrollPane(jlStyle);
		JScrollPane jspSize = new JScrollPane(jlSize);

		jbtnCheck = new JButton("확인");
		jbCancel = new JButton("취소");

		font.setBounds(20, 20, 100, 20);
		jtfFont.setBounds(20, 40, 100, 20);
		jspFont.setBounds(20, 65, 100, 90);

		style.setBounds(130, 20, 100, 20);
		jtfStyle.setBounds(130, 40, 100, 20);
		jspStyle.setBounds(130, 65, 100, 90);

		size.setBounds(240, 20, 100, 20);
		jtfSize.setBounds(240, 40, 100, 20);
		jspSize.setBounds(240, 65, 100, 90);

		jlPreview.setBounds(130, 160, 210, 100);

		jbtnCheck.setBounds(180, 270, 70, 20);
		jbCancel.setBounds(260, 270, 70, 20);

		add(font);
		add(jtfFont);
		add(jspFont);

		add(style);
		add(jtfStyle);
		add(jspStyle);

		add(size);
		add(jtfSize);
		add(jspSize);

		add(jlPreview);

		add(jbtnCheck);
		add(jbCancel);

		setSize(370, 340);
		setLayout(null);
		setVisible(true);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MemoFontEvent mfe = new MemoFontEvent(this);

		addWindowListener(mfe);
		jbtnCheck.addActionListener(mfe);
		jbCancel.addActionListener(mfe);

		jtfFont.addMouseListener(mfe);
		jtfStyle.addMouseListener(mfe);
		jtfSize.addMouseListener(mfe);

		jlFont.addMouseListener(mfe);
		jlStyle.addMouseListener(mfe);
		jlSize.addMouseListener(mfe);

	}// MemoFontDesign

	public JavaMemoDesign getJmd() {
		return jmd;
	}

	public JTextField getJtfFont() {
		return jtfFont;
	}

	public JTextField getJtfStyle() {
		return jtfStyle;
	}

	public JTextField getJtfSize() {
		return jtfSize;
	}

	public JList getJlFont() {
		return jlFont;
	}

	public JList getJlStyle() {
		return jlStyle;
	}

	public JList getJlSize() {
		return jlSize;
	}

	public DefaultListModel<String> getDlmFont() {
		return dlmFont;
	}

	public DefaultListModel<String> getDlmStyle() {
		return dlmStyle;
	}

	public DefaultListModel<String> getDlmSize() {
		return dlmSize;
	}

	public JLabel getJlPreview() {
		return jlPreview;
	}

	public JButton getJbtnCheck() {
		return jbtnCheck;
	}

	public JButton getJbCancel() {
		return jbCancel;
	}

}
