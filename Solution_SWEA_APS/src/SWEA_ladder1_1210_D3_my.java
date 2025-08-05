import java.util.Scanner;

public class SWEA_ladder1_1210_D3_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int T = 1; T <= 10; T++) {
			int testCase = sc.nextInt();
			int R = 0; // 출발지 R
			int C = 0; // 출발지 C
			int[][] arr = new int[100][100];
			// 배열 입력받기
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
					if (arr[i][j] == 2) { // 출발점 찾기
						R = i;
						C = j;
					}
				}
			}
			// 사다리타기
			// 이미 지나간건 0으로 바꾸자 !!!! 
			for (int i = 99; i >= 0; i--) {
				while (C > 0 && arr[i][C - 1] == 1) { // 좌로 이동
					arr[i][C] = 0;
					C--;
				} 
				while (C < 99 && arr[i][C + 1] == 1) { // 우로 이동
					arr[i][C] = 0;
					C++;
				} 
			}
			System.out.println("#" + testCase + " " + C);
		}//end of testCase
	}// end of main
}// end of class
