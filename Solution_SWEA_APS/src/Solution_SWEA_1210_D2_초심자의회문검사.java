import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_SWEA_1210_D2_초심자의회문검사 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		for (int testCase = 1; testCase <= T; testCase++) {
			// 단어 입력받기
			String word = br.readLine();
			int res = 1;
			int N = word.length();
			char[] arr = new char[N];
			for (int i = 0; i < N; i++) {
				arr[i] = word.charAt(i);
			}	
			// 회문 검사
			for(int i = 0, x=N/2; i < x ; i++) { //강사님) 뒤는 똑같으니까 반만 돌려도 돼
				if (arr[i] != arr[N - i - 1]) {
					res = 0;
					break;
				}
			}
//			for(int i = 0; i < N/2 ; i++) {
//				if (arr[i] == arr[N - i - 1]) {
//					res = 1;
//				} else {
//					res = 0;
//					break;
//				}
//			}
			System.out.println("#" + testCase + " " + res);
		}
	}
}
