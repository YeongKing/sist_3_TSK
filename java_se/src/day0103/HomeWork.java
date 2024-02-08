package day0103;

public class HomeWork {


	/**
	 * 마을버스 기본요금
	 */
	public static final int TOWN_BUS_RATE = 1200;

	/**
	 * 버스 기본요금
	 */
	public static final int BUS_RATE = 1500;

	/**
	 * 지하철 기본요금
	 */
	public static final int METRO_RATE = 1400;


	
	public static void main(String[] args) {

		// 숙제
		// 제시된 요금표를 사용하여 아래 출력 코드를 작성.
		// 대중교통수단과 이동거리를 입력 받아 처리하는 프로그램을 제작.

		// 입력한 대중 교통 수단이 "마을버스","버스","지하철"인 경우에만
		// 아래의 출력형식으로 출력하고, 그렇지 않다면,
		// "대중교통 수단이 아닙니다."를 출력한다.

		// 출력형식)
		// 입력하신 교통수단은 [XX인수]이고 , 이동거리는 [XX인수]Km입니다.
		// 교통수단의 기본요금 : [xx]원,
		// 편도요금 [xx]원 , 이동거리가 10KM까지는 기본요금으로 처리되지만,
		// 10Km를 초과하면 5Km마다 100원이 가산됩니다.
		// 왕복요금 [xx]원
		// 한달 20일 기준 총 교통 요금은 [xx]원 입니다.

		// ex) 이동거리가 11KM이고
		// 교통수단의 기본요금이 1200이라면
		// 편도요금은 1300원

		////////////////////////
		// 교통수단 // 기본요금 //
		////////////////////////
		// 마을버스 // 1200원 //
		// 버스 // 1500원 //
		// 지하철 // 1400원 //
		///////////////////////

		// 코딩이 완료되면 flowchart를 그려보세요.
		
		
		
		
		
		

		/////////////////// 변수선언/////////////////////////////////////

		String transport = "";// 교통수단

		int baseRate = 0;// 기본요금

		int distance = Integer.parseInt(args[1]);// 거리

		int addMoney = 0;// 가산금액

		/////////////////////////////////////////////////////////////////

		////////////// 이동수단 , 기본요금설정///////////////////////////

		if (args[0].equals("마을버스")) {
			transport = "마을버스";
			baseRate = TOWN_BUS_RATE;
		} else if (args[0].equals("버스")) {
			transport = "버스";
			baseRate = BUS_RATE;
		} else if (args[0].equals("지하철")) {
			transport = "지하철";
			baseRate = METRO_RATE;
		}

		/////////////////////// 가산액지정,출력////////////////////////////

		if (transport.equals("마을버스") || transport.equals("버스") || transport.equals("지하철")) {// 교통수단이 마을버스,버스,지하철일 경우
			if (distance > 10) {// 거리가 제외거리보다 클 경우

				addMoney = (((distance - 10) + 4) / 5) * 100;
				// distance가 10KM를 초과하면 5KM당 100원씩 부과
				// distance에서 10KM를 제외한 거리에서 1~5km는 100원 증가로 동일하기때문에 올림처리
				// 나머지가 1일 경우 +4를 하면 5가 되어 몫으로 빠짐 1~4 -> 5~9가 되므로 모두 5로 나눌 시 몫 1 발생
				// 그 후 5로 나눈 몫에 가산금액인 100원을 곱함

			}

			System.out.println("입력하신 교통수단은 " + args[0] + "이고 , 이동거리는 " + args[1] + "km입니다.");
			System.out.println("교통수단의 기본요금 : " + baseRate + "원");
			System.out.println("편도요금 " + (baseRate + addMoney) + "원");
			System.out.println("왕복요금 " + (baseRate + addMoney) * 2 + "원");
			System.out.println(
					"한달 20일 기준 총 교통 요금은 " + (baseRate + addMoney) * 2 * 20 + "원 입니다.");
		} else {// 교통수단이 마을버스,버스,지하철이 아닐 경우
			System.out.println("대중교통 수단이 아닙니다.");
		}

	}// main

}// class
