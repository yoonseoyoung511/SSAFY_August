import java.util.Scanner;

public class SWEA_1954_D2_달팽이숫자 {
	public static void main(String[] args) {
		// 입력받기 위해서 Scanner
		Scanner sc = new Scanner(System.in);

		// 테스트케이스 수
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // N*N크기의 배열. 1 <= N <= 10
			int[][] arr = new int[N][N];
			
			int K = N; //이동할 칸의 수
			int D = 1; //증감 1 -> -1 -> 1
			
			int r = 0;
			int c = -1;
			int num = 1;
			//반복문 수행하면서 처리.
			//무한루프
			while(true) {
				//수평 -> 수직 : 이동거리 하나 줄어든다
				for (int i = 0; i < K; i++) {
					c += D;
					arr[r][c] = num++;
				}//수평 채움
				K--;
				//종료조건!
				//1. K==0 : 더이상 이동할 수 없어!
				//2. (r,c) : 중앙 좌표일 때 (주의 필요)
				//3. num == N*N
				
				if(K == 0) break;
				
				//수직 -> 수평 : 증감의 방향이 바뀜
				for (int i = 0; i < K; i++) {
					r += D;
					arr[r][c] = num++;
				}//수직 채움
				D = -D;
			}
			
			System.out.println("#"+tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			
		} // tc for문
	}// end of main
}// end of class
