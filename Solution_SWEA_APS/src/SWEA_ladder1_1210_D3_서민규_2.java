import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 360ms -> 98ms BufferedReader
 * BufferedReader : readLine(); ==  Scanner.nextLine();과 같음!
 * 	한줄을 통째로 읽어가고, 줄바꿈 문자는 제거해준다.
 * 	형변환 안해줌, 예외처리 안해줌 => 직접 사용해야 함 / 그래서 빠른거긴 함
 *  "1" Integer.parseInt, Long.parseLong
 *  "1 1 0 0 0 1" 쪼개서 써야 함. BufferedReader는 readLine으로 한줄 다 받으니까.
 *  => String.split(정규화 표현식)인데, 이거 시간 많이 걸림
 *  => StringTokenizer(정규화 표현식 해석 불가, 오로지 델리미터(구분자)로 쪼개는 기능만 있음)
 * 		쪼갤 때는 StringTokenizer를 사용하는게 젤 좋음~!
 * 		- StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 * 		- 쪼갤 필요가 없는 경우, 쪼개지 않는 (StringTokenizer 사용 안하는) 것이 좋다. [폭이 일정한 경우, 한 자리인 경우]
 * 		- s.charAt(index) - '0'
 * 
 *	<출력시 최적화>
 * BufferedWriter
 * String => StringBuffer(동기화처리됨. 멀티쓰레드 환경에서 사용), StringBuilder(동기화처리 안되어있음)
 * 
 * 
 * 
 * 자료구조 : 
 * 		선형자료구조 : 1:1 관계 / 배열, 연결리스트, 스택, 큐
 * 					쉽다, 순회
 * 		비선형자료구조 : 1:N 관계
 * 					어렵다 : 순회(모든 정점을 빠짐없이 1번씩 방문), 저장, 용어
 * 					- BFS, DFS
 */

public class SWEA_ladder1_1210_D3_서민규_2 {
	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String ss = ""; //출력할 내용
		StringBuilder sb = new StringBuilder();
		for (int testCase = 1; testCase <= 10; testCase++) {
//			sc.nextInt(); //테스트케이스 번호 버림 (소비시킴)
			br.readLine(); //한줄 읽기
			
			//StringTokenizer 없는 ver
			int[][] m = new int[100][102]; //인덱스가 넘어가는 것 방지. 
			for (int i = 0; i < 100; i++) { //행. 0~99
				String s = br.readLine(); // "1 1 0 0 0 1"
				for (int j = 1, index = 0; j <= 100 ; j++, index += 2) { //열. 테두리 둘렀을 때 index 조심, 1~100
					m[i][j] = s.charAt(index) - '0'; //'1' - '0'
				}
			}
				
			//StringTokenizer 있는 ver
//			for (int i = 0; i < 100; i++) { //행. 0~99
//				StringTokenizer st = new StringTokenizer(br.readLine(), " "); //델리미터 = " ". 한줄씩 받아온걸 쪼갬
//				for (int j = 1; j <= 100 ; j++) { //열. 테두리 둘렀을 때 index 조심, 1~100
////					m[i][j] = sc.nextInt();
//					//parseInt, valueOf 둘다 쓸 수 있는데, 최적화를 위해서는 parseInt가 맞음
//					//Integer.parseInt(br.readLine()) 오류 안 나려면 main에 throws Exception!
//					//StringTokenizer로 쪼개진 문자열을 하나씩 넘겨주기. "1" "1" "0" ....
//					m[i][j] = Integer.parseInt(st.nextToken()); //trim : 앞뒤 빈칸 제거. 사이사이는 남아있음
//				}
//			}
				
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
			int dir = 상; //123 상수, 초기값 상
			
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
//			ss += ("#"+testCase+" "+(c-1));
//			ss += new StringBuilder().append("#").append(testCase).append(" ").append(c-1).toString();
			sb.append("#").append(testCase).append(" ").append(c-1);
		}//end of for testCase
//		System.out.println(ss);
		System.out.println(sb.toString());
	}// end of main
}// end of class
