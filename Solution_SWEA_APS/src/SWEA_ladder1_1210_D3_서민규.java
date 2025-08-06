import java.util.Scanner;
/**
 * 360ms -> 120ms
 * 자료구조 : 
 * 		선형자료구조 : 1:1 관계 / 배열, 연결리스트, 스택, 큐
 * 					쉽다, 순회
 * 		비선형자료구조 : 1:N 관계
 * 					어렵다 : 순회(모든 정점을 빠짐없이 1번씩 방문), 저장, 용어
 * 					- BFS, DFS
 */

public class SWEA_ladder1_1210_D3_서민규 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int testCase = 1; testCase <= 10; testCase++) {
			sc.nextInt(); //테스트케이스 번호 버림 (소비시킴)
			int[][] m = new int[100][102]; //인덱스가 넘어가는 것 방지. 
			for (int i = 0; i < 100; i++) { //행. 0~99
				for (int j = 1; j <= 100 ; j++) { //열. 테두리 둘렀을 때 index 조심, 1~100
					m[i][j] = sc.nextInt();
				}
			}
//		맨 마지막 줄에서 2(도착지점)을 찾기
			int r = 99;
			int c = -1; //2의 위치;
			for (int i = 1; i <= 100; i++) {
				if(m[99][i] == 2) {
					c = i;
					break; //찾았으면 나가라
				}
			}
			final int 상 = 1;
			final int 좌 = 2;
			final int 우 = 3;
			int dir = 상; //123 상수
//		반복으로 탐색, BFS/DFS할 필요없음. 외길이니까.
			while(r > 0) { //꼭대기에 도착할 때까지 반복
				if(dir != 우 && m[r][c-1] == 1) { // 왼쪽이 갈 수 있으면 턴
					dir = 좌;
					c--;
				} else if(dir != 좌 && m[r][c+1] == 1) { // 오른쪽 갈 수 있으면 턴
					dir = 우;
					c++;
				} else { //위로 올라가
					dir = 상;
					r--;
				}
			}
//		지그재그 무한루프 막으려면 : 방문체크, 지나온 길은 없애버림, 방향을 제어
			System.out.println("#"+testCase+" "+(c-1));
		}//end of for testCase
	}// end of main
}// end of class
