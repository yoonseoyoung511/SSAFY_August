import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1986_D2_지그재그숫자_my {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			for (int j = 1; j <= N; j++) {
				if (j % 2 == 0) {
					sum -= j;
				} else {
					sum += j;
				}

			}
			System.out.println("#" + i + " " + sum);
		}
	}
}
