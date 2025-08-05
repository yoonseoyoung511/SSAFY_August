
public class Array01_배열의순회 {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6 };
		int N = arr.length; // 7

		System.out.println("정방향순회 ->");
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("역방향순회 <-");
		// 2-1. 반복문의 조건을 건드리는 방법
		for (int i = N - 1; i >= 0; i--) { //이 부분을 건드림. 조건
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 2-2. 인덱스를 건드리는 방법(주의 요망)
		for (int i = 0; i < N; i++) { 
			System.out.print(arr[N-1-i] + " "); //이 부분을 건드림. 인덱스
		}
		System.out.println();
		
		
		/////////////////////////////////////
		//특정 인덱스 기준으로 양쪽으로 퍼지게 순회해보세요.
		//직접 생각해서 작성해보기. 
		//0 1 2 [3] 4 5 6
		//3 2 4 1 5 0 6
		System.out.println("숙제1 : center = 3");
		int center1 = 3;
		System.out.print(arr[center1]+ " ");
		
		for (int i = 0; i < arr.length/2; i++) {
			System.out.print(arr[center1] - i - 1 + " ");
			System.out.print(arr[center1] + i + 1 + " ");
		}
		System.out.println();
		
		//0 1 [2] 3 4 5 6
		//2 1 3 0 4 / 5 6
		System.out.println("숙제2 : center = 2");
		int center2 = 2;
		System.out.print(arr[center2] + " ");
		for(int i = 0 ; i<arr.length/2 + 1; i++) { //범위 지정 어떻게 하면 좋을까?
			if(arr[center2]-i-1 >= 0) {
				System.out.print(arr[center2] - i - 1 + " ");
				System.out.print(arr[center2] + i + 1 + " ");
			} else {
				System.out.print(arr[center2] + i + 1 + " ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
