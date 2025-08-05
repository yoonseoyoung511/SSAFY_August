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
			
			//반복문 수행하면서 처리.
			//무한루프
			while(true) {
				//수평 -> 수직
				for (int i = 0; i < K; i++) {
					
					
				}
			}
			
			
			
		} // tc for문
	}// end of main
}// end of class
