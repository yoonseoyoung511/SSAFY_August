import java.util.Arrays;

public class Array07_카운팅정렬 {
	public static void main(String[] args) {
		int[] arr = new int[] { 7, 3, 9, 10, 2, 1 };
		countingSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] countingSort(int[] arr) {
		int N = arr.length;
		// 1. 가장 큰 값을 찾는다. (문제에 따라 음수가 나오는 경우... 고려할 필요가 있다.)
		// 0, 양의 정수로 가정
		int K = -1;
		for (int i = 0; i < N; i++) {
			if (arr[i] > K)
				K = arr[i];
		} // 가장 큰 값은 K에 저장되어 있음!

		// 2. counting하자!
		int[] count = new int[K + 1]; // K까지 인덱스를 활용해야 함!
		for (int i = 0; i < N; i++) {
			int idx = arr[i];
			count[idx] += 1;
			// 위와 아래는 동일함
//		count[arr[i]]++; //익숙하지 않은데 인덱스로 배열 넣는거 비추천
		}

		// 3. 누적합 구하기(경계를 나타냄)
		for (int i = 1; i <= K; i++) {
			count[i] += count[i - 1]; // 내 값과 내 이전 값 더하기
		}

		// 4. 역방향으로 원본 순회하면서 정렬 시작. (안정 정렬)
		//새롭게 저장할 원본과 동일한 크기의 배열이 필요하다!
		int[] sortArr = new int[N];
		for (int i = N-1; i >= 0; i--) {
			int num = arr[i];
			int idx = count[num]-1;
			sortArr[idx] = num;
			count[num]--;
			////////////////////////////////
//			sortArr[--count[arr[i]]] = arr[i]; //위와 같음.
		}
		return sortArr;
	}//end of main
}//end of class
