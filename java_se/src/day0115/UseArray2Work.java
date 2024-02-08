package day0115;

/**
 * 학생들의 점수를 처리하는 클래스
 */
public class UseArray2Work {

	public void scoreProcess() {

		String[] nameArr = { "루피", "상디", "쵸파", "나미", "로빈" };

		int[][] scoreArr = { { 89, 91, 86 }, { 91, 93, 90 }, { 98, 100, 99 }, { 74, 85, 83 }, { 88, 90, 95 } };

		System.out.printf("시험 응시 인원 [%d]명\n", nameArr.length);
		System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-------------------------------------------------------");
		int[] sumScore = { 0, 0, 0 }; // 과목별 총점수
		int[] totalScore = new int[5];// 총점수 배열
		int max = 0;
		int index = 0;

		for (int i = 0; i < scoreArr.length; i++) {

			System.out.printf("%d\t%s\t", i + 1, nameArr[i]);
			for (int j = 0; j < scoreArr[i].length; j++) {
				System.out.printf("%d\t", scoreArr[i][j]);

			}
			System.out.printf("%d\t%.2f", totalScore(scoreArr[i]),
					totalScore(scoreArr[i]) / (scoreArr[i].length * 1.0));
			System.out.println();
			sumScore[0] += scoreArr[i][0];
			sumScore[1] += scoreArr[i][1];
			sumScore[2] += scoreArr[i][2];
			totalScore[i] = totalScore(scoreArr[i]);

		}
		for (int i = 0; i < totalScore.length; i++) {
			if (max < totalScore[i]) {
				max = totalScore[i];
				index = i;
			}
		}

		System.out.println("-------------------------------------------------------");
		System.out.printf("\t총점\t%d\t%d\t%d\n", sumScore[0], sumScore[1], sumScore[2]);// 각 과목의 총점
		System.out.printf("\t평균\t%.2f\t%.2f\t%.2f\n", sumScore[0] * 1.0 / nameArr.length,
				sumScore[1] * 1.0 / nameArr.length, sumScore[2] * 1.0 / nameArr.length);// 각 과목 평균
		System.out.printf("1등학생의 번호 [%d], 이름 [%s]\n", index + 1, nameArr[index]);// 일등 학생의 번호 와 이름
		System.out.printf("1등학생의 번호 [%d], 이름 [%s]\n", topStudentIndex(scoreArr) + 1,
				nameArr[topStudentIndex(scoreArr)]);// 일등 학생의 번호 와 이름
		// method 활용

	}// scoreProcess

	/**
	 * 
	 * 1등학생의 인덱스번호를 반환하는 method<br>
	 * 각학생의 과목의 총합이 temp에 들어가고<br>
	 * top과 비교한 후 top<temp일 경우 top = temp가 된다.<br>
	 * 그 후 index값은 외부 for문의 i에 값이 들어간다 -> index = i;<br>
	 * 다시 temp는 0으로 초기화되며 반복 진행<br>
	 * 
	 * 
	 * @param score 점수배열
	 * @return 1등학생의 nameArray index
	 */
	public int topStudentIndex(int[][] score) {
		int index = 0;
		int top = 0;

		for (int i = 0; i < score.length; i++) {
			int temp = 0;
			for (int j = 0; j < score[i].length; j++) {
				temp += score[i][j];
			}
			if (top < temp) {
				top = temp;
				index = i;
			}

		}

		return index;
	}

	/**
	 * 일차원 배열의 총점을 구하여 반환하는 일
	 * 
	 * @return
	 */
	public int totalScore(int[] score) {
		int total = 0;

		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}

		return total;
	}

	public static void main(String[] args) {

		UseArray2Work uaw = new UseArray2Work();
		uaw.scoreProcess();

	}// main

}// class
