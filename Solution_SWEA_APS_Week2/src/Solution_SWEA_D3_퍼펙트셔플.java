import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_D3_퍼펙트셔플 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= T; testCase++) {
			int N = Integer.parseInt(br.readLine());
			String[] arr = new String[N];
			
			
			//1. 카드 구분
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int i = 0; i < N; i++) {
				arr[i] = st.nextToken();
			}
			
			//2. 퍼펙트 셔플
			//2-1. 카드 반갈
			int tmp;
			if(N%2 == 0) {
				tmp = N/2;
			} else {
				tmp = N/2+1;
			}
			String[] back = new String[N/2];
			String[] front = new String[tmp];
			if(N%2 == 1) front[0] = arr[0];
			
			//2-2. 반갈 각각 저장
			for (int i = 0; i < N/2+1; i++) {
				if(N%2 == 0 && i == N/2) {
					break;
				}
				//홀수일 때 오류. 
				if(N%2 == 0) {
					front[i] = arr[i]; //0~n/2까지
					back[i] = arr[N/2+i]; //1357
				} else if (N%2 == 1 && i == 0){
					continue;
				} else {
					back[i] = arr[N/2+i]; //1357
					front[i] = arr[i]; //0~n/2까지
				}
			}
			
			sb.append("#").append(testCase).append(" ");
			//2-3. 셔플 출력
			for (int i = 0; i < N/2; i++) {
				sb.append(front[i]).append(" ");
				sb.append(back[i]).append(" ");
			}
		}//end of for testCase
		System.out.println(sb.toString());
	}//end of main
}//end of class
