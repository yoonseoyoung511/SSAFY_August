import java.util.Scanner;

public class Array02_스캐너 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트케이스 수를 입력받는다.
		for (int tc = 0; tc < T; tc++) {
			int ans = 0;

			// 정답 출력할 때 #tc ans
			System.out.println("#" + tc + " " + ans);

		} // tc반복문
	}// main
}
