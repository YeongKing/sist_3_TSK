package day0124;


import java.util.Stack;

/**
 * 
 * LIFO(ListInFirstOut)
 * 
 * 
 */
public class UseStack {

	public UseStack() {
		//1. 생성 ) 1s a 관계의 객체화는 하지 않는다.
//		List<String> list = new Stack<String>();
		Stack<String> stk = new Stack<String>();
		
		//2.값 할당 ) - item
		//stk.add("오늘은");// 부모의 method를 사용하지 않는다. 
						 // 부모의 메서드와 혼동할 수 있기 때문.
		stk.push("입니다");

		stk.push("오늘은");
		
		stk.push("수요일");


		

		
		//3. 값 얻기 ) - pop() - 얻어낸 item은 사라진다.
		//System.out.println(stk.empty());
		
		
//		while(!stk.empty()) {//스택에 아이템이 존재하지 않으면 반복하지 않는다.
//			
//			System.out.println(stk.pop());
//		}
		
		for(int i = 0 ; i < stk.size() ; i++) {
			System.out.println(stk.get(i));
			
		}

		
		
		System.out.println(stk.empty());
		
		
	}

	public static void main(String[] args) {
new UseStack();
	}//main

}//class
