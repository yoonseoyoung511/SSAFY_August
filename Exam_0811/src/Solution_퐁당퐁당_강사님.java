import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 체비셰프 거리 : max(행의 차, 열의 차) 값으로 테두리 거리를 만든다
 * 변수 우클릭->Refactor->Rename(Alt shift R) : 변수이름 한번에 싹 바꾸기
 */

public class Solution_퐁당퐁당_강사님 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int tc = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= tc; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken()); //강의 한변, 3<= N, K <= 50
			int K = Integer.parseInt(st.nextToken()); //돌던지기. 돌던진 횟수
			long[][] m = new long[N][N]; //물결 정보 저장
			for (int k = 0; k < K; k++) {
				st = new StringTokenizer(br.readLine()," ");
				int r = Integer.parseInt(st.nextToken()) - 1; //돌 던진 위치 행
				int c = Integer.parseInt(st.nextToken()) - 1; //돌 던진 위치 행
				int w = Integer.parseInt(st.nextToken()); //돌의 초기 무게, 1~100
				int p = Integer.parseInt(st.nextToken()); //퍼져나가는 힘, int형 범위
				
				//돌던지기 작업, 돌 던진 후 물결값을 누적해서 배열에 저장
				for (int i = 0; i < m.length; i++) {
					for (int j = 0; jp < m.length; j++) {
//						체비셰프 거리 : max(|행의 차|, |열의 차|) 값으로 테두리 거리를 만든다
//						현위치 : m[i][j], 돌 던져진 위치 : m[r][c]
						int diff = Math.max(Math.abs(i-r), Math.abs(j-c));
						int temp = w + p * diff;
						if(temp > 0) {
							m[i][j] += temp;
						}
					}
				}
			}
			long sum = 0; //물결 값의 합
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					sum += m[i][j];
				}
			}
			sb.append("#").append(testCase).append(" ").append(sum).append("\n");
		}//end of for testCase
	System.out.println(sb.toString());
	}//end of main
}//end of class
