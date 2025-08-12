import java.util.Scanner;

public class Solution_IM_경비원_윤서영 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for (int testCase = 1; testCase <= 50; testCase++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			//감시원 위치
			int R = 0;
			int C = 0;
			int count = 0; //0 총 개수
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(arr[i][j] == 2) {
						R = i;
						C = j;
					}
					if(arr[i][j] == 0)
						count++;
				}
			}
			//감시원 상하좌우 검사
//			int left = 0;
//			int right = 0;
//			int up = 0;
//			int down = 0;
//			int sum = 0;
			int[] dy = {1,-1,0,0};
			int[] dx = {0,0,1,-1};
			int x,y;
			x = 1;
			y = 2;
			for(int i=0;i<4;i++)
			{
				int nextX = x+dx[i];
				int nextY = y+dy[i];

			}
			
			
			for (int i = 0; i < n-R; i++) {
				for (int j = 0; j < n-C; j++) {
					//좌
					if(arr[R][C-j] == 1) {
						left = j-1;
						break;
					}
					else 
						left = n-C-1;
					//우
					//c+j가 5 넘어가면 안됨
					//j를 5-c
					if(arr[R][C+j] == 1) {
						right = j-1;
						break;
					}
					else 
						right = n-C-1;
					//상
					if(arr[R-i][C] == 1) {
						up = i-1;
						break;
					}
					else 
						up = n-R-1;
					//하
					if(arr[R+i][C] == 1) {
						down = i-1;
						break;
					}
					else 
						down = n-R-1;
				}
			}
			System.out.println(left);
			System.out.println(right);
			System.out.println(up);
			System.out.println(down);
			sum = left+right+up+down;
			sb.append("#").append(testCase).append(" ").append(count-sum);
			System.out.println(sb.toString());
		} // end of for testCase
	}//end of main
}//end of class
