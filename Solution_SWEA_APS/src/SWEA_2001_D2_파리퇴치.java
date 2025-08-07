import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2001_D2_파리퇴치 {
public static void main(String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int T = Integer.parseInt(br.readLine());
	for (int testCase = 1; testCase <= T; testCase++) {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
		int max = 0;
		for (int i = 0; i < N-M+1; i++) {
			for (int j = 0; j < N-M+1; j++) {
				int sum = 0;
				for (int k = 0; k < M; k++) {
					for (int l = 0; l < M; l++) {
						sum += arr[i+k][j+l];
					}
				}
				max = Math.max(max, sum);
				}
			}
		sb.append("#").append(testCase).append(" ").append(max).append("\n");
		}
	System.out.print(sb.toString());
	}
}