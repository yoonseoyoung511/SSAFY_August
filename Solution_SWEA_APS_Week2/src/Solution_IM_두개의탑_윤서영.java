import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_IM_두개의탑_윤서영 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= T; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M1 = Integer.parseInt(st.nextToken());
			int M2 = Integer.parseInt(st.nextToken());

			int min = Math.min(M1, M2);
			int max = Math.max(M1, M2);
			int[] block = new int[N];
			int[] top1 = new int[Math.min(M1, M2)];
			int[] top2 = new int[Math.max(M1, M2)];
			int sum1 = 0;
			int sum2 = 0;

			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < N; i++) {
				block[i] = Integer.parseInt(st2.nextToken());
			}

			Arrays.sort(block);
			// 1. 둘다 자리 있으면 퐁당퐁당
			// 큰 값부터 들어가야 함. 거꾸로.
			int tmp = N - 1;
			for (int i = 0; i < min; i++) {
				top1[i] = block[tmp];
				tmp -= 2;
			}
			tmp = N - 2;
			for (int i = 0; i < min; i++) {
				top2[i] = block[tmp];
				tmp -= 2;
			}

			// 2. top1 자리 없으면 break, top2만 계속 넣기
			for (int i = min; i < max; i++) {
				top2[i] = block[N - i];
			}

			// 계산
			int i = 0;
			while (i < min) {
				sum1 += top1[i] * (i + 1);
				i++;
			}
			i = 0;
			while (i < max) {
				sum2 += top2[i] * (i + 1);
				i++;
			}
			sb.append("#").append(testCase).append(" ").append(sum1 + sum2).append("\n");
		} // end of for testCase
		System.out.println(sb.toString());
	}// end of main

}// end of class
