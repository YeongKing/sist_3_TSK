package day0205;

import java.io.File;

/**
 * 파일 삭제
 * 
 * 
 */
public class UseFile3 {

	public static void main(String[] args) {
//		//1. 삭제할 파일명을 가진 File객체를 생성
//		File file = new File("c:/dev/temp/java_read2.txt");
//		//2. 삭제
//		System.out.println(file.delete());
		
		
		//1. 이전 이름을 가진 File 객체를 생성
		File file = new File("c:/dev/temp/java_read2.txt");
		//2. 변경할 파일명을 저장한 객체 생성
		File file2 = new File("c:/dev/temp/kmy.txt");
		System.out.println(file.renameTo(file2));
		
		
		
	}//main

}//class
