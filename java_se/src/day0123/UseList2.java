package day0123;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * ArrayList, Vector의 사용
 */
public class UseList2 {
	/**
	 *  동기화가 되지 않기때문에 여러 객체가 동시 접속가능하다.
	 * Vector보다 속도가 빠르다.
	 */
	public void useArrayList() {
		// 1. 생성 )
		List<String> list = new ArrayList<String>();

		// 2. 값 할당 ) 객체명.add( 값 ); //방의 크기가 증가 : 가변 길이형
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java"); // 중복값 허용
		list.add("HTML");
		list.add("CSS");
		
		//2번째 방 위치 (JDBC)에 "자바"를 추가
		list.add(2,"자바");

		// 3. 크기 )
		System.out.println(list);
		System.out.println(list.size() + "개");

		// 배열로 복사
		//1.리스트의 크기대로 빈 배열을 생성
		
		String[] arr = new String[list.size()];
		
		//2. 복사
		list.toArray(arr);
		
		//모든 방의 값 출력 )
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		for(String value : list) {
			System.out.println(value);
		}
	
		
		
		//값 삭제 ) remove(인덱스), remove(요소의 값) 크기가 준다.
		//list.remove(1);
		list.remove("Java"); // 같은 값이 있다면 처음 값만 지워짐 , 대소문자 구분
		System.out.println(list);
		System.out.println(list.size() + "개");

		list.clear();

		
		System.out.println(list + " / " + list.size());
		
		for(String value : arr) {
			System.out.println(value);
		}
	

	}// useArrayList

	/**
	 * 동기화가 되기 때문에 여러 객체가 동시 접속근 불가능하다.
	 * ArrayList보다 속도가 느림.
	 */
	public void useVector() {
		// 1. 생성 )
				List<String> list = new Vector<String>();

				// 2. 값 할당 ) 객체명.add( 값 ); //방의 크기가 증가 : 가변 길이형
				list.add("Java");
				list.add("Oracle");
				list.add("JDBC");
				list.add("Java"); // 중복값 허용
				list.add("HTML");
				list.add("CSS");

				// 3. 크기 )
				System.out.println(list);
				System.out.println(list.size() + "개");

				// 배열로 복사
				//1.리스트의 크기대로 빈 배열을 생성
				
				String[] arr = new String[list.size()];
				
				//2. 복사
				list.toArray(arr);
				
				//모든 방의 값 출력 )
				
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println(list.get(i));
//				}
				
				for(String value : list) {
					System.out.println(value);
				}
			
				
				
				//값 삭제 ) remove(인덱스), remove(요소의 값) 크기가 준다.
				//list.remove(1);
				list.remove("Java"); // 같은 값이 있다면 처음 값만 지워짐 , 대소문자 구분
				System.out.println(list);
				System.out.println(list.size() + "개");

				list.clear();

				
				System.out.println(list + " / " + list.size());
				
				for(String value : arr) {
					System.out.println(value);
				}
			

		
		
		
		
		
	}// useVector
	
	public void useLinkedList() {

		// 1. 생성 )
		List<String> list = new LinkedList<String>();

		// 2. 값 할당 ) 객체명.add( 값 ); //방의 크기가 증가 : 가변 길이형
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java"); // 중복값 허용
		list.add("HTML");
		list.add("CSS");

		list.add(1,"자바");//기존 데이터사이에 값을 추가
		
		
		
		// 3. 크기 )
		System.out.println(list);
		System.out.println(list.size() + "개");

		// 배열로 복사
		//1.리스트의 크기대로 빈 배열을 생성
		
		String[] arr = new String[list.size()];
		
		//2. 복사
		list.toArray(arr);
		
		//모든 방의 값 출력 )
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		for(String value : list) {
//			System.out.println(value);
//		}
	
		Iterator<String> ita = list.iterator();
		while(ita.hasNext()){
			System.out.println(ita.next());
		}

		
		
		
		
		//값 삭제 ) remove(인덱스), remove(요소의 값) 크기가 준다.
		//list.remove(1);
		list.remove("Java"); // 같은 값이 있다면 처음 값만 지워짐 , 대소문자 구분
		System.out.println(list);
		System.out.println(list.size() + "개");

		list.clear();

		
		System.out.println(list + " / " + list.size());
		
		for(String value : arr) {
			System.out.println(value);
		}
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {

		UseList2 ul = new UseList2();
		System.out.println("------ArrayList------");
		ul.useArrayList();

		System.out.println("------Vector------");
		ul.useVector();
	}// main

}// class
