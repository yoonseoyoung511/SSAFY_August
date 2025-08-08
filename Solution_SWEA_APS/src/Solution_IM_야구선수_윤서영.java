
import java.util.Arrays;
import java.util.Scanner;

public class Solution_IM_야구선수_윤서영 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testCase = 1; testCase <= T ; testCase++) {
			int N = sc.nextInt(); //선수 수
			int L = sc.nextInt(); //점수 차이
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			//선수 점수 비교
			int tmp = 1;
			int max = 1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(arr[N-i-1] - arr[N-j-1] <= L) {
						tmp = j-i+1;
					}
					if(tmp > max) {
						max = tmp;
					}
				}
			}
			System.out.println("#"+testCase+" "+max);
		}//end of for testCase
	}//end of main
}//end of class
