import java.util.Scanner;

public class SWEA_ladder1_1210_D3_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrR = 0; //출발지 R
		int arrC = 0; //출발지 C
		int res = 2; //이동
		
//		for (int t = 1; t <= 10; t++) {
			int testCase = sc.nextInt();
			int[][] arr = new int[100][100];
			//배열 입력받기
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
					if(arr[i][j] == 2) { //출발점 찾기
						arrR = i;
						arrC = j;
					}
				}
			}
			System.out.println(arrR +","+ arrC);
			//사다리타기
			//좌로 갈 때는 좌로만 가다가 위로 바로 올라가야 됨. 오른쪽 가면 안됨
			//우로 갈 때는 우로만 가다가 위로 바로 올라가야 됨.
			// 이미 지나간건 0으로 바꾸자 !!!! 미친 .
			for(int i = arrR ; i >= 0 ; i--) {
				for (int j = arrC; j >= 0; j--) {
					//좌
					if(arr[i][j-1] == 1) { //좌로 이동
						arr[i][j] = 0;
						res = arr[i][j--];
					} else if(arr[i][j+1] == 1) { //우로 이동
						arr[i][j] = 0;
						res = arr[i][j++];
					}else {
						res = arr[i--][j];
					}				
//					if(j == 0) res = i;
				}
			}
			System.out.println("#"+testCase+" "+res);
//		} // end of testCase
	}// end of main
}// end of class
