import java.util.Scanner;

public class SWEA_1209_D3_Sum_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			int T = sc.nextInt();
			int[][] arr = new int[100][100];
			int maxR = Integer.MIN_VALUE;
			int maxC = Integer.MIN_VALUE;
			int maxA = Integer.MIN_VALUE;
			int res = Integer.MIN_VALUE;
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}		
			
			//각 행의 합
			for (int i = 0; i < 100; i++) {
				int tmp = 0;
				for (int j = 0; j < 100; j++) {
					tmp += arr[i][j];
				}
				if(maxR < tmp) maxR = tmp;
			}
			
			//각 열의 합
			for (int i = 0; i < 100; i++) {
				int tmp = 0;
				for (int j = 0; j < 100; j++) {
					tmp += arr[j][i];
				}
				if(maxC < tmp) maxC = tmp;
			}

			//각 대각선의 합
			int tmpA = 0;
			int tmpB = 0;
			for (int i = 0; i < 100; i++) {
				tmpA += arr[i][i];
				tmpB += arr[i][99-i];
				maxA = Math.max(tmpA, tmpB);
			}
			//최댓값
			if(maxR > maxC && maxR > maxA) res = maxR;
			else if(maxC > maxR && maxC > maxA) res = maxC;
			else if(maxA > maxR && maxA > maxC) res = maxA;
			else {res = Math.max(maxA, maxC);}
			System.out.println("#"+testCase+" "+res);
		}		
	}
}
