
public class Array08_2차원배열순회 {
	public static void main(String[] args) {
		// 문제 행/열 크기가 주어지고 다음 줄부터 입력이 주어진다.
//	2 4
//	1 2 3 4
//	5 6 7 8

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 } };

		// 행 우선순회 방식(정방향)
		System.out.println("============행 우선순회 (정방향)============");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		// 행 우선순회 방식(역방향)
		// 1. for문 조건 건드리는 방식
		System.out.println("============행 우선순회 (정방향. for문 조건)============");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("============행 우선순회 (정방향. index)============");
		// 2. index를 건드리는 방식
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int n = arr[i].length;
				System.out.print(arr[i][n - 1 - j] + " ");
			}
			System.out.println();
		}

		System.out.println("============열 우선순회 (정방향)============");
		// 열 우선순회(정방향) -> N*M 일 때 ... 가변길이 배열이면 고정은 위험해
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		// 열 우선순회 (역방향) -> 조건 / Index 건드리기
		// 1. for문 조건 건드리는 방식
		System.out.println("============열 우선순회 (역방향. 조건)============");
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// 2. index를 건드리는 방식
		System.out.println("============열 우선순회 (역방향. index)============");
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				int n = arr.length;
				System.out.print(arr[n-1-i][j] + " ");
			}
			System.out.println();
		}

	}
}
