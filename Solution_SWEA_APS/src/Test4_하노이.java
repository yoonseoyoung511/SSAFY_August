
public class Test4_하노이 {
	public static void main(String[] args) {
		move(3,1,2,3);
	}//end of main
	/** 하노이탑 재귀함수
	N : 몇개 쌓여있는지, from : 출발지 기둥, temp : 보조기둥, to : 도착지 기둥	 */
	private static void move(int N, int from, int temp, int to) {
		if(N == 0) { //종료파트
			
			return;
		} //재귀파트
		
		move(N-1, from, to, temp); //위쪽 덩어리를 보조기둥으로 옮겨
		System.out.printf("%2d : %d -> %d\n", N, from, to); //3번 내꺼를 목적지 기둥으로 옮겨
		move(N-1, temp, from, to); //위쪽 임시기둥에 옮겼던 덩어리를 최종 도착지 기둥으로 옮겨
		
	}
	
	
}//end of class
