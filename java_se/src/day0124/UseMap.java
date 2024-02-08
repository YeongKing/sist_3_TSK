package day0124;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 키와 값의 쌍으로 이루어진 데이터 형
 */
public class UseMap {

	/**
	 * 기본생성자를 사용하여 생성하면 11개의 행이 생성되는 Hashtable의 사용.<br>
	 * 속도 느림, <br>
	 */
	public void useHashtable() {
		// 1. Map 생성
		Map<String, String> map = new Hashtable<String, String>();
		// 2. Map 값 설정 ) map.put(키,값) - 순서대로 입력되지 않는다.
		map.put("A", "세심하다, 친절하다. ^o^b");
		map.put("B", "성질드럽다. ㅡ,.ㅡ");
		map.put("AB", "싸이코 @.@");
		map.put("O", "우유부단 ~(^^~)(~^^)~");

		// 키가 중복되면 같은 키에 덮어 쓴다.
		map.put("A", "소심하다☞(^_^)☜");

		// 키가 다르면 중복값을 허용
		map.put("a", "소심하다☞(^_^)☜");

		// 맵에 키가 존재하는지?
		System.out.println(map.containsKey("AC"));
		System.out.println(map.containsKey("A"));

		// 검색 : 키를 사용하여 값을 검색 map.get(key)
		// key에 해당하는것이 없으면 null이 반한된다.
		String key = "A";

		if (map.containsKey(key)) {
			String value = map.get(key);
			System.out.println(key + "의 특징은 " + value);

		} else {

			System.out.println(key + "에 대한 값은 존재하지 않습니다.");
		} // end else

		System.out.println(map);

		// 값 삭제
		map.remove("a");
		System.out.println(map);

		map.clear();
		System.out.println(map);
		
		System.out.println(map.isEmpty());
		
		
		
		

	}// useHashtable

	/**
	 * 기본생성자를 사용하여 생성하면 16개의 행이 생성되는 HashMap의 사용.<br>
	 * 속도 빠름, <br>
	 */
	public void useHashMap() {
		// 1. Map 생성
		Map<String, String> map = new HashMap<String, String>();
		// 2. Map 값 설정 ) map.put(키,값) - 순서대로 입력되지 않는다.
		map.put("A", "세심하다, 친절하다. ^o^b");
		map.put("B", "성질드럽다. ㅡ,.ㅡ");
		map.put("AB", "싸이코 @.@");
		map.put("O", "우유부단 ~(^^~)(~^^)~");

		// 키가 중복되면 같은 키에 덮어 쓴다.
		map.put("A", "소심하다☞(^_^)☜");

		// 키가 다르면 중복값을 허용
		map.put("a", "소심하다☞(^_^)☜");

		// 맵에 키가 존재하는지?
		System.out.println(map.containsKey("AC"));
		System.out.println(map.containsKey("A"));

		// 검색 : 키를 사용하여 값을 검색 map.get(key)
		// key에 해당하는것이 없으면 null이 반한된다.
		String key = "A";

		if (map.containsKey(key)) {
			String value = map.get(key);
			System.out.println(key + "의 특징은 " + value);

		} else {

			System.out.println(key + "에 대한 값은 존재하지 않습니다.");
		} // end else

		System.out.println(map);

		// 값 삭제
		map.remove("a");
		System.out.println(map);

		map.clear();
		System.out.println(map);
		
		System.out.println(map.isEmpty());

	}// useHashMap

	public static void main(String[] args) {

		UseMap um = new UseMap();

		System.out.println("--------------Hashtable---------------------");
		um.useHashtable();
		System.out.println("---------------HashMap----------------------");
		um.useHashMap();

	}// main

}// class
