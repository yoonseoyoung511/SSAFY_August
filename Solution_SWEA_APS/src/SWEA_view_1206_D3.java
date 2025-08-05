import java.util.Scanner;

public class SWEA_view_1206_D3 {
	public static void main(String[] args) {
//		카운팅 정렬 : 정렬할 데이터가 index로 사용 가능할 경우만. 
		Scanner sc = new Scanner(System.in);

		for (int k = 1; k <= 10; k++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int[] tmp = new int[4];
			int res = 0;
			// arr 입력받기
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			// 조망권 확인
			for (int i = 2; i < N - 2; i++) {
				tmp[0] = arr[i - 2];
				tmp[1] = arr[i - 1];
				tmp[2] = arr[i + 1];
				tmp[3] = arr[i + 2];
				int max = 0;
				boolean flag = true;
				for (int j = 0; j < tmp.length; j++) { // 조망권 확인
					if (tmp[j] < arr[i]) {
						if (max < tmp[j])
							max = tmp[j];
						continue;
					} else {
						flag = false;
					}
				}
				if (flag) {
					res += arr[i] - max; // 최댓값 뺀 층만큼 조망권 확보
				}
			}
			System.out.println("#" + k + " " + res);
		}
	}
}
