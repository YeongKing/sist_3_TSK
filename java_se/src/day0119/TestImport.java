package day0119;

import java.util.ArrayList;
import java.util.Date;
//import java.sql.Date; //패키지가 다르고 클래스명이 같다면 둘 중 하나만 import 할 수 있다.
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//import java.util.*; //특정 패키지내의 모든 클래스를 import 할 떄


/**
 * 다른 패키지에 존재하는 클래스를 가져다 사용할 때.
 */
public class TestImport {

	public static void main(String[] args) {
		Date d = new Date();
		java.sql.Date d2 = null; //full path 사용
		Date d3 = null;
		
		
		
		List l = new ArrayList();
		List l2 = new ArrayList();
		Map m = new HashMap();

	}// main

}// class
