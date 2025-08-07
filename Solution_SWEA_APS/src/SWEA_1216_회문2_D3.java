import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1216_회문2_D3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int testCase = 1; testCase <= 10; testCase++) {
			int T = Integer.parseInt(br.readLine());
			char[][] arr = new char[100][100];
			for (int i = 0; i < 100; i++) {
				String str = br.readLine();
				arr[i] = str.toCharArray();
			}
			int max1 = 0; //가로
			int max2 = 0; //세로
			//가로
			for (int i = 0; i < 100; i++) { // 회문 기준점 인덱스i
				for (int j = 0; j < 100; j++) { // 회문 기준점 인덱스j
					for (int len = 1; len <= 100-j; len++) { // 회문 길이 100
						boolean flag = true;
						// 회문 비교하는 자리
						for (int l = 0; l < len/2; l++) { 
							if (arr[i][j+l] != arr[i][j+len-1-l]) { //가로
								flag = false;
								break;
							}
						}
						if(flag && max1 < len) max1 = len;
					}
				}
			}
			//세로
			for (int j = 0; j < 100; j++) { // 회문 기준점 인덱스j
				for (int i = 0; i < 100; i++) { // 회문 기준점 인덱스i
					//가로
					for (int len = 1; len <= 100-i; len++) { // 회문 길이 100
						boolean flag = true;
						// 회문 비교하는 자리
						for (int l = 0; l < len/2; l++) { 
							if (arr[i + l][j] != arr[i + len - 1 - l][j]) {
								flag = false;
								break;
							}	
						}
						if(flag && max2 < len) max2 = len;
					}
				}
			}
//			System.out.println("#"+T+" "+Math.max(max1, max2));
			sb.append("#").append(T).append(" ").append(Math.max(max1, max2)).append("\n");
		}//end of for testCase
		System.out.print(sb.toString());
	}
}
