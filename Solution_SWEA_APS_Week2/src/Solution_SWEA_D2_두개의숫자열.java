import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_D2_두개의숫자열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken()); //A 개수
			int M = Integer.parseInt(st.nextToken()); //B 개수
			int[] arrA = new int[N];
			int[] arrB = new int[M];
			StringTokenizer stA = new StringTokenizer(br.readLine(), " ");
			StringTokenizer stB = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < N; i++) {
				arrA[i] = Integer.parseInt(stA.nextToken());
			}
			for (int i = 0; i < M; i++) {
				arrB[i] = Integer.parseInt(stB.nextToken());
			}
			
			int max = Integer.MIN_VALUE;
			int tmp = 0;
			
			//B가 더 큰 경우
			if(N < M) { 
				for (int i = 0; i <= M-N; i++) {
					tmp = 0;
					for (int j = 0; j < N; j++) {
						tmp += arrA[j] * arrB[i+j];
					}
					if(max < tmp) max = tmp;
				}
			} 
			//A가 더 큰 경우
			else if (N > M) {
				for (int i = 0; i <= N-M; i++) {
					tmp = 0;
					for (int j = 0; j < M; j++) {
						tmp += arrA[i+j] * arrB[j];
					}
					if(max < tmp) max = tmp;
				}
			}
			sb.append("#").append(tc).append(" ").append(max).append("\n");
		}//end of for testCase
		System.out.println(sb);
	}//end of main
}//end of class
