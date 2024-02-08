package day0118;

/**
 * 숙제 1. 아래의 데이터로 배열을 만들고 , 임의의 방 하나의 값을 출력. "어쩔티비,저쩔티비,뇌절티비,안물티비,
 * 안궁티비,때리고싶쥬~,못때리쥬~,개킹받쥬~"<br>
 * 2. 8자리의 영문자(대소문자), 숫자로 구성된 임의의 비밀번호를 생성하여 반환하는 일을 하는 method를 작성하여 사용(출력)<br>
 * 3. 로또번호(1~45의 수중 하나를 뽑고, 6자리의 세트로 [배열])로 반환하는 method를 작성하고 사용.(중복값이 들어가면 안되고<br>
 * , 오름차순 정렬되어 출력되어야 한다.)<br>
 */

public class HomeWork {

	/**
	 * 
	 * printArr()에 String값을 넣으면 ","에 의해 문장이 나눠져 배열화 되어 랜덤의 값이 출력된다.
	 * @param arr String 배열중 하나의 값 출력
	 */
	public void printArr(String arr) {

		String[] arrChar = arr.split(",");
		int result = (int) (Math.random() * arrChar.length);

		System.out.println(arrChar[result]);

	}

	/**
	 * 
	 * 8자리의 영문자(대소문자), 숫자로 구성된 임의의 비밀번호를 생성하여 반환하는 일을 하는 method
	 * 
	 */
	public void passwordGenerator(int num) {
		
		String passwordSet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String password = "";
		
		int passwordLength = num;
		
		for (int i = 0; i < passwordLength ; i++) {
			
			password += passwordSet.charAt((int)(Math.random()*62));
			
		}
		
		System.out.println(password);
		

	}// passwordGenerator()

	/**
	 * 로또번호(1~45의 수중 하나를 뽑고, 6자리의 세트로 [배열])로 반환하는 method<br>
	 * 중복값이 들어가지 않고, 오름차순 정렬되어 출력된다.
	 * 
	 */
	public void lotto() {// arrNum배열에 1~45의 숫자를 할당하고 arrLotto[]에 6자리 배열을 만든다.
		int[] arrNum = new int[45];
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = i + 1;
		}
		int[] arrLotto = new int[6];
		// System.out.println((int)(Math.random() * 45) + 1);
		// 랜덤으로 숫자를 뽑아 arrNum[]배열에 할당되어있는 값이 0인지 확인하고 0일경우 이미 뽑힌 숫자이므로 다시 랜덤한수를 뽑아
		// 배열의 값이 0인지 확인한다. 0이 아니라면 그 값이 arrLotto배열의 배열에 하나씩 할당되고
		// arrNum배열에서 뽑아낸 값은 0으로 바꾼다.
	
		
		for (int i = 0; i < arrLotto.length; i++) {
			boolean flag = true;
			while (flag) {
				int index = (int) (Math.random() * 45);
				if (arrNum[index] != 0) {
					arrLotto[i] = arrNum[index];
					arrNum[index] = 0;
					flag = false;
				} else {
					continue;
				}
			} // end while
		} // end for
		

		int temp = 0;
		for (int i = 0; i < arrLotto.length; i++) {

			for (int j = 0; j < arrLotto.length - i - 1; j++) {// 한바퀴가 돌면 맨 끝에있는 숫자는 가장큰 숫자가 되므로 픽스, 더이상 확인 X

				
				
				if (arrLotto[j] > arrLotto[j + 1]) {
					temp = arrLotto[j];
					arrLotto[j] = arrLotto[j + 1];
					arrLotto[j + 1] = temp;
				}

			}

		}

		for (int i = 0; i < arrLotto.length; i++) {
			System.out.print(arrLotto[i] + " ");

		} // end for

	}// lotto()
	
	
	
	public void lotto1() {// arrNum배열에 1~45의 숫자를 할당하고 arrLotto[]에 6자리 배열을 만든다.
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			
			for (int j = 0; j < i; j++) {
				lotto[i] = (int) (Math.random() * 45);
				
				
				
				if (lotto[i]==lotto[j]) {
					i--;
					break;
					
					
					
				}
				
				
			}
			
			
		}
		
		
		
		
		
	}// lotto()

	public static void main(String[] args) {

		HomeWork hw = new HomeWork();

		String textArr = "어쩔티비,저쩔티비,뇌절티비,안물티비,안궁티비,때리고싶쥬~,못때리쥬~,개킹받쥬~";
		hw.printArr(textArr);
		System.out.println("-------------------------------------------------");
		hw.passwordGenerator(8);
		System.out.println("-------------------------------------------------");
		hw.lotto();

	}

}
