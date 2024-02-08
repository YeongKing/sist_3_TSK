package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 16bit stream을 사용한 텍스트 파일의 내용 읽기.
 * 
 * 
 */
public class UseFileReader {

	public UseFileReader() throws IOException{
		

		//1. File 생성
		File readFile = new File("C:/dev/temp/java_read.txt");
		if(!readFile.exists()) {
			
			System.out.println(readFile.getAbsolutePath()+"는 존재하지 않습니다.");
			return;
		}//end if
		
//		//2. stream 생성
//		FileReader fr = new FileReader(readFile);
//		BufferedReader br = new BufferedReader(fr);
		
		BufferedReader br = null ;
		try {
			br = new BufferedReader(new FileReader(readFile));
			
		//3. 스트림에 연결되어있는 파일을 읽어들인다.
		
		String str = "";
		while((str=br.readLine())!=null) {
			System.out.println(str);
			
		}//end while
		} finally {
			if(br!=null) {
				
				br.close();
			}
			
			
		} 
		
		
		
		
		
		
		
		

	}// UseFileReader

	public static void main(String[] args) {

		
		try {
			
			new UseFileReader();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}// main

}// class
