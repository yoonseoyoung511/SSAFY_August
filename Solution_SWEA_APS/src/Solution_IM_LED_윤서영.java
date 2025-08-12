import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_IM_LED_윤서영 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= T; testCase++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] res = new int[N];
			int[] arr = new int[N];
			// 정답배열, 시작배열 입력
			for (int i = 0; i < N; i++) {
				res[i] = Integer.parseInt(st.nextToken());
				arr[i] = 0;
			}

			int count = 0;
			// 스위치 조작
			for (int i = 0; i < N; i++) {
				int tmp = arr[i];
				// 1. 일치하면 pass
				if (arr[i] == res[i]) {
					continue;
				} else if (arr[i] == 1) {
					arr[i] = 0;
					count++;
				} else {
					arr[i] = 1;
					count++;
				}
				// 2. 다르면 배수 스위치 다 바꾸기
				for (int j = 1; j * (i + 1) - 1 < N; j++) {
					// 배수도 바꾸기.반복
					if (tmp != res[i] && arr[j * (i + 1) - 1] == 1) {
						arr[j * (i + 1) - 1] = 0;
					} else if (tmp != res[i] && arr[j * (i + 1) - 1] == 0) {
						arr[j * (i + 1) - 1] = 1;
					}
				}
			} // end of for
			sb.append("#").append(testCase).append(" ").append(count).append("\n");
		} // end of for testCase
		System.out.println(sb);
	}// end of main
}// end of class
