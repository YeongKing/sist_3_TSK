package day0123;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 모든 JDK버전에서는 Generic 없이 List를 생성하고 사용할 수 있다.
 * 
 * 
 */
public class UseList {

	@SuppressWarnings("unchecked")
	public UseList() {
		@SuppressWarnings("rawtypes")
		// 1. 생성 ) - Generic을 사용하지 않고 생성 => 모든 값을 추가할 수 있다.

		List list = new ArrayList(30);

		// 2. 값 할당 )
		
		list.add(100); //100은 기본형 => AutoBoxing되어 들어감.
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(1.23);//아무 값이나 입력하면
		list.add("안녕");
		list.add(true);
		// 3. 값 얻기
		for (int i = 0; i < list.size(); i++) {
			//사용하는 쪽에서 에러가 발생할 수 있다.
//			System.out.println((int)list.get(i)*10);
			System.out.println(list.get(i));
		}
		

		
		
		System.out.println(list + " / " + list.size());//.size()는 실제 데이터가 존재하는 방의 크기까지만 반환됨
		
		
		System.out.println("-----------------------------------------------");
		//Generic의 사용 : 입력 데이터 형을 제한 ( 기본형 데이터형은 제네릭 사용 불가 )
		//List<int> list2 = new ArrayList<int>;
		List<Integer> list2 = new ArrayList<Integer>();
		
		//값 할당)
		list2.add(2024); // autoboxing => list2.add(Intger.valueOf(2024))가 숨어있는 것
		list2.add(new Integer(1));
		
		list2.add(Integer.valueOf(23));
		//list2.add("안녕"); //지정한 데이터형만 입력가능 String X
	    //list2.add(2024D); //지정한 데이터형만 입력가능 Double X
		
		//값 얻기
		int i = list2.get(0);//unboxing : list2.get(0).intValue();
		int i2 = list2.get(1);//unboxing
		int i3 = list2.get(2).intValue();//개발자가 .intValue()를 작성해주었기때문에 unboxing이 아니다.
	
		System.out.println(i + " / " + i2 + " / " + i3);
		for (int j = 0; j < list2.size(); j++) {
			//사용하는 쪽에서 에러가 발생할 수 있다.

			//System.out.println(list2.get(j).intValue()*10); //unboxing 아님
			System.out.println(list2.get(j)*10); //unboxing 맞음
		}
	
	}// UseList

	public static void main(String[] args) {

		new UseList();

	}// main

}// class
