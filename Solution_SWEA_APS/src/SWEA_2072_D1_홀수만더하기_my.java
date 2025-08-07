//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class SWEA_2072_D1_홀수만더하기_my {
	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());
//		for (int i = 0; i < T; i++) {
//			int[] arr = new int[10];
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			int sum = 0;
//			for (int j = 0; j < arr.length; j++) {
//				arr[j] = Integer.parseInt(st.nextToken());
//				if(arr[j] % 2 == 1) {
//					sum += arr[j];
//				}
//			}
//			System.out.printf("#%d %d\n", i+1, sum);
//		}
		
//		홀짝 판별 코드 주의점 :
		int num = 3; //num이 음수까지 가능할 경우 조심
		if(num % 2 == 0) { //1, -1말고 0 기준으로 조건 세우기
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
//		a % b = a / b * b => 소수부분 잘리고 정수부분만 남음
		System.out.println(7%2);
		System.out.println(7-7 / 2*2);
		
		System.out.println(-3%2);
		System.out.println(-3 - -3 / 2 * 2);
		
		
	}
}
