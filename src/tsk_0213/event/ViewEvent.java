package tsk_0213.event;

import tsk_0213.design.ViewDesign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class ViewEvent extends WindowAdapter implements ActionListener{

	private ViewDesign vd ;
	


	
	
	public ViewEvent(ViewDesign vd) {
		this.vd =vd;
	}	// ViewEvent
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==vd.getJbReport()) {
			//JbReport버튼 클릭시
			//JOptionPane.showMessageDialog(null, "JbReport버튼 클릭 확인");
			try {
				downloadFile();
				JOptionPane.showMessageDialog(vd, "파일이 정상적으로 생성되었습니다.");
			} catch (Exception e) {

			}
			
			
			
		}	// end if
		
		if(ae.getSource()==vd.getJbOk()) {
			//JbOk버튼 클릭시
			//JOptionPane.showMessageDialog(null, "JbOk버튼 클릭 확인");
			vd.dispose();
		}	// end if

	}	// actionPerformed

	@Override
	public void windowClosing(WindowEvent e) {
		//JOptionPane.showMessageDialog(null, "윈도우 종료버튼 클릭 확인");
		vd.dispose();
	}	// windowClosing

	private void downloadFile() throws Exception {

		// System.out.println("리포트버튼 클릭");
//		System.out.println(vd.getWd().getUserId());
//		System.out.println(vd.getUserId());
//		System.out.println(vd.isChmodRWX());
		
		if(!vd.isChmodRWX()) {
			/*"root계정일경우 리포트 버튼 동작 X"*/
			JOptionPane.showMessageDialog(null, vd.getUserId()+"계정은 Report버튼을 실행할 수 없습니다.");
			throw new Exception();
			
			
			
			
			
		}//end if
		File fileDir = new File("c:/dev/report");

		fileDir.mkdirs();
		long time = System.currentTimeMillis();
		File file = new File("c:/dev/report/report_" + time + ".dat");
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");


	
		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			bw.write("----------------------------------------------------------------------------------------------------------\n");
			bw.write(vd.getWd().getFileName() +" log 생성된 날짜  : " +sdf.format(time) +" )\n");
			bw.write("----------------------------------------------------------------------------------------------------------\n");

			String msg = vd.getJtaResult().getText();

			bw.write(msg);

			bw.flush();
			bw.close();

		} catch (IOException ie) {
			ie.printStackTrace();
		} // end catch

		
		
		
		
	
	}// downloadFile

	
	
	
	
}


