import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_SWEA_D3_농작물수확하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			for (int i = 0; i < N; i++) {
				char[] c = br.readLine().toCharArray();
				for (int j = 0; j < N; j++) {
					arr[i][j] = (int)c[j]-'0';
				}
			}
			
			//농작물 수확
			int sum = 0;
			for (int i = 0; i < N; i++) {
				if(i == 0) {
					sum += arr[i][N/2];
					continue;
				} else if(i <= N/2) { //위쪽. 0~반절 줄까지
					for (int j = N/2 - i; j <= N/2 + i ; j++) {
							sum += arr[i][j];
					}
				} else { //아래쪽. i > N/2
					for (int j = N/2 - (N-1-i); j <= N/2 + (N-1-i); j++) {
							sum += arr[i][j];
					}
				}
			}//end of for
			sb.append("#").append(tc).append(" ").append(sum).append("\n");
		}//end of for testCase
		System.out.println(sb);
	}//end of main
}//end of class
