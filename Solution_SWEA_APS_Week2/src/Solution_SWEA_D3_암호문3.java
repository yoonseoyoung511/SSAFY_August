import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_D3_암호문3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			int N = Integer.parseInt(br.readLine()); //원본 암호문 개수
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); //원본 암호문
			int[] pw = new int[N];
			for (int i = 0; i < N; i++) {
				pw[i] = Integer.parseInt(st.nextToken());
			}
			
			int M = Integer.parseInt(br.readLine()); //명령어 개수
			
			StringTokenizer cmd = new StringTokenizer(br.readLine()," ");
			//M번 명령어 반복.
			for (int i = 0; i < M; i++) {
				
				char c = cmd.nextToken().charAt(i); //i 아니긴 한데 일단.
				int x, y;
				int[] s = new int[y];
				
				switch (c) {
				case 'I':
//			삽입 I x y s
//			0~x개 암호문 바로 다음에 y개의 암호문 삽입. 암호문 : s
					x = Integer.parseInt(cmd.nextToken());
					y = Integer.parseInt(cmd.nextToken());
					for (int j = 0; j < y; j++) {
						s[i] = Integer.parseInt(cmd.nextToken());
					}
					
//					arr[x+1]부터 s배열을 추가하면 됨. 바꾸면 안됨요..
					
					
					
					
					
					
					
					break;
//			삭제 D x y
//			x번째 암호문 바로 다음부터 y개의 암호문 삭제
				case 'D':
					
					break;
//			추가 A y s
//			맨 뒤에 y개의 암호문 덧붙임.
				case 'A':
					
					break;

				default:
					break;
				}
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			

			
			
			
			
			
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}//end of for testCase
		
		
		
		
		
		
		
		
		
		
	}
}
