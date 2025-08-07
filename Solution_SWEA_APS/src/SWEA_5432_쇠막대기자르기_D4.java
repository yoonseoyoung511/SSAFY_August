import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_5432_쇠막대기자르기_D4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int testCase = 0; testCase < T; testCase++) {
			String str = br.readLine();
			char[] arr = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i);
				System.out.print(arr[i]);
			}
		}
		System.out.println(T);
	}
}
